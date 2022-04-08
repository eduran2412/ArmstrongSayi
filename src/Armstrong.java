import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){

        int girilenSayi,basamakSayisi=0,usluDeger,basamakDegeri=0, usluToplami=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        girilenSayi = scanner.nextInt();

        int geçiciGirilenSayi = girilenSayi; // girilen sayı kaybolmasın, en son karşılaştırma yapalım diye

        while (geçiciGirilenSayi!=0){
            geçiciGirilenSayi /= 10;
            basamakSayisi++;   // kaç basamaklı olduğu

        }

        geçiciGirilenSayi = girilenSayi; // 2. while için tekrar girilen sayı değeri lazım

        while (geçiciGirilenSayi!=0){

            basamakDegeri= geçiciGirilenSayi % 10;  // basamağın değeri mod alma

            usluDeger = 1;
            for(int i=1; i<=basamakSayisi; i++){
                usluDeger *= basamakDegeri;
            }

            geçiciGirilenSayi /= 10;
            usluToplami += usluDeger;

        }

        if (girilenSayi == usluToplami){
            System.out.println(girilenSayi+" Bir Armstrong Sayıdır..");
        }else
            System.out.println(girilenSayi+" Bir Armstrong Sayı Değildir!!");



    }
}
