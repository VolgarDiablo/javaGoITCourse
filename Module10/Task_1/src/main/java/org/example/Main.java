package org.example;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String regex = "\\d{3}-\\d{3}-\\d{4}|\\(\\d{3}\\) \\d{3}-\\d{4}";
        Pattern pattern = Pattern.compile(regex);

        String separator = File.separator;
        String path = "src" + separator + "main" + separator + "resources" + separator + "file.txt";

        File file = new File(path);

        if (file.exists()) {
            System.out.println("Файл існує.");
        } else {
            System.out.println("Файл не знайдено.");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.matches()) System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Помилка при читанні файлу: " + e.getMessage());
        }

    }
}