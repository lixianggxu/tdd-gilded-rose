package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonProductTest {
    @Test
    void should_quality_29_and_sellin_9_when_one_day_pass_given_quality_30_and_sellin_10_of_common_product_in_expiration_date() {
        CommonProduct commonProduct = new CommonProduct(30, 10);
        commonProduct.passDay();
        assertEquals(29, commonProduct.getQuality());
        assertEquals(9, commonProduct.getSellIn());
    }

    @Test
    void should_quality_0_and_sellin_9_when_one_day_pass_given_quality_0_and_sellin_10_of_common_product_in_expiration_date() {
        CommonProduct commonProduct = new CommonProduct(0, 10);
        commonProduct.passDay();
        assertEquals(0, commonProduct.getQuality());
        assertEquals(9, commonProduct.getSellIn());
    }

    @Test
    void should_quality_8_and_sellin_negative_1_when_one_day_pass_given_quality_10_and_sellin_0_of_common_product_out_of_expiration_date() {
        CommonProduct commonProduct = new CommonProduct(10, 0);
        commonProduct.passDay();
        assertEquals(8, commonProduct.getQuality());
        assertEquals(-1, commonProduct.getSellIn());
    }
}
