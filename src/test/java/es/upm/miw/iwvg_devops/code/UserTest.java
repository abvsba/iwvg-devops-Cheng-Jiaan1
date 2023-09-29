package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserTest {
    private User user;

    @BeforeEach
    void before() {

        List<Fraction> fractions = new ArrayList<>();
        user = new User("1", "Maria", "Fernandez", fractions);
    }

    @Test
    void testUserFraction() {
        assertTrue(new User().getFractions().isEmpty());
    }

    @Test
    void testGetUserId() {
        assertEquals("1", user.getId());
    }

    @Test
    void testGetUserName() {
        assertEquals("Maria", user.getName());
    }

    @Test
    void testSetUserName() {
        user.setName("Pablo");
        assertEquals("Pablo", user.getName());
    }

    @Test
    void testGetUserFamilyName() {
        assertEquals("Fernandez", user.getFamilyName());
    }

    @Test
    void testSetUserFamilyName() {
        user.setFamilyName("Garcia");
        assertEquals("Garcia", user.getFamilyName());
    }

    @Test
    void testGetUserFractions() {
        assertTrue(user.getFractions().isEmpty());
    }

    @Test
    void testSetUserFractions() {
        Fraction fraction = new Fraction(1,1);
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(fraction);
        user.setFractions(fractions);
        assertEquals(List.of(fraction), user.getFractions());
    }

    @Test
    void testAddUserFraction() {
        Fraction fraction = new Fraction(0,1);
        user.addFraction(fraction);
        assertEquals(List.of(fraction), user.getFractions());
    }

    @Test
    void testGetUserFullName() {
        assertEquals("Maria Fernandez", user.fullName());
    }

    @Test
    void testGetUserInitial() {
        assertEquals("M.", user.initials());
    }

    @Test
    void testUserToString() {
        assertEquals("User{id='1', name='Maria', familyName='Fernandez', fractions=[]}"
                , user.toString());
    }

}
