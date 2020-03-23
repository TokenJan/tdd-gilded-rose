package cn.xpbootcamp.gilded_rose;

import lombok.Getter;

@Getter
public class Sulfuras extends AbstractGoods {

    @Override
    void changeSellInByDay() { }

    @Override
    void changeQualityByDay() { }

    public Sulfuras(int quality) {
        super(null, quality);
    }
}
