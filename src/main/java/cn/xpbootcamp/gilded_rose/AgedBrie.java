package cn.xpbootcamp.gilded_rose;

import lombok.Getter;

@Getter
public class AgedBrie extends AbstractGoods {

    @Override
    void changeSellInByDay() { }

    @Override
    void changeQualityByDay() {
        super.setQuality(super.getQuality() + 1);
        if (super.getQuality() > MAXIMUM_QUALITY) {
            super.setQuality(MAXIMUM_QUALITY);
        }
    }

    public AgedBrie(int quality) {
        super(null, quality);
    }
}
