package cn.xpbootcamp.gilded_rose;

import lombok.Getter;

@Getter
public class BackstagePass extends AbstractGoods {

    private static final int TEN_DAYS = 10;
    private static final int FIVE_DAYS = 5;

    @Override
    void changeSellInByDay() {
        super.decreaseSellIn();
    }

    @Override
    void changeQualityByDay() {
        if (super.getSellIn() == MINIMUM_SELLIN) {
            super.setQuality(0);
        } else if (super.getSellIn() <= FIVE_DAYS) {
            super.changeQuality(3);
        } else if (super.getSellIn() <= TEN_DAYS) {
            super.changeQuality(2);
        } else {
            super.changeQuality(1);
        }
    }

    public BackstagePass(int sellIn, int quality) {
        super(sellIn, quality);
    }
}
