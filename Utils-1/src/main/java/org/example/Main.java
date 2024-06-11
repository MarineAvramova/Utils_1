package org.example;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the path to read without commas please:");
        String path = scanner.nextLine();

        File directory = new File(path);

        DirectoryReader.readFolders(directory);
    }
}