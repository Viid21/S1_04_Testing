package level1.ex2.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateIdTest {

    @Test
    void calculateIdChar() {
        CalculateId calculateId = new CalculateId();
        int[] numbers = {49296424,49296425,22222222,43176534,39753265,12345678,98765432,62938745,10293847,56473829};
        char[] chars = new char[10];
        for(int i = 0; i < numbers.length; i++){
            chars[i] = calculateId.calculateIdChar(numbers[i]);
        }
        char[] correctChars = {'H','L','J','Z','L','Z','M','G','J','C'};
        assertArrayEquals(chars, correctChars);
    }
}