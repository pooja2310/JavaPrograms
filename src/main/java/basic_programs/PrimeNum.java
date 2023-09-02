package basic_programs;

public class PrimeNum
{
    public static void main(String[] args) {
    int number = 17;
    boolean isPrime = isPrimeNumber(number);

    if (isPrime) {
        System.out.println(number + " is a prime number.");
    } else {
        System.out.println(number + " is not a prime number.");
    }
}

    public static boolean isPrimeNumber(int number)
    {
        if (number <= 1) {
            return false;
        }

        // Loop from 2 to the square root of the number
        // If any number divides 'number', it's not prime
        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }

        // If no number divides 'number', it's prime
        return true;
    }
}







