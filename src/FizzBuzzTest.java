public class FizzBuzzTest {

    public static void main(String[] args) {
        testFizzBuzz();
    }

    public static void fizzbuzz(int total) {
        for (int i = 1; i <= total; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void testFizzBuzz() {
        fizzbuzz(100);
        fizzbuzz(200);
    }
}
