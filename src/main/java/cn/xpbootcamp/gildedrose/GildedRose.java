package cn.xpbootcamp.gildedrose;

public class GildedRose {


    public Product updateSellinAndQualityAfterPassDay(Product product, int passedDay){
        if(product.getType()==Product.NormalPorductType && product.getSellIn()>0){
            int oldSellin = product.getSellIn();
            int oldQuality = product.getQuality();
            product.setSellIn(oldSellin - passedDay);
            product.setQuality(oldQuality - passedDay*1);
        }
        return product;
    }

}
