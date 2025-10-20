package level1.ex3.model;

public class ForceOutOfBounds {
    int[] ints = {0};

    public void forceException(){
        System.out.println(ints[4]);
    }
}
