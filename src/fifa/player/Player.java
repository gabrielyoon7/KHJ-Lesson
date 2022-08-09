package fifa.player;

import java.util.Scanner;

public class Player {
    int num; //고유번호
    String name; //이름

    public void read(int num, String name){
        this.num = num;
        this.name = name;
    }

    public void print(){
        System.out.println(num+" "+name);
    }

    public void matches(String keywords) {
        if(name.contains(keywords)){
            System.out.println("name : "+name);
        }
    }

}
