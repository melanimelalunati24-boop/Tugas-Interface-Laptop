import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Laptop laptopDipilih = null;

        System.out.println("=== SILAHKAN PILIH LAPTOP ===");
        System.out.println("1. Toshiba");
        System.out.println("2. MacBook");
        System.out.print("Pilih (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // membersihkan buffer

        if (pilihan == 1) {
            laptopDipilih = new Toshiba();
            System.out.println("Anda memilih Toshiba.");
        } else if (pilihan == 2) {
            laptopDipilih = new MacBook();
            System.out.println("Anda memilih MacBook.");
        } else {
            System.out.println("Pilihan tidak valid. Program keluar.");
            scanner.close();
            return;
        }

        // Instansiasi user dengan laptop yang dipilih
        LaptopUser user = new LaptopUser(laptopDipilih);
        String aksi;

        System.out.println("\n=== KONTROL LAPTOP ===");
        System.out.println("Ketik 'ON'   -> Menyalakan laptop");
        System.out.println("Ketik 'OFF'  -> Mematikan laptop");
        System.out.println("Ketik 'UP'   -> Menambah volume");
        System.out.println("Ketik 'DOWN' -> Mengurangi volume");
        System.out.println("Ketik 'KELUAR' -> Menyudahi program");
        System.out.println("======================");

        do {
            System.out.print("\nMasukkan perintah: ");
            aksi = scanner.nextLine().trim().toUpperCase();

            switch (aksi) {
                case "ON":
                    user.turnOnLaptop();
                    break;
                case "OFF":
                    user.turnOffLaptop();
                    break;
                case "UP":
                    user.makeLaptopLouder();
                    break;
                case "DOWN":
                    user.makeLaptopSilent();
                    break;
                case "KELUAR":
                    System.out.println("Keluar dari sistem simulator.");
                    break;
                default:
                    System.out.println("Perintah salah! Gunakan ON, OFF, UP, DOWN, atau KELUAR.");
            }
        } while (!aksi.equals("KELUAR"));

        scanner.close();
    }
}