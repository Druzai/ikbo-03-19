package ru.mirea.lab8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (FileWriter writer = new FileWriter(System.getProperty("user.dir") + "\\notes.txt", false)) {
            if (sc.hasNext()) writer.write(sc.nextLine());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
