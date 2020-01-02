package Ticket_2;

public class Arrays {
    public static void main(String[] args) {
        String[] strings = new String[]{"itiskfu", "aabcde", "aabcde"};
        boolean isOK = true;
        for (int i = 0; i < strings.length - 1; i++){
            String str1 = strings[i];
            String str2 = strings[i + 1];
            boolean[] map = getLetterMap(str1);

            for (int j = 0; j < str2.length(); j++){
                char ch = str2.charAt(j);
                int index = ch - 'a';
                if (map[index]){
                    System.out.println("Нашли не подходящую строку");
                    isOK = false;
                    break;
                }
            }
        }
        if (isOK) {
            System.out.println("Все ок");
        }
    }

    public static boolean[] getLetterMap(String str){
        boolean[] map = new boolean[26];
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int index = ch - 'a';
            map[index] = true;
        }
        return map;
    }
}
