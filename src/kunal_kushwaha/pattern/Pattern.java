package kunal_kushwaha.pattern;

// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
public class Pattern {
    public static void main(String[] args) {
        // pattern1(5);
        pattern8(5);
    }

    static void pattern1(int nums) {
        for (int i = 0; i < nums; i++) {
            for (int j = 0; j < nums; j++) {
                System.out.print("*");
            }
            System.err.println();
        }
    }

    static void pattern2(int nums) {
        for (int i = 1; i <= nums; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.err.println();
        }
    }

    static void pattern3(int nums) {
        for (int i = nums; i >= 1; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.err.println();
        }
    }

    static void pattern4(int nums) {
        for (int i = 1; i <= nums; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.err.println();
        }
    }

    static void pattern5(int nums) {
        for (int i = 1; i <= nums; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.err.println();
        }

        for (int i = nums - 1; i >= 1; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.err.println();
        }
    }

    static void pattern6(int nums) {
        for (int i = 1; i <= nums; i++) {
            for (int j = nums; j > 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.err.println();
        }
    }

    static void pattern7(int nums) {
        for (int i = 0; i < nums; i++) {
            for (int j = 1; j <= nums; j++) {
                if(i >= j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.err.println();
        }
    }

    static void pattern8(int nums){
        
    }
}
