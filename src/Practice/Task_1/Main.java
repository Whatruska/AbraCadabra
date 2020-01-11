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
        for (int i = 0; i < numbers.length - 1; i++){
            if (!checkPair(i,numbers,digits)){
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println("Все пары удовлетворяют условию");
        } else {
            System.out.println("Есть некая пара, не удовлетворяющая условию");
        }
    }

    public static boolean checkPair(int ind, int[] numbers, int[][] matrix){
        int[] number = formArrFromInt(numbers[ind]);
        int[] number2 = formArrFromInt(numbers[ind + 1]);

        for (int i = 0; i < matrix.length; i++){
            if (isContain(number, matrix[i])){
                for (int j = 0; j < matrix[0].length; j++){
                    int[] vertical = formVertical(matrix, j);
                    if (isContain(number2, vertical)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int[] formArrFromInt(int i){
        int length = getLengthOfInt(i);
        int[] result = new int[length];
        for (int j = 0; j < length; j++){
            int digit = i % 10;
            result[length - j - 1] = digit;
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
        int index = indexOf(row, arr[0]);
        while (index != Integer.MAX_VALUE){
            for (int i = index; i < arr.length; i++){
                if (arr[i] != row[i]){
                    return false;
                }
            }
            index = indexOf(row, arr[0]);
        }
        return true;
    }

    public static int indexOf(int[] row, int elem){
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < row.length; i++){
            if (row[i] == index){
                index = row[i];
                break;
            }
        }
        return index;
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
