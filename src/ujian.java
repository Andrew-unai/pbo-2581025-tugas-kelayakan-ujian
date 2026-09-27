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
}
}
