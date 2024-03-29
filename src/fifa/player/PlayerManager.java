package fifa.player;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {
    ArrayList<Player> players = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void readAll(){
        System.out.println("###앱 실행 시 여기서 자동으로 데이터 읽을 예정");
    }

    public void printAll(){
        for(Player p : players){
            p.print();
        }
    }

    public void searchPlayer() {
        System.out.println("검색할 단어를 입력하세요. (1단어)");
        String keyword = scanner.next();
        System.out.println(keyword);
        for(Player p : players){
            p.matches(keyword);
        }
    }

    public void readPlayer(){
        System.out.println("----------------------------");
        System.out.println("선수 1명을 등록합니다.");
        System.out.println("고유번호 이름");
        System.out.println("순으로 작성 후 엔터를 누르세요.");
        System.out.println("0을 누르면 종료");
        System.out.println("ex) 10 메시");
        System.out.println("----------------------------");
        while (true) {
            Player player = new Player();
            int num = scanner.nextInt();
            if(num==0){
                break;
            }
            String name = scanner.next();
            player.read(num, name);
            players.add(player);
        }
    }

}


