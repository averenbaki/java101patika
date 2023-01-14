package PatikaPratik;

import java.util.Scanner;

public class C06_vki {
    public static void main(String[] args) {

double kg,m,vki;
Scanner sc= new Scanner(System.in);
        System.out.println("kilonuzu kg cinsinden giriniz");
        kg=sc.nextDouble();
        System.out.println("boyunuzu metre cinsinden giriniz");
        m=sc.nextDouble();
        vki=kg/(m*m);
        System.out.println("vücut kitle indeksiniz = "+vki);


    }
}
