package ru.mirea.practika12;

import java.util.Scanner;

public class Tests {
    public static String getLine(String strname){
        String s;
        char selChar;
        int firstI, lastI;
        boolean flag = true;
        StringBuilder sb = new StringBuilder(strname);
        while (flag){
            flag = false;
            firstI = 0;
            lastI = 0;
            s = "";
            for (int i = 0; i < strname.length(); i++){
               lastI = i;
               if (sb.charAt(i) == ' '){
                   if(!(Character.toLowerCase(sb.charAt(i-1)) == Character.toLowerCase(sb.charAt(i+1)))){
                       s = sb.substring(firstI, lastI+1);
                       selChar = sb.charAt(lastI-1);
                       sb.delete(firstI, lastI+1);
                       if (sb.charAt(0) == selChar){
                           sb.insert(0, s);
                           flag = true;
                       }
                       else {
                           for (int j = 0; j < sb.length(); j++){
                               if (sb.charAt(j) == ' ') {
                                   if (Character.toLowerCase(sb.charAt(j+1)) == Character.toLowerCase(selChar)) {
                                       sb.insert(j+1, s);
                                       flag = true;
                                       break;
                                   }
                               }
                           }
                       }
                       if(!flag){
                           sb.append(" ");
                           sb.append(s.trim());
                           flag = true;
                       }
                       break;
                   }
                   else {
                       firstI = i+1;
                   }
               }
            }
        }
        return sb.toString();
    }
    public static void main(String[] ar) {
        Person pr1 = new Person("Пономарев");
        Person pr2 = new Person("Арапов", "Олег", "Геннадьевич");
        Address adr = new Address("Россия, Центральный, Москва, Проспект Вернадского, дом 78, корпус 1, кв. 45");
        Number nm1 = new Number("+104289652211");
        Number nm2 = new Number("89175655655");
        Shirt sh = new Shirt();
        System.out.println(pr1.getFCS());
        System.out.println(pr2.getFCS());
        System.out.println(adr);
        System.out.println(sh);
        System.out.println(nm1);
        System.out.println(nm2);
        Scanner sc = new Scanner(System.in);
        System.out.println(getLine(sc.nextLine()));
    }
}
