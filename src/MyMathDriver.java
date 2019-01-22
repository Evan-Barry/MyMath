public class MyMathDriver {
    public static void main(String[] args) {

        int smallest;

        smallest =  MyMath.findSmallest(1,2,4);//expected 1
        System.out.println("Smallest number: " + smallest);

        smallest = MyMath.findSmallest(20,10,15);//expected 10
        System.out.println("Smallest number: " + smallest);

        smallest = MyMath.findSmallest(27,39,19);//expected 19
        System.out.println("Smallest number: " + smallest);


        double pow;

        pow = MyMath.myPow(2,0);//expected 1
        System.out.println("2 to the power of 0 : " + pow);

        pow = MyMath.myPow(1,1);//expected 1
        System.out.println("1 to the power of 1 : " + pow);

        pow = MyMath.myPow(2,3);//expected 8
        System.out.println("2 to the power of 3 : " + pow);

        pow = MyMath.myPow(5,2);//expected 25
        System.out.println("5 to the power of 2 : " + pow);

        pow = MyMath.myPow(7,3);//expected 343
        System.out.println("7 to the power of 3 : " + pow);

        pow = MyMath.myPow(10,2);//expected 100
        System.out.println("10 to the power of 2 : " + pow);

        pow = MyMath.myPow(29,3);//expected 24389
        System.out.println("29 to the power of 3 : " + pow);


        int sum;

        sum = MyMath.sum(1);//expected 1
        System.out.println("Sum of nums up to 1 : " + sum);

        sum = MyMath.sum(113511);//expected 2,147,463,020 - closest to max int
        System.out.println("Sum of nums up to 113511 : " + sum);


        double factorial;

        factorial = MyMath.factorial(1);//expected 1
        System.out.println("1! : " + factorial);

        factorial = MyMath.factorial(5);//expected 120
        System.out.println("5! : " + factorial);

        factorial = MyMath.factorial(10);//expected 3628800
        System.out.println("10! : " + factorial);


        boolean isPrime;

        isPrime = MyMath.isPrime(2);//expected true
        System.out.println("Is 2 prime : " + isPrime);

        isPrime = MyMath.isPrime(3);//expected true
        System.out.println("Is 3 prime : " + isPrime);

        isPrime = MyMath.isPrime(4);//expected false
        System.out.println("Is 4 prime : " + isPrime);
    }
}
