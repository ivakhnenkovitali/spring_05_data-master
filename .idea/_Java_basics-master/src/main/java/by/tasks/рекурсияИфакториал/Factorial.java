package by.tasks.рекурсияИфакториал;

public class Factorial {
    public static int factorial(int number) {

        // An = (((n-1)!)^2/((2*n)!))*(2*x)^2*n

        if (number == 0) {
            return 1;
        }

        int resultFactorial = 1;

        for (int i = 2; i <= number; i++) {
            resultFactorial *= i;
        }
        return resultFactorial;
    }

    public static int recursionFactorial(int number) {
        if (number < 0) {
            throw new RuntimeException();
        }
        if (number == 0 || number == 1) {
            return 1;
        }
        return recursionFactorial(number - 1) * number;
    }

    public static int pow(int number, int rate) {
        int result = number;

        if (rate == 0) {
            return 1;  // Любое число в степени 0 равно 1
        }

        for (int i = 2; i <= rate; i++) {
            result *= number;
        }
        return result;
    }

    public static double result(int n, int x) {
        double result = 0;

        // ((n-1))!)^2
        int nMinusOdin = factorial(n - 1);
        nMinusOdin = pow(nMinusOdin, 2);

        //(2n)!
        int f2n = factorial(2 * n);

        //(2*x)(2n)
        int x2n = pow(2 * x, 2 * n);

        return (double) nMinusOdin / f2n * x2n;
    }

    public static void main(String[] args) {
        System.out.println(result(2, 1));
    }
}
