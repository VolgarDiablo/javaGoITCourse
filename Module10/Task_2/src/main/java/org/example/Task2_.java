package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task2_ {
    public static void main(String[] args) {

        String separator = File.separator;
        String inputFile = "src" + separator + "main" + separator + "resources" + separator + "file.txt";
        String outputFile = "src" + separator + "main" + separator + "resources" + separator + "user.json";

        List<User> userList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            // Читаємо перший рядок з файлу як заголовок
            String header = reader.readLine();
            String[] headers = header.split(" ");

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");

                if (data.length == headers.length) {
                    User user = new User();
                    for (int i = 0; i < headers.length; i++) {
                        String columnName = headers[i];
                        String columnValue = data[i];

                        switch (columnName.toLowerCase()) {
                            case "name":
                                user.setName(columnValue);
                                break;
                            case "age":
                                user.setAge(Integer.parseInt(columnValue));
                                break;
                            // Додайте інші колонки за потребою
                        }
                    }
                    userList.add(user);
                }
            }

            // Записуємо список користувачів у файл JSON
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            try (FileWriter writer = new FileWriter(outputFile)) {
                gson.toJson(userList, writer);
                System.out.println("Дані було успішно записано у файл user.json.");
            } catch (IOException e) {
                System.out.println("Помилка: Не вдалося записати дані у файл user.json.");
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("Помилка: Не вдалося зчитати дані з файлу file.txt.");
            e.printStackTrace();
        }
    }

    static class User {
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}