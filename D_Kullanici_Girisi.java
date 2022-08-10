import java.util.Scanner;

public class D_Kullanici_Girisi {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int select;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanici Adiniz: ");
        userName = scan.nextLine();

        System.out.print("Sifreniz: ");
        password = scan.nextLine();

        if (userName.equals("patika") && password.equals("java101")) {
            System.out.print("Basariyla Giris Yaptiniz :)");
        } else {
            System.out.println("sifre yanlis!");

            System.out.println("Sifreyi sifirlamak icin 1, Cikis yapmak icin 0");
            select = scan.nextInt();
            scan.nextLine();


            switch (select) {

                case 1:
                    System.out.println("Yeni sifrenizi giriniz: ");
                    newPassword = scan.nextLine();
                    if (newPassword.equals("java101")) {  //equals = stringlerde esitlik
                        System.out.println("Yeni sifreniz eskiyisle ayni olamaz");
                    } else {
                        System.out.println("Sifreniz Sifirlandi");
                    }
                    break;

                default:
                    System.out.println("Cikis yapiliyor...");
            }


        }
    }
}
