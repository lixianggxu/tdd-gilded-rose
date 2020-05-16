package cn.xpbootcamp.gildedrose;

public class BackstagePassProduct extends Product {
    public BackstagePassProduct(int quality, int sellIn) {
        super(quality, sellIn);
    }

    @Override
    public void passDay() {
        if (sellIn <= 10) {
            quality++;
        }
        if (sellIn <= 5) {
            quality++;
        }
        if (sellIn <= 0) {
            quality = 0;
        } else {
            quality = Math.min(quality + 1, 50);
        }
        sellIn = sellIn - 1;
    }
}
