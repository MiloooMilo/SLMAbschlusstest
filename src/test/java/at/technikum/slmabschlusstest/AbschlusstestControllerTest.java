package at.technikum.slmabschlusstest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbschlusstestControllerTest {

    int n = 22;

    @Test
    void testDigitSum(){
        assertEquals(AbschlusstestController.calculateDigitSum(n),4);
    }

    @Test
    void usage(){
    }
}