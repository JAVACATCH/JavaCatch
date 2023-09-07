class student{
    String name;//학생 이름
    int age;//나이
    String zender;//성별
    int std_ID;//학번
    int cost;//수수료
    float std_result;//학점
    int remain_cost;//잔액
    void setName (String i){
        name = i;
    }
    void setAge (int i){ age = i; }
    void setZender (boolean i){
        if (i == true){ zender = "Male"; }
        else if(i == false){ zender = "Female"; }
    }
    void setStd_ID (int i){
        std_ID = i;
    }
    void setCost (int i){
        cost = i;
    }
    void setStd_result (float i){
        std_result = i;
    }
    void setRemain_cost (int i){ remain_cost = i; }
    void output_all(){
        System.out.printf("이름 : "+ name +"\n");
        System.out.printf("나이 : "+ age +"\n");
        System.out.printf("성별 : "+ zender +"\n");
        System.out.printf("학번 : "+ std_ID +"\n");
        System.out.printf("수수료 : "+ cost +"\n");
        System.out.printf("학점 : "+ std_result +"\n");
        System.out.printf("잔액 : "+ remain_cost +"\n");
    }
    void delete_all(){
        name = null;
        age = 0;
        zender = null;
        std_ID = 0;
        cost = 0;
        std_result = 0;
        remain_cost = 0;
    }
}