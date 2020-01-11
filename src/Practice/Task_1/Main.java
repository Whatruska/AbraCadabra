package Practice.Task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива numbers : ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Введите numbers");
        for (int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Введите размерность матрицы digits : ");
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] digits = new int[m][k];
        System.out.println("Введите digits");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                digits[i][j] = scanner.nextInt();
            }
        }

        boolean flag = true;
        main: for (int i = 0; i < n - 1; i++){
            int[] number = formArrFromInt(numbers[i]);
            for (int j = 0; j < m; j++){
                int[] row = digits[j];
                if (isContain(number, row)){
                    int[] number2 = formArrFromInt(numbers[i + 1]);
                    for (int l = 0; l < k; l++) {
                        int[] vertical = formVertical(digits,k);
                        if (!isContain(number2, vertical)){
                            flag = false;
                            break main;
                        }
                    }
                } else {
                    flag = false;
                    break main;
                }
            }
        }
        if (flag){
            System.out.println("Все пары удовлетворяют условию");
        } else {
            System.out.println("Есть некая пара, не удовлетворяющая условию");
        }
    }

    public static int[] formArrFromInt(int i){
        int length = getLengthOfInt(i);
        int[] result = new int[length];
        for (int j = 0; j < length; j++){
            int digit = i % 10;
            result[i] = digit;
            i /= 10;
        }
        return result;
    }

    public static int getLengthOfInt(int i){
        int length = 0;
        while (i > 0){
            length++;
            i /= 10;
        }
        return length;
    }

    public static boolean isContain(int[] arr, int[] row){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != row[i]){
                return false;
            }
        }
        return true;
    }

    public static int[] formVertical(int[][] matrix, int vertIndex){
        int length = matrix.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++){
            result[i] = matrix[i][vertIndex];
        }
        return result;
    }
}
