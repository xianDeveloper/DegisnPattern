# 装饰模式

为已有的功能动态的添加更过功能的一种方式；

当系统需要新的功能的时候，新加入的代码，仅仅是为了满足一些只有在特殊情况下才会执行的特殊行为的需要， 装饰模式，提供了非常好的解决方案，
他吧

**需要装饰的功能放置在单独的勒种，并让这个类包装他所需要装饰的对象**

优点:
类中的装饰功能，从类中搬移出去，这样可以简化原有的类，区分核心功能和装饰功能；


使用的时候，一定要注意多装饰的使用先后顺序