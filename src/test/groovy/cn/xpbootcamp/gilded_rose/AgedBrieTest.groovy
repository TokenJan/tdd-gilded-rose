package cn.xpbootcamp.gilded_rose

import spock.lang.Specification

class AgedBrieTest extends Specification {

    void "given AgedBrie quality equals 4 when day passes then quality equals 5"() {
        given:
        def agedBrie = new AgedBrie(10, 4)

        when:
        agedBrie.dayPasses()

        then:
        agedBrie.getSellIn() == 9
        agedBrie.getQuality() == 5
    }

    void "given AgedBrie quality equals 50 when day passes then quality equals 50"() {
        given:
        def agedBrie = new AgedBrie(10, 50)

        when:
        agedBrie.dayPasses()

        then:
        agedBrie.getSellIn() == 9
        agedBrie.getQuality() == 50
    }
}
