package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstagePassProductTest {

    @Test
    void should_quality_3_and_sellin_19_when_one_day_pass_given_quality_2_and_sellin_20_of_backstagePass_product_in_expiration_date() {
        BackstagePassProduct backstagePass = new BackstagePassProduct(2, 20);
        backstagePass.passDay();
        assertEquals(3, backstagePass.getQuality());
        assertEquals(19, backstagePass.getSellIn());
    }
}
