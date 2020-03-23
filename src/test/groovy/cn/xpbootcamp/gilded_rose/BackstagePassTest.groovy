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

    void "given Backstage Pass quality equals 5 sellin equals 10 when day passes then quality equals 7 and sellin equals 9"() {
        given:
        def backstagePass = new BackstagePass(10, 5)

        when:
        backstagePass.dayPasses()

        then:
        backstagePass.getQuality() == 7
        backstagePass.getSellIn() == 9
    }

    void "given Backstage Pass quality equals 5 sellin equals 5 when day passes then quality equals 8 and sellin equals 4"() {
        given:
        def backstagePass = new BackstagePass(5, 5)

        when:
        backstagePass.dayPasses()

        then:
        backstagePass.getQuality() == 8
        backstagePass.getSellIn() == 4
    }

    void "given Backstage Pass quality equals 5 sellin equals 1 when day passes then quality equals 8 and sellin equals 0"() {
        given:
        def backstagePass = new BackstagePass(1, 5)

        when:
        backstagePass.dayPasses()

        then:
        backstagePass.getQuality() == 8
        backstagePass.getSellIn() == 0
    }

    void "given Backstage Pass quality equals 5 sellin equals 0 when day passes then quality equals 0 and sellin equals 0"() {
        given:
        def backstagePass = new BackstagePass(0, 5)

        when:
        backstagePass.dayPasses()

        then:
        backstagePass.getQuality() == 0
        backstagePass.getSellIn() == 0
    }
}
