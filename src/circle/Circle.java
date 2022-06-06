package circle;

public class Circle {
    public int radius;
    public String name;

    public Circle(int radius){ //생성자 메소드
        this.radius = radius;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

}
