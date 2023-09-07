import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year,std,val,no,info_num;
        boolean end = true;
        System.out.printf("학생 관리 시스템에 온 것을 환영합니다!\n");
        System.out.printf("현재 년도를 입력해주세요!\n입력 : ");
        year = s.nextInt();
        System.out.printf("최대 학생 수를 입력해주세요!\n입력 : ");
        std = s.nextInt();
        student[] student = new student[std];
        for(int i = 0; i < student.length;i++){
            student[i] = new student();
        }
        enter();
        do{
            System.out.printf("진행할 작업을 선택해주세요!\n1.학생 정보 입력\n2.학생 정보 삭제\n3.학생 정보 조회\n4.프로그램 나가기\n입력 :");
            val = s.nextInt();
            enter();
            if(val == 1){
                System.out.printf("입력하고 싶은 학생의 번호를 입력하세요!\n입력 : ");
                no = s.nextInt()-1;
                enter();
                System.out.printf("입력하고 싶은 정보를 정해주세요!\n1.이름\n2.나이\n3.성별\n4.학번\n5.수수료\n6.학점\n7.잔액\n입력 : ");
                info_num = s.nextInt();
                enter();
                switch (info_num){
                    case 1 ://이름
                        System.out.printf("이름을 입력해주세요!\n입력 : ");
                        s.nextLine();
                        student[no].setName(s.nextLine());
                        break;
                    case 2 ://나이
                        System.out.printf("나이를 입력해주세요!\n입력 : ");
                        student[no].setAge(s.nextInt());
                        break;
                    case 3 ://성별
                        System.out.printf("성별이 남자라면 1을, 여자라면 2를 입력하세요!\n입력 : ");
                        int zen = s.nextInt();
                        if(zen == 1){ student[no].setZender(true); }
                        else if(zen == 2){ student[no].setZender(false); }
                        else{ Fi(); }
                        break;
                    case 4 ://학번
                        System.out.printf("학번을 입력해주세요!\n입력 : ");
                        student[no].setStd_ID(s.nextInt());
                        break;
                    case 5 ://수수료
                        System.out.printf("학생이 납부해야 할 수수료를 입력해주세요!\n입력 : ");
                        student[no].setCost(s.nextInt());
                        break;
                    case 6 ://학점
                        System.out.printf("학점을 입력해주세요!\n입력 : ");
                        student[no].setStd_result(s.nextFloat());
                        break;
                    case 7 ://잔액
                        System.out.printf("학생이 남긴 잔액을 입력해주세요!\n입력 : ");
                        student[no].setRemain_cost(s.nextInt());
                        break;
                    default:
                        Fi();
                        break;
                }
            }else if(val == 2){
                System.out.printf("정보를 삭제하고 싶은 학생의 번호를 입력해주세요!\n입력 : ");
                no = s.nextInt()-1;
                System.out.printf("!!주의!! " + (no+1) + "번 학생의 모든 정보가 삭제됩니다.\n삭제를 진행할거라면 1을, 그렇지 않으면 다른 숫자를 입력해주세요.\n입력 : ");
                val = s.nextInt();
                if (val == 1){
                    student[no].delete_all();
                    System.out.printf("삭제가 완료되었습니다.\n");
                }
                System.out.printf("초기 화면으로 넘어갑니다. 계속하려면 enter를 눌러주세요.");
                s.nextLine();
                s.nextLine();
            }else if(val == 3){
                System.out.printf("조회하고 싶은 학생의 번호를 입력해주세요!\n입력 : ");
                no = s.nextInt()-1;
                System.out.printf((no+1) + "번 학생의 정보입니다.\n");
                student[no].output_all();
                System.out.printf("\n확인이 끝났다면 enter를 눌러주세요!");
                s.nextLine();
                s.nextLine();
            }else if(val == 4) {
                enter();
                System.out.printf("프로그램을 종료합니다.");
                end = false;
            }
            else{ Fi(); }
            enter();
        }while(end);
    }
    public static void Fi(){
        System.out.printf("잘못된 입력입니다. 처음단계로 되돌아 갑니다.");
    }
    public static void enter() { System.out.printf("\n\n\n\n\n\n\n\n\n"); }
}