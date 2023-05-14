package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int total = 0;
        int count = 0;
        double avarage;

        System.out.println("Sayı giriniz : ");
        number = input.nextInt();
        for (int i = 0; i <= number; i++){
            total+=i;
            count++;

        }
        avarage = total/count;
        System.out.println("3e ve 4e modu olan sayıların ortalaması : "+avarage);
    }
}