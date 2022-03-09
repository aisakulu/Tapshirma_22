package Peaksoft;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        String character = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String characterToLoverCase = character.toLowerCase();
        String numberToChars = "0123456789";

        File file = new File("Character.txt");
        FileWriter writer = new FileWriter(file);

        for (int i = 0; i < character.length(); i++) {
            writer.write(character.charAt(i) + " " + characterToLoverCase.charAt(i) + "\n");
        }
        for (int i = 0; i < numberToChars.length(); i++) {
            writer.write(numberToChars.charAt(i) + "\n");
        }
        writer.close();

        try (FileReader fileReader = new FileReader(file)) {
            Scanner scanner = new Scanner(fileReader);
            int temp = 0;

            while (scanner.hasNext()) {
                temp++;
                if (temp < 10) {
                    System.out.println(temp + ": " + scanner.nextLine());
                } else {
                    System.out.println(temp + ": " + scanner.nextLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
