import java.util.Scanner;



class nomor {

    public void bilangan (int total ){
        for (int i=1; i<= total; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                System.out.println("Hello World");
            } else if (i % 5 == 0 ){
                System.out.println("World");
            } else if (i % 3 == 0 ){
                System.out.println("Hello");
            } else {
                System.out.println(i);
            }

        }


    }


}

public class no1 {
    public static void main(String[] args) {

        nomor hasil = new nomor();

        Scanner input = new Scanner(System.in);
//        System.out.printf("Hello World");
        hasil.bilangan(80);









    }
}
