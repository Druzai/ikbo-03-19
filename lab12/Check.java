package ru.mirea.lab12;

import java.util.Scanner;
import java.util.regex.*;

public class Check {
    public static void main(String[] ar) {
        Pattern p1 = Pattern.compile("^([012][1-9]|10|20|30|31)/(01|03|05|07|08|10|12)/((1[6-9]|[2-9][0-9])[0-9]{2})|([012][1-9]|10|20|30)/(04|06|09|11)/((1[6-9]|[2-9][0-9])[0-9]{2})|29/02/((1[6-9]|[2-9][0-9])(04|08|[13579][26]|[2468][480])|(16|[2468][048]|[3579][26])00)|(0[1-9]|1[0-9]|2[0-8])/02/((1[6-9]|[2-9][0-9])[0-9]{2})$");
        String input = "";
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext())
            input = scan.next();
        Matcher m1 = p1.matcher( input );
        boolean b = m1.matches();
        System.out.println(("This string '" + input + "' ") + (b ? "matches." : "doesn't match.") );
    }
}
