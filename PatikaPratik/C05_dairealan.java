package PatikaPratik;

import java.util.Scanner;

public class C05_dairealan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        double pi = 3.14;
        System.out.print("Dairenin yarı çapını giriniz: ");
        r=sc.nextInt();
        double alan = pi *r *r;
        double cevre = 2*pi*r;
        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dairenin çevresi: " +cevre);

        System.out.println("alanını istediğiniz açıyı giriniz ");
        double alfa=sc.nextDouble();
        double acılıalan= (pi * (r*r) * alfa) / 360;
        System.out.println(alfa+" dereceli bölgenin alanı = "+acılıalan);


    }
}
