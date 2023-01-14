package PatikaPratik;

import java.util.Scanner;

public class C07_manav {
    public static void main(String[] args) {
/*
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */
        double armut, elma,domates,muz,patlican,fiyat;
        armut=2.14;
        elma=3.67;
        domates=1.11;
        muz=0.95;
        patlican=5.00;

        Scanner sc=new Scanner(System.in);
        System.out.println("kg cinsinden kaç kg armut aldınız = ");
        double armutkg=sc.nextDouble();
        System.out.println("kg cinsinden kaç kg elma aldınız =");
        double elmakg=sc.nextDouble();
        System.out.println("kg cinsinden kaç kg domates aldınız =");
        double domateskg=sc.nextDouble();
        System.out.println("kg cinsinden kaç kg muz aldınız =");
        double muzkg=sc.nextDouble();
        System.out.println("kg cinsinden kaç kg patlıcan aldınız =");
        double patlicankg=sc.nextDouble();

        double total=(armut*armutkg)+(elma*elmakg)+(domates*domateskg)+(muz*muzkg)+(patlican*patlicankg);
        System.out.println("ödemeniz gereken tutar = "+total+" TL");


    }
}
