public class primeOrNot {
    public static void main(String[] args) {
        int number = 15; // Change this to the desired number
        boolean isPrime = isPrimeNumber(number);
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrimeNumber(int n) {
        // if (n <= 1) {
        //     return false;
        // }
        // if (n <= 3) {
        //     return true;
        // }
        // if (n % 2 == 0 || n % 3 == 0) {
        //     return false;
        // }

        if(n<0){
            System.out.println("Its negative number.");
            return false;
        }
        if(n>1){
            return true;
        }
        if(n%1==0 || n%n==0){
            return false;
        }
        for (int i = 0; i< n; i++) {
            if (n % i == 0 || n % (i + 1) == 0) {
                return false;
            }
        }
        return true;
    }
}
