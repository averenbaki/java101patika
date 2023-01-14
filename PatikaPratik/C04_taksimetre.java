package PatikaPratik;

import java.util.Scanner;

public class C04_taksimetre {

   /* Taksimetre Programı
    Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.*/

    public static void main(String[] args) {
        double taksimetreacılıs=10.0;
        double km=2.20;
        double minödenecek=20.0;
        Scanner sc= new Scanner(System.in);
        System.out.println("kaç km gidildi ? ");
        double a=sc.nextDouble();
        double gidilenmesafe=a;
        if ((a*km)+taksimetreacılıs<=minödenecek){
            System.out.println("ödeyeceğiniz tutar = "+minödenecek);
        } else {
            System.out.println("ödeyeceğiniz tutar = "+ ((a*km)+taksimetreacılıs));

        }


    }



}
