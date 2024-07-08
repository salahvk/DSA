package kunal_kushwaha.maths;

// public class Seive {
//     public static void main(String[] args) {
//         int n = 40;
//         boolean[] primes = new boolean[n+1];
//         sieve(n, primes);
//     }

//     // false in array means number is prime
//     static void sieve(int n, boolean[] primes) {
//         for (int i = 2; i*i <= n; i++) {
//             System.out.println(i);
//             if (!primes[i]) {
//                 for (int j = i*2; j <= n; j+=i) {
//                     System.out.println(j);
//                     System.out.println("j");                    primes[j] = true;
//                 }
//             }
//         }

//         for (int i = 2; i <= n; i++) {
//             if (!primes[i]) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }

public class Sieve {
    public static void main(String[] args) {
        normalPrimeNumber(40);
    }

    public static void normalPrimeNumber(int num) {
        if (num < 2) {
            return;
        }

        normalPrimeNumber(num - 1);
        int c = 2;
        while (true) {
            if (c * c <= num && num % c == 0) {
                break;
            }
            c++;
        }
        if (c % 2 != 0) {
            System.out.println(num);
        }
    }
}