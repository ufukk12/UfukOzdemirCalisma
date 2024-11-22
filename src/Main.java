import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);



        int sınıfMevcudu;




        System.out.println("Lütfen önce sınıf mevcudunu girin:");
        sınıfMevcudu = scn.nextInt();

        int[] notlar = new int[sınıfMevcudu];


        int i;
        for (i = 0; i < sınıfMevcudu; i++) {

            System.out.println((i+1) + ", Öğrencinin notunu girin:");
            notlar[i] = scn.nextInt();






        }
/* Notları sondan başa while döngüsüyle bu şekil yazabildim fakat while döngüsü durmadığından
* 1. girilen notu yazdırdıktan sonra "notlar[-1] i yazdırmak istiyor ve hata veriyor
 */


        System.out.println("Notların Sondan Başa sıralanmış hali;");
        i = 0;
        while (i < sınıfMevcudu) {

            System.out.println(notlar[i+sınıfMevcudu-1]);
            i--;

        }



        System.out.println("----------------------------------");


        //for kullanarak dizi elemanlarını yazdırma

        for (i = 0; i < notlar.length; i++) {
            System.out.println(notlar[i]);
        }

        /*
        notlar.lenght komutunu intelJ kendi tamamladı böyle keşfettim ama bunun yerine sınıfMevcudu da kullanabilirdik
        tek fark 1. for döngsünde notlar.lenght kullanamazdık çünkü daha notlar dizisinin içi boş
         */














    }
}