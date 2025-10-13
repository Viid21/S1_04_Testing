package level2.ex1;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class IntComparatorTest {
    @Test
    public void givenTwoEqualIntegers_whenCompared_thenReturnsTrue(){
        int i1 = 1;
        int i2 = 1;
        assertThat(i1).isEqualTo(i2);
    }
    @Test
    public void givenTwoDiferentIntegers_whenCompared_thenReturnsTrue(){
        int i1 = 1;
        int i2 = 2;
        assertThat(i1).isNotEqualTo(i2);
    }
}
