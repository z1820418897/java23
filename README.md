# java23
java的23种设计模式

### 单例模式SingletonPattern
      创建一个类的唯一实例，分为懒汉式，饿汉式，  
      饿汉式其实就是在类加载的时候就创建，  
      懒汉式则就是延迟创建。  


### 责任链模式ChainOfResponsibility
      责任链模式，可以使链状，也可以是环形，或者树的分支等结构链，
      由一个个的责任对象按照一定的规则连接起来，当请求到来的时候在责任链上传递，
      存的责任链模式在有一个责任对象处理请求后，就不在传递请求，但这种场景往往不容易碰到，
      不存的的责任链则可以继续进行传递。

### 命令模式Command
      命令模式属于对象的行为模式
      命令模式把一个请求或者操作封装到一个对象中。命令模式允许系统使用不同的请求把客户端参数化，
      对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。

### 访客模式Visitor
      访客模式属于对象的行为模式
      访客模式由客户端创建节点，规定结构，创建访问者，通过把多个节点传入结构对象生成不同的结构
      再用访问者进行访问，最后由访问者放回在其节点上的结果。
### 适配模式
       适配器模式把一个类的接口变换成客户端所期待的另一种接口，
       从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。      