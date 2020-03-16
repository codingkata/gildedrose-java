# Java模板项目

这是一个基于Maven的基础项目, 主要用于练习重构技术。

## 克隆和运行
* 克隆本项目
* 在命令行下执行 `mvn test`，或者导入到 IDE，运行测试，看到测试运行通过
* 在命令行下执行 `mvn clean compile assembly:single` ,可以在`${basedir}/target/`生成jar文件，名为`demo-1.0-SNAPSHOT-jar-with-dependencies.jar`
* 在`${basedir}/target/`目录下，运行命令`java -jar demo-1.0-SNAPSHOT-jar-with-dependencies.jar`可以打印`this is the main method`.

## 已存在代码说明

`gildedRose(镶金玫瑰)`是一个杂货店的招牌。
这个程序是杂货店老板用来管理各类物品价值和有效期。

在程序中，用`quality`表示其品质，也就是价格；用`sellIn`表示有效期。

	- 每种物品都具备一个`SellIn`值，表示我们要在多少天之前把物品卖出去，即有效期
	- 每种的物品都具备一个`Quality`值，表示物品的品质
	- 每天结束时，系统会降低每种物品的这两个数值
	- 一旦超过有效期，品质`quality`会以双倍速度加速下降。
	- 当然，物品的品质`quality`永远不会为负值。

然而，物品中有几类特殊物品，它们是：

- 音乐会的后台门票 `Backstage passes to a TAFKAL80ETC concert`
  - 它的品质`Quality`会随着时间推移而提高
  - 当还剩10天或更少的时候，品质`Quality`每天提高2
  - 当还剩5天或更少的时候，品质`Quality`每天提高3
  - 一旦过期，品质就会降为0
- 一种老奶酪 `Aged Brie`
  - 它的品质`Quality`会随着时间推移而提高
  - 但是，它的品质`Quality`也永远不会超过50
- 一种纪念品 `Sulfuras, Hand of Ragnaros`
  - 它永久有效，即：它的品质`Quality`是80，且永远不变。

## 对程序的新需求如下：

最近签约了一个召唤物品`Conjured`的供应商。因此，需要对程序进行升级。
因为这个 `Conjured`的品质`Quality`下降速度比正常物品快一倍。

## 程序升级的约束

不要修改Item类或其属性。因为它代表的是由第三方提供的闭源代码。
你无法修改第三方代码。






