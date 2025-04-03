package org.program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = null;

        File catalogo = new File("C:\\org.program\\Catalog.csv");

        try {
            scan = new Scanner(catalogo);

            while (scan.hasNextLine()) {
                System.out.println(scan.hasNextLine());

            }

        } catch (IOException e) {
            System.out.println("ERROR!" + e.getMessage());
        } finally {
            {
                if (scan != null){
                    scan.close();
                }


            }
        }
    }
}