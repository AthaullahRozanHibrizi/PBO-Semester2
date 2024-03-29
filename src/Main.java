import java.util.Scanner;

public class Main {
    // Data user
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";
    private static final int MAHASISWA_NIM_LENGTH = 15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Library Login System");
        System.out.println("Silakan pilih jenis user:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Pilihan Anda: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                adminLogin(scanner);
                break;
            case 2:
                mahasiswaLogin(scanner);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        scanner.close();
    }

    private static void adminLogin(Scanner scanner) {
        System.out.println("=== Login Admin ===");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            System.out.println("Login berhasil sebagai admin.");

        } else {
            System.out.println("Username atau password admin salah.");
        }
    }

    private static void mahasiswaLogin(Scanner scanner) {
        System.out.println("=== Login Mahasiswa ===");
        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        if (nim.length() == MAHASISWA_NIM_LENGTH) {
            System.out.println("Login berhasil sebagai mahasiswa dengan NIM: " + nim);

        } else {
            System.out.println("Panjang NIM tidak sesuai.");
        }
    }
}
