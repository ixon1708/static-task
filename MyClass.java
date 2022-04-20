public class MyClass {
    public static void main(String[] args) {
        Solution firstSolution = new Solution(69);
        Solution secondSolution = new Solution(228);
        countTheResult(firstSolution);
        countTheResult(secondSolution);
    }

    public static void countTheResult(Solution solution) {
        System.out.println(solution.getTemp());
    }
}

class Solution {
    private int temp;
    static int number;
    static final int CONSTANTA;

    static {
        number = 100;
        CONSTANTA = 228;
    }

    public Solution(int q) {
        temp = q + number++ * CONSTANTA;
    }

    public int getTemp() {
        return temp;
    }
}
