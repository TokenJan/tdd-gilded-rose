package cn.xpbootcamp.gilded_rose;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Goods {

    private Integer sellIn;

    private Integer quality;

    void dayPasses() {
        changeSellInByDay();
        changeQualityByDay();
    }

    private void changeSellInByDay() {
        if (sellIn > 0) {
            this.sellIn -= 1;
        }
    }

    private void changeQualityByDay() {
        if (this.sellIn == 0) {
            this.quality -= 2;
        } else {
            this.quality -= 1;
        }
    }
}
