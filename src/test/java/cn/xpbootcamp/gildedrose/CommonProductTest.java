package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonProductTest {
    @Test
    void should_quality_29_and_sellin_9_when_one_day_pass_given_quality_30_and_sellin_10_of_common_product() {
        CommonProduct commonProduct = new CommonProduct(30, 10);
        commonProduct.passDay();
        assertEquals(29, commonProduct.getQuality());
        assertEquals(9, commonProduct.getSellIn());
    }
}
