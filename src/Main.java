public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int num = 1;
        String name = "김휘재";
        double doubleValue = 1.2;
        boolean isValid = false;
        System.out.println("출력하고싶은 말");

        // static 메소드에 접근
        staticDan(5);

        // main 객체 메소드에 접근
        Main main = new Main();
        main.dan(9);

        // 주석
        // 쓰는 법1


        /*
        * 주석 쓰는 법2
        * */

        /**
         * 주석 쓰는 법 3
         * */
    }

    private void dan(int num) {
        System.out.println(num+"단");
    }

    public static void staticDan(int num){
        System.out.println(num+"단");
    }



}
