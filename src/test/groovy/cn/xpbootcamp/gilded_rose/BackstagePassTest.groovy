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
}
