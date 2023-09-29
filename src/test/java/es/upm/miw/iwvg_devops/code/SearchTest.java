package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchTest {

    @Test
    void testFindDecimalImproperFractionByUserName() {
        assertEquals(List.of(2.0, -0.5), new Searches().findDecimalImproperFractionByUserName("Oscar")
                .collect(Collectors.toList()));
    }

}
