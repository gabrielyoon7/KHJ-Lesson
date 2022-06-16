package fifa;

import java.util.Scanner;

public class FifaManager {

    public void run(){
        read();
        menu();
    }

    public void read(){
        System.out.println("앱 실행 시 데이터 읽을 예정");
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("메뉴를 입력하세요. 1: 선수 조회, 2: 선수 등록");
            int menu = scanner.nextInt();
            switch(menu){
                case 1:
                    System.out.println("등록된 선수 목록 출력");
                    break;
                case 2:
                    System.out.println("선수 등록하기");
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}
