package cn.xpbootcamp.gilded_rose;

import lombok.Getter;

@Getter
public class Goods extends AbstractGoods {

    @Override
    void changeSellInByDay() {
        if (super.getSellIn() > MINIMUM_SELLIN) {
            super.setSellIn(super.getSellIn() - 1);
        }
    }

    @Override
    void changeQualityByDay() {
        if (super.getSellIn() == MINIMUM_SELLIN) {
            super.setQuality(super.getQuality() - 2);
        } else {
            super.setQuality(super.getQuality() - 1);
        }

        if (super.getQuality() < MINIMUM_QUALITY) {
            super.setQuality(MINIMUM_QUALITY);
        }
    }

    public Goods(int sellIn, int quality) {
        super(sellIn, quality);
    }
}
