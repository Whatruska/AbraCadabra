package Ticket_1;

public class FirstTask {
    public static void main(String[] args) {
        int s =1;
        for(int i = 0; i < 10; i++) {
            s += i;
            i++;
        }
        System.out.println(s);

        //Потому что i добавляется от 0 до 8 включительно, ну и s изначально равен 1
        System.out.println(rec(8) + 1);
    }

    //Привет, рекурсия
    public static int rec(int i){
        if (i > 0) {
            return i + rec(i - 2);
        }
        return 0;
    }
}
