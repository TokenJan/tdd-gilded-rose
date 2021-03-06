# TDD「镶金玫瑰商店」

## 业务背景

"镶金玫瑰"！这是一家魔兽世界里的小商店。出售的商品也都是高质量的。但不妙的是，随着商品逐渐接近保质期，它们的质量也不断下滑。我们用一个IT系统来更新库存信息。

首先，简单介绍一下我们的系统：

- 所有商品都有一个`SellIn`值，这是商品的保质期，最好在这么多天之内卖掉
- 所有商品都有一个`Quality`值，代表商品的价值
- 商品的`SellIn`值和`Quality`值，会随着天数的增加而变化，但是会有特例


商品的价格规则说明如下：

- 商品的价值永远不会小于0，也永远不会超过50
- 一旦过了保质期，`Quality`就以双倍的速度下滑
- 陈年干酪（`Aged Brie`）是一种特殊的商品，放得越久，价值反而越高
- 萨弗拉斯（`Sulfuras`）是一种传奇商品，没有保质期的概念，质量也不会下滑
- 后台门票（`Backstage pass`）和陈年干酪（`Aged Brie`）有相似之处：
	- 越接近演出日，随着`SellIn`值的增加，商品价值`Quality`值反而上升
	- 在演出前10天，价值每天上升2点
	- 演出前5天，价值每天上升3点
	- 一旦过了演出日，价值就马上变成0
	
## TASKING
1. 普通商品未过保质期，过一天，保质期和价值都减1。
2. 普通商品过保质期后，过一天，价值减2。
3. 陈年干酪每过一天，价值加1。
4. 萨弗拉斯每过一天，价值不变。
5. 后台门票在演出前10天，价值每天上升2点。
6. 后台门票在演出前5天，价值每天上升3点。
7. 后天门票过了演出日，价值变为0。