package cn.xpbootcamp.gilded_rose;

import lombok.Getter;

@Getter
public class BackstagePass extends AbstractGoods {

    @Override
    void changeSellInByDay() {
        super.decreaseSellIn();
    }

    @Override
    void changeQualityByDay() {
        super.increaseQuality(1);
    }

    public BackstagePass(int sellIn, int quality) {
        super(sellIn, quality);
    }
}
