package cn.xpbootcamp.gildedrose;

public class AdedBrieProduct extends Product {

    public AdedBrieProduct(int quality, int sellIn) {
        super(quality, sellIn);
    }

    @Override
    public void passDay() {

        quality = Math.min(quality + 1, 50);
        sellIn = sellIn - 1;
    }

}
