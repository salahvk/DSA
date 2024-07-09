package kunal_kushwaha.maths;

public class Sieve {
    public static void main(String[] args) {
        int num = 40;
        // normalPrimeNumber(40);
        boolean[] sieveNumbers = new boolean[num + 1];
        sieve(num, sieveNumbers);
        // sieveKunal(num, sieveNumbers);
    }

    public static void normalPrimeNumber(int num) {
        if (num < 2) {
            return;
        }

        normalPrimeNumber(num - 1);
        int c = 2;
        boolean isPrime = true;
        while (c * c <= num) {
            if (num % c == 0) {
                isPrime = false;
                break;

            }
            c++;
        }
        if (isPrime) {
            System.out.println(num);
        }
    }

    public static void sieve(int num, boolean[] sieveNumbers) {
        for (int i = 2; i <= num; i++) {

            if (!sieveNumbers[i]) {
                System.out.println(i);
                for (int j = i * 2; j < sieveNumbers.length; j += i) {
                    sieveNumbers[j] = true;
                }
            }
        }
    }

    static void sieveKunal(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}