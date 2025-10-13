package level2.ex4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class DifferentObjectsInListTest {
    Obj1 o1 = new Obj1();
    Obj2 o2 = new Obj2();
    Obj3 o3 = new Obj3();

    List<Object> objects = new ArrayList<>();
    @BeforeEach
    public void init(){
        objects.add(o1);
        objects.add(o2);
        objects.add(o3);
    }
    @Test
    public void givenOneList_whenObjectsAdded_thenContainsInOrder(){
        assertThat(objects).containsExactly(o1, o2, o3);
    }

    @Test
    public void givenOneList_whenObjectsAdded_thenContainsObjects(){
        assertThat(objects).contains(o3, o1, o2);
    }

    @Test
    public void givenOneList_whenObjectsAdded_thenVerifyO3IsNotDuplicated(){
        assertThat(Collections.frequency(objects, o3)).isEqualTo(1);
    }

    @Test
    public void givenOneList_whenObjectsAdded_thenVerifyO4DoesNotExists(){
        Obj4 o4 = new Obj4();
        assertThat(objects).doesNotContain(o4);
    }
}
