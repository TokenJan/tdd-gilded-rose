package cn.xpbootcamp.gilded_rose

import spock.lang.Specification

class SulfurasTest extends Specification {

    void "given Sulfuras quality equals 4 when day passes then quality equals 4"() {
        given:
        def sulfuras = new Sulfuras(4)

        when:
        sulfuras.dayPasses()

        then:
        sulfuras.getQuality() == 4
    }

    void "given Sulfuras quality equals 50 when day passes then quality equals 50"() {
        given:
        def sulfuras = new Sulfuras(50)

        when:
        sulfuras.dayPasses()

        then:
        sulfuras.getQuality() == 50
    }

    void "given Sulfuras quality equals 0 when day passes then quality equals 0"() {
        given:
        def sulfuras = new Sulfuras(0)

        when:
        sulfuras.dayPasses()

        then:
        sulfuras.getQuality() == 0
    }
}
