package cn.xpbootcamp.gilded_rose;

import lombok.Getter;

@Getter
public class AgedBrie extends AbstractGoods {

    @Override
    void changeSellInByDay() { }

    @Override
    void changeQualityByDay() {
        super.increaseQuality(1);
    }

    public AgedBrie(int quality) {
        super(null, quality);
    }
}
