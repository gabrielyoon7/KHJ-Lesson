package fifa;

import fifa.player.Player;
import fifa.player.PlayerManager;

import java.util.Scanner;

public class FifaManager {

    PlayerManager playerManager = new PlayerManager();

    public void run(){
        readPlayers();
        menu();
    }

    public void readPlayers(){
        playerManager.readAll();
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println();
            System.out.println();
            System.out.println("메뉴를 입력하세요");
            System.out.println("1. 선수 출력");
            System.out.println("2. 선수 등록");
            System.out.println("3. 선수 검색");
            int menu = scanner.nextInt();
            switch(menu){
                case 1:
                    playerManager.printAll();
                    break;
                case 2:
                    playerManager.readPlayer();
                    break;
                case 3:
                    playerManager.searchPlayer();
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}
