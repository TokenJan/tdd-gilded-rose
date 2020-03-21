package cn.xpbootcamp.gilded_rose;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Goods {

    private Integer sellIn;

    private Integer quality;

    void dayPasses() {
        this.sellIn -= 1;
        this.quality -= 1;
    }
}
