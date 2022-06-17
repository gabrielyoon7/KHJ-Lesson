package fifa.player;

import java.util.Scanner;

public class Player {
    int num; //고유번호
    String name; //이름

    public void read(Scanner scanner){
        num = scanner.nextInt();
        name = scanner.next();
    }

    public void print(){
        System.out.println(num+" "+name);
    }

}
