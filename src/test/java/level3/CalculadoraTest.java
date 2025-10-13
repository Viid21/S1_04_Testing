package level3;

import org.junit.jupiter.api.Test;
import level3.Model.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculadoraTest {
    Calculator calc = new Calculator();
    int i1 = 6;
    int i2 = 2;
    @Test
    public void givenTwoIntegers_whenToAddExecuted_thenVerifyCorrectResult() {
        int i3 = calc.toAdd(i1, i2);
        assertThat(i3).isEqualTo(8);
    }
    @Test
    public void givenTwoIntegers_whenToSubtractExecuted_thenVerifyCorrectResult() {
        int i3 = calc.toSubtract(i1, i2);
        assertThat(i3).isEqualTo(4);
    }
    @Test
    public void givenTwoIntegers_whenToMultiplyExecuted_thenVerifyCorrectResult() {
        int i3 = calc.toMultiply(i1, i2);
        assertThat(i3).isEqualTo(12);
    }
    @Test
    public void givenTwoIntegers_whenToDivideExecuted_thenVerifyCorrectResult() {
        int i3 = calc.toDivide(i1, i2);
        assertThat(i3).isEqualTo(3);
    }

}
