# 面向对象编程基本的原则

+ 单一职责：一个类只要做好一件事
+ 开放封闭：一个类,应该是可扩展的，而不可修改
+ 依赖倒置：一个类，不应该强依赖另一个类，每个类对另一个类都是可替换的（面向接口编程）
+ 里氏替换：子类继承父类，不应该替换父类的方法
+ 迪米特法则：在类的结构设计上，每一个类都尽量降低成员的访问权限。强化类之间的松耦合
+ 合成/聚合复用：尽量使用合成/聚合，尽量不要使用类继承
+ 配置化: 尽可能使用配置， 而不硬编码


# 创建模式
+ [简单工厂模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/simple_factory)
> 根据参数的不同返回不同类的实例。简单工厂模式专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。
+ [工厂方法模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/factory_method)
> 定义一个创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类     
+ [抽象工厂模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/abstract_factory)
> 提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类
+ [建造者模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/builder)
> 将一个复杂对象的构建与他的表示分离，使得同样的构建过程可以创建不同的表示
+ [单例模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/singleton)
> 保证一个类仅有一个实例，并提供一个访问它全局访问点
+ [原型模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/prototype)
> 用原型实例自定义创建对象的种类，并且通过拷贝这些原型创建新的对象
# 结构型模式
+ [适配器模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/adapter)
> 将一个类的接口转换成客户希望的另外一个接口，使得原本不兼容而不能一起工作的那些类可以一起工作
+ [装饰模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/decorator)
> 动态的给一个对象添加一些额外的职责，就增加功能来说，比生成子类更为灵活
+ [桥接模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/bridge)
> 将抽象部分与它的实现部分分离，使它们可以独立的变化
+ [组合模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/composite)
> 将对象组合成树形结构以表示‘部分’-‘整体’的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性
+ [享元模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/flyweight)
> 运用共享技术有效的支持大量细粒度的对象
+ [代理模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/proxy)
> 为其他对象提供一种代理已控制对这个对象的访问
+ [外观模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/facade)
> 为子系统提供一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用
# 行为型模式
+ [观察者模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/observer)
> 定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态发生变化时，会通知所有的观察者对象，使他们能够自动更新自己
+ [模板方法模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/template_method)
> 定义一个操作中算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
+ [命令模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/command)
> 将一个请求封装为一个对象，从而使你可以用不同的请求对客户进行参数化，对请求排队或记录请求日志，以及可撤销操作
+ [状态模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/state)
> 当一个对象的内在状态改变时允许改变其行为，这个对象看起来像改变了其类
+ [责任链模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/chain_of_responsibility)
> 使多个对象都有机会处理请求，从而避免请求发送者和接收者之间的耦合关系，将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止
+ [解释器模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/interpreter)
> 给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子
+ [中介者模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/mediator)
> 
+ [访问者模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/vositor)
> 
+ [策略模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/strategy)
> 
+ [备忘录模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/facade)
> 
+ [迭代器模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/memento)
> 