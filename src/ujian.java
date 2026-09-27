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

    System.out.println("\n===== KELAYAKAN UJIAN =====");
    System.out.println("Kehadiran    : " + kehadiran + "%");
    System.out.println("Nilai tugas  : " + tugas);
    System.out.println("Dispensasi   : " + dispensasi);
    System.out.println("a (tanpa kurung)      : " + a);
    System.out.println("b (kurung precedence) : " + b);
    System.out.println("c (kurung digeser)    : " + c);
    System.out.println("!dispensasi           : " + notDispensasi);
    // Kesimpulan: a = b selalu, karena && lebih diprioritaskan dari ||.

    int cek = 0;
    boolean x = (kehadiran >= 75) && (cek++ >= 0);
    boolean y = (tugas >= 60) || (cek++ >= 0);
    System.out.println("cek dipanggil: " + cek);
    // cek tetap 0: di x, (kehadiran >= 75) udah nentuin hasil && jadi
    // false duluan, jadi sisi kanan (cek++) nggak sempat dijalanin. Di y,
    // (tugas >= 60) udah nentuin hasil || jadi true duluan, jadi sisi
    // kanannya juga nggak sempat dijalanin. Dua-duanya kena short-circuit.

    input.close();
}
}
