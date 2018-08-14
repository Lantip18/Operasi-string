
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
        String kalimat = tampilInput;
        String convert = vocal2Angka(kalimat);
    }
    private static String tampilInput()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan kalimat : ");
        String kalimat = sc.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
    }
    private static String vocal2Angka(String kalimat)
    {
     char [][] arConvert = {{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','0'}};
     
     kalimat = kalimat.toLowerCase();
     for(int i = 0; i<arConvert.length; i++)
         kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
     
     return kalimat;
    }
    }
