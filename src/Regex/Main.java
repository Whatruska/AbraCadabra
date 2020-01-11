package Regex;

import Ticket_3.Animal;
import Ticket_3.Cat;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"Эвелина", "Регина", "Азат", "Азамат"};

        Pattern regex = Pattern.compile("^(((Эвел)||(Рег))ина)||(Аза(ма)?т)$");
        for (String str : arr){
            System.out.println(str + " " + regex.matcher(str).matches());
        }

        Cat cat = (Cat) new Animal();
    }
}
