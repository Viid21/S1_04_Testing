package level2.ex6;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class VerifyExceptionTest {
    @Test
    public void givenOneMethod_whenExceptionHappen_thenVerifyItHappens(){
        ForceException force = new ForceException();

        try{
            force.forceException();
            failBecauseExceptionWasNotThrown(ArrayIndexOutOfBoundsException.class);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertThat(e).isInstanceOf(ArrayIndexOutOfBoundsException.class);
        }
    }
}
