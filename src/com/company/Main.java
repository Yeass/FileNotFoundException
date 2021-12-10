package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        FileInputStream fis;
        int bajt;

        //procedura pobierania pliku
        try{
            //fis = new FileInputStream("plik.txt");
            fis = new FileInputStream("C:\\Users\\patry\\Desktop\\plik.txt");
        }catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku o takiej nazwie");
            return;
        }

        //wczytujemy kolejne bajty z pliku, az napotkamy koniec pliku
        try {
            do{
                bajt = fis.read(); //wczytuje z pliku
                if (bajt != -1) System.out.println((char) bajt);
            }while (bajt != -1); //gdy rowna sie -1 dotarlismy do konca pliku
        }catch (IOException e){
            System.out.println("Blad oczytu pliku");
        }finally {
            fis.close(); //zamykanie pliku
        }
    }
}
