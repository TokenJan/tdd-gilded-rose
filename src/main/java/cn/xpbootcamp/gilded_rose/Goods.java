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
            super.decreaseQuality(2);
        } else {
            super.decreaseQuality(1);
        }
    }

    public Goods(int sellIn, int quality) {
        super(sellIn, quality);
    }
}
