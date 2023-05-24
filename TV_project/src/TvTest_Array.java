class TvTest_Array {
    public static void main(String args[]){
        Tv[] tvArr = new Tv[3];
        tvArr[0] = new Tv();
        tvArr[1] = new Tv();
        tvArr[2] = new Tv();
        Tv[] tvRay = new Tv[100];
        for(int i = 0; i < tvRay.length;i++){
            tvRay[i] = new Tv();
        }

    }
}
