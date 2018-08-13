package j11;
import java.util.Scanner;
public class Praktikum2 {
    public static void tampilJudul(String identitas){
        System.out.println("Identitas : " + identitas);
        System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");
        
        String identitas = "Lantip Mukti M. / X RPL 3 / 18";
        
        tampilJudul(identitas);
    }
    private static String tampilInput(){
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Masukkan kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
    }
}
