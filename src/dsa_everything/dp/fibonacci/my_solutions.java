package dsa_everything.dp.fibonacci;

import java.util.HashMap;

public class my_solutions {
    static int totalRecursvieCalls = 0;
    static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(fibo(10));
        System.out.println(totalRecursvieCalls);
    }

    public static int fibo(int num) {
        if (memo.containsKey(num)) {
            return memo.get(num);
        }
        totalRecursvieCalls++;
        if (num <= 1) {
            return num;
        }
        int fibo = fibo(num - 1) + fibo(num - 2);
        memo.put(num, fibo);
        return fibo;
    }
}
