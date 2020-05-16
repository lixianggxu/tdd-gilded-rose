package cn.xpbootcamp.gildedrose;

public class BackstagePassProduct extends Product {
    public BackstagePassProduct(int quality, int sellIn) {
        super(quality, sellIn);
    }

    @Override
    public void passDay() {
        quality = quality + 1;
        sellIn = sellIn - 1;
    }
}
