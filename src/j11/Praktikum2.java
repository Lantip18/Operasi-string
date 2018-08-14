
package j11;
import java.util.*;
public class Praktikum2 {
    public static void tampilJudul(String identitas)
    {
        System.out.println("Identitas" + identitas);
        System.out.println("\nConvert Kalimat Alay Angka (Vokal ke Angka\n");
    }
    public static void main(String[] args)
    {
        String identitas = " Lantip Mukti Mumpuni / XR3 / 18";
        tampilJudul(identitas);
        String kalimat = tampilInput();
    }
    private static String tampilInput()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat : ");
        String kalimat = sc.nextLine();
        System.out.print("Kalimat Asli : " + kalimat);
        
        return kalimat;
    }
}
