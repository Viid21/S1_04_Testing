package level1.ex2.Model;

public class CalculateId {
    char[] chars = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N',
            'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public char calculateIdChar(int num) {
        return chars[num % 23];
    }
}
