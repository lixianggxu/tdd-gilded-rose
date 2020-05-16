package cn.xpbootcamp.gildedrose;

public class CommonProduct extends Product {
    public CommonProduct(int quality, int sellIn) {
        super(quality, sellIn);
    }

    @Override
    public void passDay() {
        if (sellIn <= 0) {
            quality--;
        }
        quality = Math.max(quality - 1, 0);
        sellIn = sellIn - 1;
    }

}
