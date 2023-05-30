package validating;

public class Calculator {

    public int factorial(int num) {
        int answer = 1;
        if(num < 0){
            throw new IllegalArgumentException("Value given is less than 0");
        }
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if(setSize < 0 || subsetSize < 0 || setSize < subsetSize){
            throw new IllegalArgumentException("Values given are less than zero or subset size is smaller than set size");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
