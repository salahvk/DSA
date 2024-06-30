package kunal_kushwaha.Recursion.pattern.star;

public class StarProblem {
    public static void main(String[] args) {
        pattern1(5,5);
    }

    public static void pattern1(int i,int j) {
        if (i == 0) {
            return;
        }
        System.out.print("*");
        if(j == 0){
            System.out.println(" ");
            pattern1(--i,--i);
        }else{
            pattern1(i, --j);
        }
        
    }
}
