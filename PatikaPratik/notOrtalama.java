package PatikaPratik;

import java.util.Scanner;

public class notOrtalama {

    public static void main(String[] args) {

        int mat,fiz,tur,kim,tar,muz;
        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = scan.nextInt();
        System.out.print("Fizik Notunuzu Giriniz : ");
        fiz = scan.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz : ");
        tur = scan.nextInt();
        System.out.print("Kimya Notunuzu Giriniz : ");
        kim = scan.nextInt();
        System.out.print("Tarih Notunuzu Giriniz : ");
        tar = scan.nextInt();
        System.out.print("Müzik Notunuzu Giriniz : ");
        muz = scan.nextInt();

        int toplam = (mat+fiz+tur+kim+tar+muz);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);
        String b = (sonuc >=60) ? "Sınıfı Geçtiniz ! " : "Sınıfı Geçemediniz ! ";
        System.out.println(b);


    }




}
