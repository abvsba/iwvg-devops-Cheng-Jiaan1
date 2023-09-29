package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(2, 4);
    }

    @Test
    void testFractionIs1_1() {
        Fraction fraction1_1 = new Fraction();
        assertEquals(1, fraction1_1.getNumerator());
        assertEquals(1, fraction1_1.getDenominator());
    }

    @Test
    void testSetFractionNumerator(){
        fraction.setNumerator(0);
        assertEquals(0, fraction.getNumerator());
    }

    @Test
    void testSetFractionDenominator(){
        fraction.setDenominator(5);
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    void testGetFractionDecimal(){
        assertEquals(0.5, fraction.decimal());
    }

}
