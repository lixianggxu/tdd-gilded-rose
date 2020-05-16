package cn.xpbootcamp.gildedrose;

class CommonProduct {
    int sellIn;
    int quality;

    public CommonProduct(int quality, int sellIn) {
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void passDay() {
        if (sellIn <= 0) {
            quality--;
        }
        quality = Math.max(quality - 1, 0);
        sellIn = sellIn - 1;
    }

    public int getQuality() {
        return quality;
    }

    public int getSellIn() {
        return sellIn;
    }

}
