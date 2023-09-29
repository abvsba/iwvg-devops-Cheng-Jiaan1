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

    @Test
    void testFractionIsProper(){
        assertTrue(fraction.isProper());
    }

    @Test
    void testFractionIsImproper(){
        assertFalse(fraction.isImproper());
    }

    @Test
    void testFractionSum(){
        Fraction fraction = new Fraction(1,4);
        Fraction espectedResultFraction = new Fraction(3,4);
        Fraction resultFraction = this.fraction.add(fraction);
        assertEquals(espectedResultFraction.getDenominator(), resultFraction.getDenominator());
        assertEquals(espectedResultFraction.getNumerator(), resultFraction.getNumerator());
    }

    @Test
    void testFractionIsEquivalent(){
        Fraction fraction = new Fraction(2,4);
        assertTrue(fraction.isEquivalent(fraction));
    }

    @Test
    void testFractionMultiply(){
        Fraction fraction = new Fraction(1,2);
        Fraction espectedResultFraction = new Fraction(2,8);
        Fraction resultFraction = this.fraction.multiply(fraction);
        assertEquals(espectedResultFraction.getDenominator(), resultFraction.getDenominator());
        assertEquals(espectedResultFraction.getNumerator(), resultFraction.getNumerator());
    }

    @Test
    void testFractionDivide(){
        Fraction fraction = new Fraction(1,2);
        Fraction espectedResultFraction = new Fraction(4,4);
        Fraction resultFraction = this.fraction.divide(fraction);
        assertEquals(resultFraction.getDenominator(), espectedResultFraction.getDenominator());
        assertEquals(resultFraction.getNumerator(), espectedResultFraction.getNumerator());
    }

    @Test
    void testFractionToString(){
        assertEquals("Fraction{numerator=2, denominator=4}", fraction.toString());
    }

}
