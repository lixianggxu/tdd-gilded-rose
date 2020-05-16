package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasProductTest {

    @Test
    void should_quality_30_when_one_day_pass_given_quality_30_of_sulfuras_product() {
        SulfurasProduct sulfuras = new SulfurasProduct(30);
        sulfuras.passDay();
        assertEquals(30, sulfuras.getQuality());
    }

    @Test
    void should_quality_0_when_one_day_pass_given_quality_0_of_sulfuras_product() {
        SulfurasProduct sulfuras = new SulfurasProduct(0);
        sulfuras.passDay();
        assertEquals(0, sulfuras.getQuality());
    }

    @Test
    void should_quality_50_when_one_day_pass_given_quality_50_of_sulfuras_product() {
        SulfurasProduct sulfuras = new SulfurasProduct(50);
        sulfuras.passDay();
        assertEquals(50, sulfuras.getQuality());
    }
}
