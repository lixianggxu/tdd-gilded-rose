package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasProductTest {

    @Test
    void should_quality_30_and_sellin_0_when_one_day_pass_given_quality_30_and_sellin_0_of_sulfuras_product() {
        SulfurasProduct sulfuras = new SulfurasProduct(30, 0);
        sulfuras.passDay();
        assertEquals(30, sulfuras.getQuality());
        assertEquals(0, sulfuras.getSellIn());
    }

    @Test
    void should_quality_0_and_sellin_10_when_one_day_pass_given_quality_0_and_sellin_10_of_sulfuras_product() {
        SulfurasProduct sulfuras = new SulfurasProduct(0, 10);
        sulfuras.passDay();
        assertEquals(0, sulfuras.getQuality());
        assertEquals(10, sulfuras.getSellIn());
    }

    @Test
    void should_quality_50_and_sellin_20_when_one_day_pass_given_quality_50_and_sellin_20_of_sulfuras_product() {
        SulfurasProduct sulfuras = new SulfurasProduct(50, 20);
        sulfuras.passDay();
        assertEquals(50, sulfuras.getQuality());
        assertEquals(20, sulfuras.getSellIn());
    }
}
