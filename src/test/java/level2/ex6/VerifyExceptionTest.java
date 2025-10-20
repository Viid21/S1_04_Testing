package level2.ex6;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class VerifyExceptionTest {
    @Test
    public void givenOneMethod_whenExceptionHappen_thenVerifyItHappens(){
        ForceException force = new ForceException();
        assertThatThrownBy(force::forceException).isInstanceOf(ArrayIndexOutOfBoundsException.class);

    }
}
