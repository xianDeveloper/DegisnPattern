# 观察者模式

当一个对象变化需要同时改变其他对象的时候，而且一般情况，他不知道有多少个对象有待改变
，一个抽象模型有两个方面，其中一方面依赖与另一方面，此时观察者可以用将这辆封装在单独的对象里，让他们各自独立的改变和复用

让耦合的双方都依赖于抽象，而不是依赖于具体，从而使得，各自的变化都不会影响另一边。

另外，可以利用委托来改造观察者模式
