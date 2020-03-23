package cn.xpbootcamp.gilded_rose;

import lombok.Getter;

@Getter
public class Goods extends AbstractGoods {

    @Override
    void changeSellInByDay() {
        if (super.getSellIn() > 0) {
            super.setSellIn(super.getSellIn() - 1);
        }
    }

    @Override
    void changeQualityByDay() {
        if (super.getSellIn() == 0) {
            super.setQuality(super.getQuality() - 2);
        } else {
            super.setQuality(super.getQuality() - 1);
        }

        if (super.getQuality() < 0) {
            super.setQuality(0);
        }
    }

    public Goods(int sellIn, int quality) {
        super(sellIn, quality);
    }
}
