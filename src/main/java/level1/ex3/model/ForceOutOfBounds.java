package level1.ex3.model;

public class ForceOutOfBounds {
    int[] ints;

    public void forceException(){
        System.out.println(ints[4]);
    }
}
