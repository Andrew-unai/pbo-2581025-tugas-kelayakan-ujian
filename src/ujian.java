import java.util.Scanner;

public class ujian {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

System.out.print("Kehadiran (%)   : ");
int kehadiran = input.nextInt();

    System.out.print("Nilai Tugas   : ");
    int tugas = input.nextInt();

    System.out.print("Dispensasi   : ");
    boolean dispensasi = input.nextBoolean();

    // a: tanpa kurung. && dikerjain duluan daripada ||.
    boolean a = kehadiran >= 75 && tugas >= 60 || dispensasi;

    // b: kurungnya cuma negasin urutan yang udah kejadian di a, jadi sama aja.
    boolean b = (kehadiran >= 75 && tugas >= 60) || dispensasi;

    // c: kurung digeser, jadi urutannya beda. Baru keliatan bedanya kalau kehadiran < 75.
    boolean c = kehadiran >= 75 && (tugas >= 60 || dispensasi);

    boolean notDispensasi = !dispensasi;

}
}
