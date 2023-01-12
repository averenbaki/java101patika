package PatikaPratik;

import java.util.Scanner;

public class C02_kdvHesaplama {

    public static void main(String[] args) {
        double tutar,kdv,kdvliTutar;

        Scanner sc=new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar= sc.nextDouble();


        kdv=(tutar<=1000? tutar*0.18:tutar*0.08);
        kdvliTutar =tutar+kdv;

        System.out.println("KDV'siz Tutar: "+tutar);
        System.out.println("KDV : "+kdv);
        System.out.println("KDV'li Tutar: "+kdvliTutar);

        //switch-case de kullanılabilir
    }
}
