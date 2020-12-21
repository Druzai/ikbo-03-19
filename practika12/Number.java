package ru.mirea.practika12;

public class Number {
    String number;
    Number(String number){
        this.number = number;
    }

    @Override
    public String toString() {
        String temp = number;
        if (number.startsWith("+")){
            temp = temp.substring(1);
        }
        int codeC = temp.length() - 10;
        return "+" + temp.substring(0, codeC) + " "
                + temp.substring(codeC + 1, codeC + 4) + "-"
                + temp.substring(codeC + 4, codeC + 7) + "-"
                + temp.substring(codeC + 7);
    }
}
