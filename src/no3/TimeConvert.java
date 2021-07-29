package no3;

import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Waktu format 24jam : ");
        String angka = input.nextLine().trim();
        String jam = angka.substring(0, angka.indexOf(":"));
        String min = angka.substring(angka.indexOf(":")+1);

        int jamInt = Integer.parseInt(jam);
        int jamInt2 = Integer.parseInt(jam);
        if(jamInt > 12 && jamInt<24){
            jamInt=jamInt-12;
        } else if (jamInt==24){
            jamInt=0;
        } else if(jamInt<0 || jamInt>24){
            System.out.println("Waktu Invalid");
        }
        if (jamInt2<12){
            System.out.println("Ekuivalen format 12 jam : "+jamInt +":"+min+"AM");
        } else {
            System.out.println("Ekuivalen format 12 jam : "+jamInt +":"+min+"PM");

        }

    }
}
