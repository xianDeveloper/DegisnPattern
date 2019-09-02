
## linkes

1, https://www.cnblogs.com/jiujiduilie/p/9191629.html

### 一个依托于spring环境的实现
2, https://juejin.im/post/5d12228de51d45775c73dd1b

### 本demo采用下面这个，实战中，建议采用2，和spring关联起来用
3, https://blog.csdn.net/SkipperKevin/article/details/77370880

注意，对3中原版的代码进行的删减，strategy本身无需strategy了

使用场景，
1，计算某个图形的面积，体积，传入图形的编码，以及对应的计算公式

2，按照付款方式的不同，计算手续费

3，同样退款的时候，根据付款方式，进行扣除不同收付费以及退费处理

问题：
1，其实发现策略只是将if -else ，抽取到了enum或者map中，转成了码表
并没有什么高深的东西，

2，策略和SPI，dubbo的插件主要实现方式，目前看起来，有点类似，都是基于接口编程，


