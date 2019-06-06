package com.zhc;


import com.zhc.util.*;
import com.zhc.visitor.*;

/**
 * 访问者模式
 * 访问者模式是对象的行为模式
 * 访问者模式的目的是封装一些施加于某种数据结构元素之上的操作。
 * 一旦这些操作需要修改的话，接受这个操作的数据结构则可以保持不变。
 *
 *
 * 静态分派(Static Dispatch)发生在编译时期，分派根据静态类型信息发生。静态分派对于我们来说并不陌生，方法重载就是静态分派。
 * 动态分派(Dynamic Dispatch)发生在运行时期，动态分派动态地置换掉某个方法。
 * 双重分派
 *
 * */
public class Main {

    public static void main(String arg[]){

        //静态分派  以骑马为例子  骑白马还是黑马  方法的重载
        // 结果全部都是骑马
        // 为什么呢？两次对ride()方法的调用传入的是不同的参数，也就是wh和bh。它们虽然具有不同的真实类型，但是它们的静态类型都是一样的，均是Horse类型。
        // 重载方法的分派是根据静态类型进行的，这个分派过程在编译时期就完成了

        Horse horse=new Horse();
        Horse wh = new WhiteHorse();
        Horse bh = new BlackHorse();

        Person person=new Person();
        person.ride(horse);
        person.ride(wh);
        person.ride(bh);

        // 动态分派 马吃草的例子  方法的重写
        // 变量h的静态类型是Horse，而真实类型是BlackHorse。
        // 如果上面最后一行的eat()方法调用的是BlackHorse类的eat()方法，
        // 那么上面打印的就是“黑马吃草”；相反，如果上面的eat()方法调用的是Horse类的eat()方法，
        // 那么打印的就是“马吃草”。
        // 所以，问题的核心就是Java编译器在编译时期并不总是知道哪些代码会被执行，
        // 因为编译器仅仅知道对象的静态类型，
        // 而不知道对象的真实类型；而方法的调用则是根据对象的真实类型，
        // 而不是静态类型。这样一来，上面最后一行的eat()方法调用的是BlackHorse类的eat()方法，
        // 打印的是“黑马吃草”。
        Horse h=new BlackHorse();
        h.eat();


        // 双重分派
        //组合1
        //  系统运行时，会首先创建SubWest1和SubEast1对象，然后客户端调用SubEast1的goEast()方法，
        // 并将SubWest1对象传入。由于SubEast1对象重写了其超类East的goEast()方法，
        // 因此，这个时候就发生了一次动态的单分派。当SubEast1对象接到调用时，会从参数中得到SubWest1对象，
        // 所以它就立即调用这个对象的goWest1()方法，并将自己传入。由于SubEast1对象有权选择调用哪一个对象，
        // 因此，在此时又进行一次动态的方法分派。
        //　这个时候SubWest1对象就得到了SubEast1对象。
        // 通过调用这个对象myName1()方法，就可以打印出自己的名字和SubEast对象的名字
        East east = new SubEast1();
        West west = new SubWest1();
        east.goEast(west);

        //组合2
        east = new SubEast1();
        west = new SubWest2();
        east.goEast(west);


        /**
         * 访问者模式涉及角色
         * 抽象访问者Visitor: 声明了一个或者多个方法操作，形成所有的具体访问者角色必须实现的接口
         * 具体访问者ConcreteVisitor: 实现抽象访问者所声明的接口，也就是抽象访问者所声明的各个访问操作
         * 抽象节点Node: 声明一个接受操作，接受一个访问者对象作为一个参数。
         * 具体节点ConcreteNode: 实现了抽象节点所规定的接受操作。
         * 结构对象ObjectStructure: 有如下的责任，可以遍历结构中的所有元素；如果需要，提供一个高层次的接口让访问者对象可以访问每一个元素；如果需要，
         * 可以设计成一个复合对象或者一个聚集，如List或Set
         *
         * */

        //创建一个结构对象
        ObjectStructrue os=new ObjectStructrue();

        //给结构增加一个A节点
        os.add(new NodeA());

        //给结构增加一个A节点
        os.add(new NodeA());
        os.add(new NodeB());
        //创建一个访问者
        Visitor visitor=new VisitorA();
        os.action(visitor);



        //　虽然在这个示意性的实现里并没有出现一个复杂的具有多个树枝节点的对象树结构，
        // 但是，在实际系统中访问者模式通常是用来处理复杂的对象树结构的，
        // 而且访问者模式可以用来处理跨越多个等级结构的树结构问题。
        // 这正是访问者模式的功能强大之处。
    }

}
