import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        String plat1, plat2, plat3, plat4;

        try (Scanner scan = new Scanner(System.in)) {
            plat1 = scan.next();
            plat2 = scan.next();
            plat3 = scan.next();
            plat4 = scan.next();
        }

        String combineS = plat1 + plat2 + plat3 + plat4;
        long combine = Long.parseLong(combineS);

        if (((combine - 999999) % 5) == 0){
            System.out.println("Jalan");
        } else {
            System.out.println("Berhenti");
        }
    }
}


