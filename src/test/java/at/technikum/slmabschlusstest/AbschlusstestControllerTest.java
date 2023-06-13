package at.technikum.slmabschlusstest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.SmartInitializingSingleton;

import static org.junit.jupiter.api.Assertions.*;

class AbschlusstestControllerTest {

    int n = 22;

    @Test
    void testDigitSum(){
        assertEquals(AbschlusstestController.calculateDigitSum(n),4);
    }

    @Test
    void usage(){
        AbschlusstestController.calculateDigitSum(12);
        AbschlusstestController.calculateDigitSum(11);
        AbschlusstestController.calculateDigitSum(10);
        int expected = 3;
        assertEquals(expected, AbschlusstestController.usage());
    }
}