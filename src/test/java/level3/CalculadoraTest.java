package level3;

import org.junit.jupiter.api.Test;
import level3.Model.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculadoraTest {
    Calculator calc = new Calculator();
    int i1 = 6;
    int i2 = 2;
    @Test
    public void givenTwoIntegers_whenAddExecuted_thenVerifyCorrectResult() {
        int i3 = calc.add(i1, i2);
        assertThat(i3).isEqualTo(8);
    }
    @Test
    public void givenTwoIntegers_whenSubtractExecuted_thenVerifyCorrectResult() {
        int i3 = calc.subtract(i1, i2);
        assertThat(i3).isEqualTo(4);
    }
    @Test
    public void givenTwoIntegers_whenMultiplyExecuted_thenVerifyCorrectResult() {
        int i3 = calc.multiply(i1, i2);
        assertThat(i3).isEqualTo(12);
    }
    @Test
    public void givenTwoIntegers_whenDivideExecuted_thenVerifyCorrectResult() {
        int i3 = calc.divide(i1, i2);
        assertThat(i3).isEqualTo(3);
    }

}
