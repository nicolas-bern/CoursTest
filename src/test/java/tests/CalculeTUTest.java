package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculeTUTest {

    static CalculeTU calcule;

    @BeforeAll
    static void setUp(){
        calcule = new CalculeTU();
    }

    @Test
    void testSommeDeuxEntiers() {
        int a = 5;
        int b = 2;
        assertEquals(7, calcule.sommeDeuxEntiers(a, b));
    }

    @Test
    void testProduitDeuxEntiers(){
        int a = 5;
        int b = 2;
        assertEquals(10, calcule.produitDeuxEntiers(a, b));
    }

    @Test
    void testSoustractionDeuxEntiers() {
        int a = 5;
        int b = 2;
        assertEquals(3, calcule.soustractionDeuxEntiers(a, b));
    }

    @Test
    void testDivisionDeuxEntiers() {
        int a = 5;
        int b = 2;
        assertNotEquals(3, calcule.divisionDeuxEntiers(a, b));
    }

    @Test
    void testCarre(){
        double a = 9;
        assertEquals(81, calcule.calculeCarre(a));
    }


}
