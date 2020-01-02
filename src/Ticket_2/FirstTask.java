package Ticket_2;

public class FirstTask {
    public static void main(String[] args) {
        int s = 0;
        int i = 0;
        while (s<100) {
            s+=i++;
        }

        System.out.println(s);

        s = 0;
        for (int j = 0; s < 100; j++){
            s += j;
        }

        System.out.println(s);

        System.out.println(rec(100));
    }

    public static int rec(int i){
        if (i <= 0){
            return 0;
        }
        int sum = rec(i - 1);
        if (sum < 100){
            return sum + i;
        } else {
            return sum;
        }
    }
}
