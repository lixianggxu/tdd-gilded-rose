package cn.xpbootcamp.gildedrose;

public class Product {
    String name;
    String type;
    int sellIn;
    int quality;
    static final String CommonProductType = "NormalPorductType";
    static final String AgedBrieType="AgedBrieType";
    static final String SulfurasType="SulfurasType";
    static final String BackstagePassType="BackstagePassType";


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
