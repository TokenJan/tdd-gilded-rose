package cn.xpbootcamp.gilded_rose;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class AbstractGoods {

    private Integer sellIn;

    private Integer quality;

    public void dayPasses() {
        changeSellInByDay();
        changeQualityByDay();
    }

    abstract void changeSellInByDay();

    abstract void changeQualityByDay();
}
