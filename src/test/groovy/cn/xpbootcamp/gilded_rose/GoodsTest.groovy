package cn.xpbootcamp.gilded_rose

import spock.lang.Specification

class GoodsTest extends Specification {

    void "given normal goods quality equals 4 and sellIn equals 5 when day passes then quality equals 3 and sellIn equals 4"() {
        given:
        def good = new Goods(5, 4)

        when:
        good.dayPasses()

        then:
        good.getSellIn() == 4
        good.getQuality() == 3
    }

    void "given normal goods quality equals 4 and sellIn equals 0 when day passes then quality equals 2 and sellIn equals 0"() {
        given:
        def good = new Goods(0, 4)

        when:
        good.dayPasses()

        then:
        good.getSellIn() == -1
        good.getQuality() == 2
    }

    void "given normal goods quality equals 0 and sellIn equals 0 when day passes then quality equals 0 and sellIn equals 0"() {
        given:
        def good = new Goods(0, 0)

        when:
        good.dayPasses()

        then:
        good.getSellIn() == -1
        good.getQuality() == 0
    }
}
