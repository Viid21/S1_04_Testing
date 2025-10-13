package level2.ex3;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ArrayComparatorTest {

    @Test
    public void givenTwoArrays_whenCompared_thenAreEquals(){
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        assertThat(array1).containsExactly(array2);
    }
}
