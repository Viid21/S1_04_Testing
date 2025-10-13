package level2.ex7;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

public class EmptyObjectTest {
    @Test
    public void givenEmptyOptional_whenItIsEmpty_thenVerifyIsEmpty(){
        Optional<Integer> i = Optional.empty();
        assertThat(i).isEmpty();
    }
}
