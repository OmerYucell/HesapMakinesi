import java.util.Scanner;
 public class main {
    public static void main(String[] args) {
        int n1,n2;
        Scanner input = new Scanner(System.in);

        System.out.print("1.işlem+,\n2.işlem-,\n3.işlem*,\n4.işlem/ :");
        int islem = input.nextInt();

        System.out.print("Lütfen İlk Sayıyı Giriniz:");
        n1 = input.nextInt();

        System.out.print("Lütfen İkinci Sayıyı   Giriniz :");
        n2 = input.nextInt();




        switch (islem) {

            case 1:
                System.out.println("Toplama");
                int topla = (n1 + n2);
                System.out.print("Toplama İşlemi :" + topla);
                break;

            case 2:
                System.out.println("Çıkarma");
                int cıkar = (n1 - n2);
                System.out.print("Çıkarma İşlemi :" + cıkar);
                break;

            case 3:
                System.out.println("Çarpma");
                int carpma = (n1 * n2);
                System.out.print("Çarpma İşlemi :" + carpma);
                break;

            case 4:
                System.out.println("Bölme");


                if (n2 != 0){
                    int bölme = (n1 / n2);
                    System.out.println("Bölme İslemi :" + bölme);
                }else {
                    System.out.print("Birsayı 0'a bölünemez");
                }
                break;

            default:
                System.out.println("Lütfen geçerli bir işlem giriniz");
        }


    }
}
