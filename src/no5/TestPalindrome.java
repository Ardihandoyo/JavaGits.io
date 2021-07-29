package no5;

import java.util.Scanner;

public class TestPalindrome {
    public static void main(String[] args) {

        Scanner Pal= new Scanner(System.in);
        System.out.println("Ketik String : ");
        String str=Pal.next();
        String pal_str=str;

        String rev="";

        int len=str.length();

        for(int i=len-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }

        if(pal_str.equals(rev)){
            System.out.println(pal_str+" True Palindrom");
        }
        else {
            System.out.println(pal_str+" False Palindrom");
        }


    }



}
