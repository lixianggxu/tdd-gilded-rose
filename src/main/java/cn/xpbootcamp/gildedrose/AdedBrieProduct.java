package cn.xpbootcamp.gildedrose;

public class AdedBrieProduct extends Product {

    public AdedBrieProduct(int quality, int sellIn) {
        super(quality, sellIn);
    }

    @Override
    public void passDay() {
        quality = quality + 1;
        sellIn = sellIn - 1;
    }

}
