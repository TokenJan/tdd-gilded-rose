package cn.xpbootcamp.gilded_rose;

import lombok.Getter;

@Getter
public class BackstagePass extends AbstractGoods {

    private static final int TEN_DAYS = 10;

    @Override
    void changeSellInByDay() {
        super.decreaseSellIn();
    }

    @Override
    void changeQualityByDay() {
        if (super.getSellIn() < TEN_DAYS) {
            super.increaseQuality(2);
        } else {
            super.increaseQuality(1);
        }
    }

    public BackstagePass(int sellIn, int quality) {
        super(sellIn, quality);
    }
}
