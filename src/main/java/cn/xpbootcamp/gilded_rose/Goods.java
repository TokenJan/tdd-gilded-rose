package cn.xpbootcamp.gilded_rose;

import lombok.Getter;

@Getter
public class Goods extends AbstractGoods {

    @Override
    void changeSellInByDay() {
        super.decreaseSellIn();
    }

    @Override
    void changeQualityByDay() {
        if (super.getSellIn() == MINIMUM_SELLIN) {
            super.changeQuality(-2);
        } else {
            super.changeQuality(-1);
        }
    }

    public Goods(int sellIn, int quality) {
        super(sellIn, quality);
    }
}
