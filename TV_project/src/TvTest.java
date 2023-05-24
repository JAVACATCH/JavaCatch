class Tv{//Tv의 클래스. 설계도에 불과하다.
    String color;
    boolean power;
    int channel;//위 3개는 객체의 속성. 멤버변수에 대해 작성한 것이다.

    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }

    void channelDown(){
        --channel;
    }// 위 3개의 함수는 객체의 기능. 메서드에 대해 작성한 것이다.

}

class TvTest {
    public static void main(String args[]){
        Tv t = new Tv(); // Tv의 인스턴스(객체)로서 t를 선언.
        t.channel = 7;//Tv의 멤버변수인 channel의 값을 7로 한다.
        t.channelDown();//Tv의 메서드인 channelDown을 실행.
        System.out.printf("현재 채널은 %d 입니다.",t.channel);
    }
}
