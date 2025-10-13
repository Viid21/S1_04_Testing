package level2.ex5;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class VerifyKeyInMapTest {
    @Test
    public void givenOneList_whenObjectsAdded_thenContainsObjects(){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        assertThat(map).containsKey("A");
    }
}
