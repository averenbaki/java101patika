package PatikaPratik;

import java.util.Scanner;

public class C03_hipotenüsHesapla {//a2+b2=c2 ,
    public static void main(String[] args) {

        double a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("ilk kenar uzunluğunu giriniz : ");
        a=sc.nextDouble();
        System.out.println("ikinci kenar uzunluğunu giriniz");
        b=sc.nextDouble();

        c=Math.sqrt((a*a)+(b*b));//kenarların karesinin karekökü

        System.out.println("hipotenüs = " +c);


              double  alan = (a*b) / 2;//dik üçgende hipotenüs ü c olarak seçmiştik
              double cevre=a+b+c;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);


    }


}
