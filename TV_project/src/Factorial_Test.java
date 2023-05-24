public class Factorial_Test {
    public static void main(String args[]){
        for(int i = 0; i < 20; i++){
            int res = Fac(i);
            System.out.printf("%d! : %20d\n",i,res);
        }
    }
    static int Fac(int n){
        int res = 0;
        if (n == 1) res = 1;
        else
            res = n * Fac(n-1);
        return res;
    }
}
