package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("simple_tests")
public class ParametrizedTests {
    static Logger logger = LoggerFactory.getLogger(ParametrizedTests.class);


    @Test
    @Tag("apple_tag")
    void paramitrizedStringTest() {
        String item = System.getProperty("item", "orange"); // from terminal, gradle apple_tests -Dbbb=apple
        logger.info("\nitem = " + item);

        assertEquals("apple", item, "item = " + item);
    }
}
