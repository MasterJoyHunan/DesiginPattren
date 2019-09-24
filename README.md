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
> 
# 行为型模式
+ [观察者模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/observer)
> 
+ [模板方法模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/template_method)
> 
+ [命令模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/command)
> 
+ [状态模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/state)
> 
+ [责任链模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/chain_of_responsibility)
> 
+ [解释器模式](https://github.com/MasterJoyHunan/DesiginPattren/tree/master/src/interpreter)
> 
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