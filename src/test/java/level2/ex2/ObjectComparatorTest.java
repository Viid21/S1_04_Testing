package level2.ex2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ObjectComparatorTest {
    @Test
    public void givenTwoReferences_whenPointToSameObject_thenIsSame(){
        Car c1 = new Car("A");
        Car c2 = c1;
        assertThat(c1).isSameAs(c2);
    }
    @Test
    public void givenTwoObjects_whenDifferentInstances_thenIsNotSame(){
        Car c1 = new Car("A");
        Car c2 = new Car("A");
        assertThat(c1).isNotSameAs(c2);
    }
    @Test
    public void givenTwoArrays_whenCompared_thenAreEquals(){
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        assertThat(array1).containsExactly(array2);
    }
}
