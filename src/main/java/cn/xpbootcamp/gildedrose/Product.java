package cn.xpbootcamp.gildedrose;

public class Product {

    int sellIn;
    int quality;

    public Product(int quality, int sellIn) {
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void passDay() {
    }

    public int getQuality() {
        return quality;
    }

    public int getSellIn() {
        return sellIn;
    }
}