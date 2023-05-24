class TvTest3 {
    public static void main(String args[]){
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1채널값 : " + t1.channel);
        System.out.println("t2채널값 : " + t2.channel);
        t2 = t1; // 중요! t1이 저장하는 값의 주소를 t2에 저장한다. 원래 사용하던 t2에서 참조하던 주소는 더이상 사용할 수 없다.
        t1.channel = 7;
        System.out.println("t1채널값 : " + t1.channel);
        System.out.println("t2채널값 : " + t2.channel);

    }
}
