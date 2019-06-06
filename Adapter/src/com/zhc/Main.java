package com.zhc;

import com.zhc.living.A;
import com.zhc.util.Adaptee;
import com.zhc.util.Adapter;
import com.zhc.util.Adapter2;

/**
 * 适配器模式
 * 适配器模式把一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
 *
 * 适配器模式的用途
 * 　　用电器做例子，笔记本电脑的插头一般都是三相的，即除了阳极、阴极外，还有一个地极。而有些地方的电源插座却只有两极，没有地极。电源插座与笔记本电脑的电源插头不匹配使得笔记本电脑无法使用。
 * 这时候一个三相到两相的转换器（适配器）就能解决此问题，而这正像是本模式所做的事情。
 *
 * 适配器模式的结构
 * 　　适配器模式有类的适配器模式和对象的适配器模式两种不同的形式。
 *
 * */

public class Main {
    public static void main(String arg[]){
        //类的适配器模式  Adaptee源   Adpater适配器  Target需要的接口
        //通过实现Target接口和继承Adaptee类 重写方法 实现适配器
        Adapter adapter=new Adapter();
        adapter.sampleOperation1();
        adapter.sampleOperation2();

        //   对象的适配器模式
        //   与类的适配器模式一样，对象的适配器模式把被适配的类的API转换成为目标类的API，与类的适配器模式不同的是，
        //对象的适配器模式不是使用继承关系连接到Adaptee类，而是使用委派关系连接到Adaptee类

        Adapter2 adapter2=new Adapter2(new Adaptee());
        adapter2.sampleOperation1();
        adapter2.sampleOperation2();


//   ●　　类适配器使用对象继承的方式，是静态的定义方式；而对象适配器使用对象组合的方式，是动态组合的方式。
//
//　　●　　对于类适配器，由于适配器直接继承了Adaptee，使得适配器不能和Adaptee的子类一起工作，因为继承是静态的关系，当适配器继承了Adaptee后，就不可能再去处理  Adaptee的子类了。
//
//　　　　 对于对象适配器，一个适配器可以把多种不同的源适配到同一个目标。换言之，同一个适配器可以把源类和它的子类都适配到目标接口。因为对象适配器采用的是对象组合的关系，只要对象类型正确，是不是子类都无所谓。
//
//　　●　  对于类适配器，适配器可以重定义Adaptee的部分行为，相当于子类覆盖父类的部分实现方法。
//
//　　　　 对于对象适配器，要重定义Adaptee的行为比较困难，这种情况下，需要定义Adaptee的子类来实现重定义，然后让适配器组合子类。虽然重定义Adaptee的行为比较困难，但是想要增加一些新的行为则方便的很，而且新增加的行为可同时适用于所有的源。
//
//　　●　　对于类适配器，仅仅引入了一个对象，并不需要额外的引用来间接得到Adaptee。
//
//　　　　 对于对象适配器，需要额外的引用来间接得到Adaptee。
//
//　　建议尽量使用对象适配器的实现方式，多用合成/聚合、少用继承。当然，具体问题具体分析，根据需要来选用实现方式，最适合的才是最好的。




        // 缺省适配模式  实例
        A a=new A();
        System.out.println(a.getName());


    }
}
