import fifa.FifaManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****************************");
        System.out.println("*김휘재 과외용 자바 실습 프로그램*");
        System.out.println("*****************************");
        System.out.println();
        System.out.println();
        Main main = new Main();
        main.run();
    }

    public void run() {
        System.out.println("0: 프로그램 종료");
        System.out.println("1: 피파 선수 관리 프로그램");
        System.out.println("어떤 프로그램을 실행할까요? ");

        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();
        switch(menu){
            case 0:
                System.out.println("프로그램을 종료합니다.");
                break;
            case 1:
                FifaManager fifaManager = new FifaManager();
                fifaManager.run();
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
    }


}
