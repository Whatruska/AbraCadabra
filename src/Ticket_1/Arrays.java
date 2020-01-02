package Ticket_1;

public class Arrays {
    public static final char[] glas = new char[]
            {'e','y','u','i','o','a'};
    public static void main(String[] args) {
        String[] arr = new String[]{"itiskfu", "aabcde", "aabcde"};

        boolean isExists = false;
        for (int i = 0; i < arr.length - 1; i++){
            String str1 = arr[i];
            String str2 = arr[i + 1];
            if (isCorrectStrings(str1, str2)){
                isExists = true;
                break;
            }
        }

        if (isExists){
            System.out.println("Существуют");
        } else {
            System.out.println("Чет таких не вижу");
        }
    }

    public static boolean isCorrectStrings(String string1, String string2){
        for (int i = 0; i < string1.length(); i++){
            if (i % 2 == 0){
                char ch1 = string1.charAt(i);
                char ch2 = string2.charAt(i);
                if (isLetter(ch1) && isLetter(ch2)){
                    if ((isGlas(ch1) && isSogl(ch2)) || (isSogl(ch1) && isGlas(ch2))){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isLetter(char ch){
        return ch >= 'a' && ch <= 'z';
    }

    public static boolean isGlas(char ch){
        for (char c : glas){
            if (c == ch){
                return true;
            }
        }
        return false;
    }

    public static boolean isSogl(char ch){
        return !isGlas(ch);
    }
}
