package cn.xpbootcamp.gildedrose;

public class GildedRose {


    public Product updateSellinAndQualityAfterPassDay(Product product, int passedDay){

        int sellIn = product.getSellIn();

        if (product.getType() == Product.COMMON_PRODUCT_TYPE && sellIn > 0 && sellIn >= passedDay) {
            int oldSellin = sellIn;
            int oldQuality = product.getQuality();
            product.setSellIn(oldSellin - passedDay);
            product.setQuality(oldQuality - passedDay * 1);
        }
        if (product.getType() == Product.COMMON_PRODUCT_TYPE && sellIn > 0 && sellIn < passedDay) {

            int oldSellin = sellIn;
            int oldQuality = product.getQuality();
            product.setSellIn(oldSellin - passedDay);
            product.setQuality(oldQuality - passedDay * 1);
        }
        return product;
    }

}
