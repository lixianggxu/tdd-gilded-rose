package cn.xpbootcamp.gildedrose;

public class GildedRose {


    public Product updateSellinAndQualityAfterPassDay(Product product, int passDay) {

        int currentSellIn = product.getSellIn();
        int currentQuality = product.getQuality();

        if (product.getType().equals(Product.COMMON_PRODUCT_TYPE) && currentSellIn > 0 && currentSellIn >= passDay) {
            product.setSellIn(currentSellIn - passDay);
            product.setQuality(currentQuality - passDay);
        }

        if (product.getType().equals(Product.COMMON_PRODUCT_TYPE) && currentSellIn > 0 && currentSellIn < passDay) {
            product.setSellIn(currentSellIn - passDay);

            int reducedQualityInExpirationDate = currentSellIn * 1;
            int reducedQualityBeyondExpirationDate = (passDay - currentSellIn) * 2;

            int tmpQuality = currentQuality - reducedQualityInExpirationDate - reducedQualityBeyondExpirationDate;
            product.setQuality(Math.max(tmpQuality, 0));
        }
        return product;
    }

}
