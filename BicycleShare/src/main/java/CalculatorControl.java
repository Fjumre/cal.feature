import java.util.ArrayList;

public class CalculatorControl {

    public int addNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int subtractNumbers(ArrayList<Integer> numbers) {
        int sum = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            sum -= numbers.get(i);
        }

        return sum;
    }

    public int divideNumbers(ArrayList<Integer> numbers) {
        int sum = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            sum /= numbers.get(i);
        }

        return sum;
    }

    public int multiplyNumbers(ArrayList<Integer> numbers) {
        int sum = 1;
        for (int number : numbers) {
            sum = number * number;
        }
        return sum;
    }

    public int modulus(ArrayList<Integer> modulusNumber) {

        int dividend = modulusNumber.get(0);
        int divisor = modulusNumber.get(1);

        return dividend % divisor;
    }

    public int procentages(ArrayList<Integer> procentNumbers) {

         int product= multiplyNumbers(procentNumbers);
        return product*100;
    }
}
