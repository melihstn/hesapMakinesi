import java.util.Scanner;

public class hesapOdev1 {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-bölme");
        System.out.print("seçiminiz:");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("toplam: "+ (n1+n2));
                break;
            case 2:
                System.out.print("çıkartma :"+ (n1 - n2));
                break;
            case 3:
                System.out.print("çarpma: "+ (n1 * n2));
                break;
            case 4:
                System.out.print("bölme:"+ (n1/n2));
            default:

        }
    }

}
