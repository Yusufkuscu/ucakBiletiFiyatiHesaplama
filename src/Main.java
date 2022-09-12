import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yas,tip;
        double mbUcret = 0.10, tutar=0, indirim=0, indirimliTutar=0, mesafe=0;


        System.out.println("Mesafe Giriniz(KM) : ");
        mesafe = scan.nextInt();
        System.out.println("Yaş Giriniz : ");
        yas = scan.nextInt();
        System.out.println("Yolculuk Tipini Seçiniz\n1)Tek Yön\n2)Gidiş-Dönüş");
        tip = scan.nextInt();

        if ((mesafe>0) && (yas >0) && (tip==1 || tip==2)){
            tutar = (mbUcret * mesafe);
        }else {
            System.out.println("Hatalı Veri Girdiniz...");
        }

        if(yas < 12){
            indirim = tutar*0.5;
        }else if (yas>=12 && yas<=24){
            indirim = tutar*0.1;
        }else if (yas>65) {
            indirim = tutar * 0.3;
        }else {
            indirim = 0;
        }

        indirimliTutar = tutar - indirim;

        if (tip == 2){
            indirimliTutar -=indirimliTutar * 0.2;
        }

        System.out.println("Toplam Tutar " + indirimliTutar);

    }
}
