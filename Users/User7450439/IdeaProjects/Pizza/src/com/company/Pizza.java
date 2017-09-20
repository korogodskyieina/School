package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.Files.exists;


public class Pizza {
    String Add;
    int x;
    int y;



    public static String read(String Pizza) throws FileNotFoundException {
        //Этот спец. объект для построения строки
        StringBuilder sb = new StringBuilder();

        exists(Pizza);

        try {
            //Объект для чтения файла в буфер
            File file = new File(Pizza);
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;

                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");

                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Возвращаем полученный текст с файла
        return sb.toString();

    }

    private static void exists(String Pizza) {
    }


}
