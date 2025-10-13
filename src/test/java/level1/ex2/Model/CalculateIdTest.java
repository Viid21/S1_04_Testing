package level1.ex2.Model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculateIdTest {

    @ParameterizedTest
    @CsvSource({
            "49296424, H",
            "49296425, L",
            "22222222, J",
            "43176534, Z",
            "39753265, L",
            "12345678, Z",
            "98765432, M",
            "62938745, G",
            "10293847, J",
            "56473829, C"
    })
    void givenTenIntegers_whenCalculateId_thenCalculateDniChar(int intDni, char expectedLetter) {
        CalculateId calc = new CalculateId();
        assertEquals(expectedLetter, calc.calculateIdChar(intDni));
    }
}