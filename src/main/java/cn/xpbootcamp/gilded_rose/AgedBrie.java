package cn.xpbootcamp.gilded_rose;

import lombok.Getter;

@Getter
public class AgedBrie extends AbstractGoods {

    @Override
    void changeSellInByDay() {
        super.decreaseSellIn();
    }

    @Override
    void changeQualityByDay() {
        super.changeQuality(1);
    }

    public AgedBrie(int sellIn, int quality) {
        super(sellIn, quality);
    }
}
