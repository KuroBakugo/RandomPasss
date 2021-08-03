package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.io.*;
import java.util.Random;

public class RandomPasswordGenerator {

    private static int lengthPassword = 0;
    private static String nameFile = "F:/Учеба/Password/";
    private static String password = "пароль: ";
    private static String FilePassword;
    private JFrame frame;

    public static void setNameFile(String nameFile) {
        RandomPasswordGenerator.nameFile = RandomPasswordGenerator.nameFile + nameFile + ".txt";
    }

    public static void setFilePassword(String filePassword) {
        FilePassword = filePassword;
    }

    public static void setLengthPassword(int lengthPassword) {
        RandomPasswordGenerator.lengthPassword = lengthPassword;
    }

    public static String getNameFile() {
        return nameFile;
    }

    public static int getLengthPassword() {
        return lengthPassword;
    }

    public RandomPasswordGenerator(){
        frame = new JFrame("Crater Password");
        frame.setSize(470, 210);
        frame.add(new MyFrame());
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }



    public static void main(String[] args) throws IOException {

        new RandomPasswordGenerator();
        //System.out.println("Какой длины хотели бы пароль?\n" + "8, 10, 12, 14, 16");

        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //lengthPassword = Integer.parseInt(reader.readLine());

        //System.out.println("Укажите путь для записи пароля: ");
        //nameFile = nameFile + reader.readLine() + ".txt";

        //System.out.println("Этот пароль для чего будет?");
        //FilePassword = reader.readLine();
    }

    public static void choiceLength() {

        switch (lengthPassword) {
            case 8:
                lengthPassword8();
                break;
            case 10:
                lengthPassword10();
                break;
            case 12:
                lengthPassword12();
                break;
            case 14:
                lengthPassword14();
                break;
            case 16:
                lengthPassword16();
                break;
        }
    }

    public static Object choice(int a){
        switch (a){
            case 0:
                return  StoregeNumbers.getStoregeNumber();
            case 1:
                return StoregeSings.getStoregeSingsCaps();
            case 2:
                return StoregeSings.getGetStoregeSingsUppercase();
            case 3:
                return StoregeSymbols.getStoregeSymbols();
        }
        return null;
    }

    public static void lengthPassword8() {
        for (int i = 0; i < 8; i++) {
            Random r = new Random();
            String b = String.valueOf(choice(r.nextInt(4)));
            password = password + b;
        }
        File file = new File(nameFile);
        try (FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Для " + FilePassword + "\n" + password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void lengthPassword10() {
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            String b = String.valueOf(choice(r.nextInt(4)));
            password = password + b;
        }
        File file = new File(nameFile);
        try (FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Для " + FilePassword + "\n" + password);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void lengthPassword12() {
        for (int i = 0; i < 12; i++) {
            Random r = new Random();
            String b = String.valueOf(choice(r.nextInt(4)));
            password = password + b;

        }
        File file = new File(nameFile);
        try (FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Для " + FilePassword + "\n" + password);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void lengthPassword14() {
        for (int i = 0; i < 14; i++) {
            Random r = new Random();
            String b = String.valueOf(choice(r.nextInt(4)));
            password = password + b;
        }
        File file = new File(nameFile);
        try (FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Для " + FilePassword + "\n" + password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void lengthPassword16() {
        Random r = new Random();
        for (int i = 0; i < 16; i++) {
            String b = String.valueOf(choice(r.nextInt(4)));
            password = password + b;
        }
        File file = new File(nameFile);
        try (FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Для " + FilePassword + "\n" + password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
