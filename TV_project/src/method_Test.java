public class method_Test {
    public static int add(int a,int b){//public static 반환타입 메서드이름(매개변수1, 매개변수2)
        int result = a + b;
        return result;
    }
    public static int multiply(int a,int b){
        int result = a * b; // add 메서드에서 쓰인 result와 다른 지역변수이다.
        return result;
    }

    public static void main(String args[]){
        int res = add(4,7);//add메서드에 4 7 을 넣어 return한 결과값을 res에 저장
        int res2 = multiply(4,7);//multiply메서드에 4 7 을 넣어 return한 결과값을 res2에 저장
        System.out.printf("%d %d",res,res2);
    }
}
