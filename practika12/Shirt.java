package ru.mirea.practika12;

public class Shirt {
    String[] shirts = new String[11];
    Shirt(){
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        String[] temp;
        for (String shirt : shirts) {
            temp = shirt.split(",");
            s.append("Номер: ").append(temp[0]).append("; Модель: ").append(temp[1]).append("; Цвет: ").append(temp[2]).append("; Размер: ").append(temp[3]).append("\n");
        }
        return s.toString();
    }
}
