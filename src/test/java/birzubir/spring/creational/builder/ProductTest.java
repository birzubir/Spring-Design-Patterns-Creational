package birzubir.spring.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {


    @Test
    void testBuilder() {
        Product samsunga50s = Product.builder()
                .id("xxx")
                .name("samsung a50s")
                .sku("xxx")
                .price(20_000_000L)
                .build();

        System.out.println(samsunga50s);
    }
}