package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdedBrieProductTest {

    @Test
    void should_quality_31_and_sellin_29_when_one_day_pass_given_quality_30_and_sellin_30_of_common_product_in_expiration_date() {
        AdedBrieProduct adebBrie = new AdedBrieProduct(30, 30);
        adebBrie.passDay();
        assertEquals(31, adebBrie.getQuality());
        assertEquals(29, adebBrie.getSellIn());
    }
}