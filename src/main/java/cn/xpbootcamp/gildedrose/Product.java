package cn.xpbootcamp.gildedrose;

public class Product {
    String name;
    String type;
    int sellIn;
    int quality;
    static final String COMMON_PRODUCT_TYPE = "COMMON_PRODUCT_TYPE";
    static final String AGED_BRIE_TYPE = "AGED_BRIE_TYPE";
    static final String SULFURAS_TYPE = "SULFURAS_TYPE";
    static final String BACKSTAGE_PASS_TYPE = "BACKSTAGE_PASS_TYPE";


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public Product(String name, String type, int sellIn, int quality) {
        this.name =name;
        this.type = type;
        this.sellIn = sellIn;
        this.quality = quality;
    }
}
