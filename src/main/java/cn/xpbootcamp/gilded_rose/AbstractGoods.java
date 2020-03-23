package cn.xpbootcamp.gilded_rose;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class AbstractGoods {

    public static final int MINIMUM_SELLIN = 0;
    public static final int MINIMUM_QUALITY = 0;
    public static final int MAXIMUM_QUALITY = 50;
    private Integer sellIn;
    private Integer quality;


    public void dayPasses() {
        changeSellInByDay();
        changeQualityByDay();
    }

    abstract void changeSellInByDay();

    abstract void changeQualityByDay();
}
