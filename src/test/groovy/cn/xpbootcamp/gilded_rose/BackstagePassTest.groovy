package cn.xpbootcamp.gilded_rose

import spock.lang.Specification

class BackstagePassTest extends Specification {

    void "given Backstage Pass quality equals 5 sellin equals 15 when day passes then quality equals 6 and sellin equals 14"() {
        given:
        def backstagePass = new BackstagePass(15, 5)

        when:
        backstagePass.dayPasses()

        then:
        backstagePass.getQuality() == 6
        backstagePass.getSellIn() == 14
    }

    void "given Backstage Pass quality equals 50 sellin equals 15 when day passes then quality equals 50 and sellin equals 14"() {
        given:
        def backstagePass = new BackstagePass(15, 50)

        when:
        backstagePass.dayPasses()

        then:
        backstagePass.getQuality() == 50
        backstagePass.getSellIn() == 14
    }

    void "given Backstage Pass sellin between 6 and 10 when day passes then quality increase 2"(int sellIn, int quality, int newSellIn, int newQuality) {
        expect:
        def backstagePass = new BackstagePass(sellIn, quality)
        backstagePass.dayPasses()
        newSellIn == backstagePass.getSellIn()
        newQuality == backstagePass.getQuality()

        where:
        sellIn | quality || newSellIn || newQuality
        6      | 5       || 5         || 7
        7      | 5       || 6         || 7
        8      | 5       || 7         || 7
        9      | 5       || 8         || 7
        10     | 5       || 9         || 7
    }

    void "given Backstage Pass sellin between 1 and 5 when day passes then quality increase 3"(int sellIn, int quality, int newSellIn, int newQuality) {
        expect:
        def backstagePass = new BackstagePass(sellIn, quality)
        backstagePass.dayPasses()
        newSellIn == backstagePass.getSellIn()
        newQuality == backstagePass.getQuality()

        where:
        sellIn | quality || newSellIn || newQuality
        1      | 5       || 0         || 8
        2      | 5       || 1         || 8
        3      | 5       || 2         || 8
        4      | 5       || 3         || 8
        5      | 5       || 4         || 8
    }

    void "given Backstage Pass quality equals 5 sellin equals 0 when day passes then quality equals 0 and sellin equals 0"(int sellIn, int quality, int newSellIn, int newQuality) {

        expect:
        def backstagePass = new BackstagePass(sellIn, quality)
        backstagePass.dayPasses()
        newSellIn == backstagePass.getSellIn()
        newQuality == backstagePass.getQuality()

        where:
        sellIn | quality || newSellIn || newQuality
        0      | 5       || -1        || 0
    }
}
