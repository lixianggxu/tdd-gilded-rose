package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GildedRoseTest {
    GildedRose rose;

    @BeforeEach
    public void setUp() {
        rose = new GildedRose();
    }

    @Test
    public void should_return_product_with_29_quality_and_9_sellin_when_pass_1day_for_common_product_30_quality_and_10_sellin_in_expiration_date() {
        Product commonProduct = new Product("milk", Product.COMMON_PRODUCT_TYPE, 10, 30);
        Product commonProductAfterDays = rose.updateSellinAndQualityAfterPassDay(commonProduct, 1);
        assertThat(commonProductAfterDays.getQuality(), equalTo(29));
        assertThat(commonProductAfterDays.getSellIn(), equalTo(9));
    }

    @Test
    public void should_return_product_with_20_quality_and_0_sellin_when_pass_10days_for_common_product_30_quality_and_10_sellin_and_selin_is_0() {
        Product commonProduct = new Product("milk", Product.COMMON_PRODUCT_TYPE, 10, 30);
        Product commonProductAfterDays = rose.updateSellinAndQualityAfterPassDay(commonProduct, 10);
        assertThat(commonProductAfterDays.getQuality(), equalTo(20));
        assertThat(commonProductAfterDays.getSellIn(), equalTo(0));
    }

    @Test
    public void should_return_product_with_19_quality_and_negative_1_sellin_when_pass_11days_for_common_product_30_quality_and_10_sellin_out_of_expiration_date() {
        Product commonProduct = new Product("milk", Product.COMMON_PRODUCT_TYPE, 10, 30);
        Product commonProductAfterDays = rose.updateSellinAndQualityAfterPassDay(commonProduct, 11);
        assertThat(commonProductAfterDays.getQuality(), equalTo(18));
        assertThat(commonProductAfterDays.getSellIn(), equalTo(-1));
    }

    @Test
    public void should_return_product_with_0_quality_and_negative_20_sellin_when_pass_30days_for_common_product_30_quality_and_10_sellin_out_of_expiration_date() {
        Product commonProduct = new Product("milk", Product.COMMON_PRODUCT_TYPE, 10, 30);
        Product commonProductAfterDays = rose.updateSellinAndQualityAfterPassDay(commonProduct, 30);
        assertThat(commonProductAfterDays.getQuality(), equalTo(0));
        assertThat(commonProductAfterDays.getSellIn(), equalTo(-20));
    }

    @Test
    public void should_return_product_with_0_quality_and_negative_21_sellin_when_pass_30days_for_common_product_31_quality_and_10_sellin_out_of_expiration_date() {
        Product commonProduct = new Product("milk", Product.COMMON_PRODUCT_TYPE, 10, 30);
        Product commonProductAfterDays = rose.updateSellinAndQualityAfterPassDay(commonProduct, 31);
        assertThat(commonProductAfterDays.getQuality(), equalTo(0));
        assertThat(commonProductAfterDays.getSellIn(), equalTo(-21));
    }

    @Test
    public void should_return_product_with_0_quality_and_10_sellin_when_pass_10_days_for_common_product_with_10_quality_and_20_sellin_in_expiration_date() {
        Product product = new Product("B", Product.COMMON_PRODUCT_TYPE, 20, 10);
        rose.updateSellinAndQualityAfterPassDay(product, 10);

        assertThat(product.getQuality(), equalTo(0));
        assertThat(product.getSellIn(), equalTo(10));
    }

    @Test
    public void should_return_product_with_0_quality_and_5_sellin_when_pass_15_days_for_common_product_with_10_quality_and_20_sellin_in_expiration_date() {
        Product product = new Product("B", Product.COMMON_PRODUCT_TYPE, 20, 10);
        rose.updateSellinAndQualityAfterPassDay(product, 15);

        assertThat(product.getQuality(), equalTo(0));
        assertThat(product.getSellIn(), equalTo(5));
    }

    @Test
    public void should_return_product_with_0_quality_and_negative_1_sellin_when_pass_21_days_for_common_product_with_10_quality_and_20_sellin_out_of_expiration_date() {
        Product product = new Product("B", Product.COMMON_PRODUCT_TYPE, 20, 10);
        rose.updateSellinAndQualityAfterPassDay(product, 21);

        assertThat(product.getQuality(), equalTo(0));
        assertThat(product.getSellIn(), equalTo(-1));
    }
}
