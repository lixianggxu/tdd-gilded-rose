package cn.xpbootcamp.gildedrose;

public class Product {

    int sellIn;
    int quality;

    public Product(int quality, int sellIn) {
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public Product(int quality) {

        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void passDay() {
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    public int getSellIn() {
        return sellIn;
    }
}
