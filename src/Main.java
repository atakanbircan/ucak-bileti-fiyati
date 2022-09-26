import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe ,yas;
        int yolculukTipi;
        double kmBasiUcret= 0.1 ;
        Scanner input =new Scanner(System.in);
        System.out.println("mesafe(km): ");
        mesafe=input.nextInt();
        System.out.println("yolcu yaşı :");
        yas=input.nextInt();
        System.out.println("yolculuk tipi(1 => Tek Yön , 2 => Gidiş Dönüş : ");
        yolculukTipi=input.nextInt();

        if (mesafe>=0 && yas>=0 && yolculukTipi<3 && yolculukTipi>0 ){
            double sonuc;
            if (yolculukTipi==2) {
                sonuc = toplamHesap(kmBasiUcret,mesafe)*2;
                sonuc=sonuc-(sonuc/5);
                if (yas < 12) {

                    System.out.println(sonuc / 2);
                } else if (yas >= 12 && yas < 24) {
                    System.out.println(sonuc - (sonuc / 10));
                } else if (yas > 65) {
                    System.out.println(sonuc - (sonuc * 0.3));
                }
            }

            else if(yolculukTipi==1) {
                sonuc = toplamHesap(kmBasiUcret,mesafe);
                if (yas < 12) {

                    System.out.println(sonuc / 2);
                } else if (yas >= 12 && yas < 24) {
                    System.out.println(sonuc - (sonuc / 10));
                } else if (yas > 65) {
                    System.out.println(sonuc - (sonuc * 0.3));
                }
            }
        }
        else {
            System.out.println("Hatalı Veri Girdiniz !");
        }


    }

    private static double toplamHesap(double a,int b) {
        double sonuc=a*b;
        return sonuc;
    }


}