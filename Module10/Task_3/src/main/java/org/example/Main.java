package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String separator = File.separator;
        String inputFile = "src" + separator + "main" + separator + "resources" + separator + "words.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {

        } catch (IOException e) {
            System.out.println("Помилка: Не вдалося зчитати дані з файлу file.txt.");
            e.printStackTrace();
        }

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }
}