package cn.xpbootcamp.gildedrose;

public class GildedRose {


    public Product updateSellinAndQualityAfterPassDay(Product product, int passDay) {

        int currentSellIn = product.getSellIn();
        int currentQuality = product.getQuality();

        if (product.getType().equals(Product.AGED_BRIE_TYPE)) {
            product.setSellIn(currentSellIn - passDay);

            int reduceQuality = (-1) * passDay;
            if (currentSellIn < passDay) {
                int reducedQualityInExpirationDate = currentSellIn * (-1);
                int reducedQualityOutOfExpirationDate = (passDay - currentSellIn) * (-2);
                reduceQuality = reducedQualityInExpirationDate + reducedQualityOutOfExpirationDate;
            }
            product.setQuality(Math.min(currentQuality - reduceQuality, 50));
        }

        if (product.getType().equals(Product.COMMON_PRODUCT_TYPE) && currentSellIn > 0 && currentSellIn >= passDay) {
            product.setSellIn(currentSellIn - passDay);

            int tmpQuality = currentQuality - passDay * 1;
            product.setQuality(Math.max(tmpQuality, 0));
        }

        if (product.getType().equals(Product.COMMON_PRODUCT_TYPE) && currentSellIn > 0 && currentSellIn < passDay) {
            product.setSellIn(currentSellIn - passDay);

            int reducedQualityInExpirationDate = currentSellIn * 1;
            int reducedQualityOutOfExpirationDate = (passDay - currentSellIn) * 2;

            int tmpQuality = currentQuality - reducedQualityInExpirationDate - reducedQualityOutOfExpirationDate;
            product.setQuality(Math.max(tmpQuality, 0));
        }
        return product;
    }

}
