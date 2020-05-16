# TDD @Gilded Rose


## 开发环境
 - JDK1.8+
 
## 业务需求

"镶金玫瑰"！这是一家魔兽世界里的小商店。出售的商品也都是高质量的。但不妙的是，随着商品逐渐接近保质期，它们的质量也不断下滑。我们用一个IT系统来更新库存信息。

首先，简单介绍一下我们的系统：

- 所有商品都有一个`SellIn`值，这是商品距离过期的天数，最好在这么多天之内卖掉
- 所有商品都有一个`Quality`值，代表商品的价值
- 商品的`SellIn`值和`Quality`值，它们每天会发生变化，但是会有特例


商品的价格规则说明如下：

- 商品的价值永远不会小于0，也永远不会超过50：一般商品 保质期内，每天价值下降1点；
- 一旦过了保质期，`Quality`就以双倍的速度下滑
- 陈年干酪（`Aged Brie`）是一种特殊的商品，放得越久，价值反而越高：保质期内，每天价值上升1点，过了保质期，每天上升2点；
- 萨弗拉斯（`Sulfuras`）是一种传奇商品，没有保质期的概念，价值也不会下滑
- 后台门票（`Backstage pass`）和陈年干酪（`Aged Brie`）有相似之处：
	- 越接近演出日，商品的价值反而上升
	- 在演出前10天，价值每天上升2点（前6天～前10天，按照2个点）
	- 演出前5天，价值每天上升3点（前5天——前1天，3个点）
	- 一旦过了演出日，价值就马上变成0

 
商品属性：
SellIn,还剩下的保质期
Quality,商品当前价值
增长，减少点价值；



##tasking:
1.Given 普通商品当前价值=30，剩余保质期=10， When 1天过去， Then 此时，商品价值=29，剩余保质期=9. done
2. Given 普通商品当前价值=0，剩余保质期=10， When 1天过去 ，Then 此时，商品价值=0，剩余保质期=9. done
3. Given 普通商品当前价值=10，剩余保质期=0， When 1天过去， Then 此时，商品价值=8，剩余保质期=-1. done
4. Given 普通商品价值=0，剩余保质期=0， When 1天过去 Then 此时，商品价值=0，剩余保质期=-1. done
5. Given 陈年干酪当前价值=30，剩余保质期=30， When 1天过去 Then 此时，陈年干酪价值=31，剩余保质期=29. done
6. Given 陈年干酪当前价值=50，剩余保质期=10， When 1天过去 Then 此时，陈年干酪价值=50，剩余保质期=9. done
7. Given 陈年干酪当前价值=30，剩余保质期=0， When 1天过去 Then 此时，陈年干酪价值=32，剩余保质期=-1. done
8. Given 陈年干酪当前价值=50，剩余保质期=0， When 1天过去 Then 此时，陈年干酪价值=50，剩余保质期=-1. done
9. Given 萨弗拉斯A当前价值=30，When 1过去， Then 此时，萨弗拉斯A价值=30.done
10. Given 萨弗拉斯A当前价值=0，When 1过去， Then 此时，萨弗拉斯A价值=0.done
11. Given 萨弗拉斯A当前价值=50，When 1过去， Then 此时，萨弗拉斯A价值=50. done
12. Given 后面门票当前价值=2，演唱会前20天， When 1天过去 Then 此时，商品价值=3，演唱会前19天. done
13. Given 后面门票当前价值=20，演唱会前10天， When 1天过去 Then 此时，商品价值=22，演唱会前9天.done
14. Given 后面门票当前价值=20，演唱会前5天， When 1天过去 Then 此时，商品价值=23，演唱会前4天.done
15. Given 后面门票当前价值=50，演唱会当天， When 1天过去 Then 此时，商品价值=0，演唱会后1天. done
16. Given 后面门票当前价值=50，演唱会前20天 When 1天过去 Then 此时，商品价值=50，演唱会前19天.done
17. Given 后面门票当前价值=50，演唱会前10天 When 1天过去 Then 此时，商品价值=50，演唱会前9天. done
18. Given 后面门票当前价值=50，演唱会前5天 When 1天过去 Then 此时，商品价值=50，演唱会前4天.done
