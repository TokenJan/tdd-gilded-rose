package cn.xpbootcamp.gilded_rose;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class AbstractGoods {

    public static final int ZERO_SELLIN_DAY = 0;
    public static final int MINIMUM_QUALITY = 0;
    public static final int MAXIMUM_QUALITY = 50;
    private Integer sellIn;
    private Integer quality;


    final void dayPasses() {
        changeQualityByDay();
        changeSellInByDay();
    }

    void changeQuality(int quality) {
        this.quality += quality;
        if (this.quality < MINIMUM_QUALITY) {
            this.quality = MINIMUM_QUALITY;
        }
        if (this.quality > MAXIMUM_QUALITY) {
            this.quality = MAXIMUM_QUALITY;
        }
    }

    void decreaseSellIn() {
        this.sellIn -= 1;
    }

    abstract void changeSellInByDay();

    abstract void changeQualityByDay();
}
