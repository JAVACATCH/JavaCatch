import java.util.*;

public class Main {
    public static void main(String[] args) {
        //4월 13일자 자바 스터디 자료입니다~~
    }
}

class oper1_2 {
    public static void main(String[] args) {
        int x,y;
        x = 5;
        y = 4 * x + 3;
        System.out.printf("%d",y);
    }
}

class oper1_5 {
    public static void main(String[] args) {
        int x = 5;
        double y = 4.13;
        double result = (double)x + y;
        System.out.printf("%f",result);
    }
}

class oper2_1 {
    public static void main(String[] args) {
        int x = 5;
        x++;
        System.out.printf("%d\n",x);//x+1으로 5+1=6
        ++x;//x+1으로 6+1=7
        System.out.printf("%d\n",x);//전위와 후위 둘다 1을 더하는 것이므로 차이X

        int i = 3;
        int j;
        j = ++i;
        System.out.printf("pre -- i = %d , j = %d\n",i,j);
        i = 3;
        j = i++;
        System.out.printf("post -- i = %d , j = %d\n",i,j);
    }
}

class oper3 {
    public static void main(String[] args) {
        int a = 5 , b = 3;
        System.out.printf("%d + %d = %d\n",a,b,a+b);
        System.out.printf("%d - %d = %d\n",a,b,a-b);
        System.out.printf("%d * %d = %d\n",a,b,a*b);
        System.out.printf("%d / %d = %d\n",a,b,a/b);
        System.out.printf("%d %% %d = %d\n",a,b,a%b);
    }
}

class oper4 {
    public static void main(String[] args) {
        int a = 5 , b = 5 , c = 3;
        System.out.printf("5 > 5 ==> %b\n",a>b);
        System.out.printf("3 < 5 ==> %b\n",c<b);
        System.out.printf("5 >= 5 ==> %b\n",a>=b);
        System.out.printf("5 <= 3 ==> %b\n",a<=c);
        System.out.printf("5 == 5 ==> %b\n",a==b);
        System.out.printf("5 != 3 ==> %b\n",a!=c);
    }
}

class oper5_1 {
    public static void main(String[] args) {
        int a = 5 , b = 3;
        System.out.printf("a >= b && a < b ==> %b\n",(a>=b && a<b));
        System.out.printf("a >= b || a < b ==> %b\n",(a>=b || a<b));
        System.out.printf("!(a >= b) ==> %b\n",!(a>=b));
    }
}

class oper6_1 {
    public static void main(String[] args) {
        int x = 5 , y = 3;
        int result = (x>y)?(x+y):(x-y);//x>y가 참이므로 첫번째 식 x+y가 저장됨.
        System.out.printf("%d",result);
    }
}

class oper6_2 {
    public static void main(String[] args) {
        int a = 5;
        a += 3;//a에 3을 더한후 저장한다. 5에 3을 더한 8이 저장
        System.out.printf("%d ",a);
        a -= 3;//a에 3을 뺀후 저장한다. 8에 3을 뺀 5가 저장
        System.out.printf("%d ",a);
        a *= 3;//a에 3을 곱한후 저장한다. 5에 3을 곱한 15가 저장
        System.out.printf("%d ",a);
        a /= 3;//a에 3을 나눈후 저장한다. 15에 3을 나눈 5가 저장
        System.out.printf("%d ",a);
    }
}
