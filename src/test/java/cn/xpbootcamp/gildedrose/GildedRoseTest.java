package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class GildedRoseTest {
    GildedRose rose = new GildedRose();
    @Test
    public void should_reduce_1_quality_and_1_sellin_when_pass_1day_for_common_product_in_expiration_date(){
        Product commonProduct = new Product("milk",Product.NormalPorductType,10,30);
        Product commonProductAfterDays = rose.updateSellinAndQualityAfterPassDay(commonProduct,1);
        assertEquals(commonProductAfterDays.getQuality(),29);
        assertEquals(commonProductAfterDays.getSellIn(),9);
    }

}
