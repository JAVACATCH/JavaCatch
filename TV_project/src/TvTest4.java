class TvTest4 {
    public static void main(String args[]){
        Tv[] arr = new Tv[3];
        for(int i = 0; i < arr.length; i++){
            arr[i] = new Tv();
            arr[i].channel = i+10;
            System.out.printf("arr[%d].channel = %d\n",i,arr[i].channel);
        }

    }
}
