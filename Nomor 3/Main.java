import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a customer
        System.out.println("Masukkan ID Customer: ");
        int customerId = scanner.nextInt();
        System.out.println("Masukkan Password Customer: ");
        String customerPassword = scanner.next();
        System.out.println("Masukkan Nama Customer: ");
        String customerName = scanner.next();
        System.out.println("Masukkan Umur Customer: ");
        int customerAge = scanner.nextInt();
        System.out.println("Masukkan Email Customer: ");
        String customerEmail = scanner.next();
        System.out.println("Masukkan Dokumen Customer: ");
        String customerDoc = scanner.next();

        Customer customer = new Customer(customerId, customerPassword, customerName, customerAge, customerEmail, customerDoc);

        // Customer login
        if (customer.logIn(customerId, customerPassword)) {
            System.out.println("Login sebagai Customer: " + customer.getName());
            // Customer applies for verification
            customer.applyVerification(customerDoc);
        } else {
            System.out.println("Login gagal!");
        }

        // Create an admin
        System.out.println("\nMasukkan ID Admin: ");
        int adminId = scanner.nextInt();
        System.out.println("Masukkan Password Admin: ");
        String adminPassword = scanner.next();
        System.out.println("Masukkan Nama Admin: ");
        String adminName = scanner.next();
        System.out.println("Masukkan Umur Admin: ");
        int adminAge = scanner.nextInt();
        System.out.println("Masukkan Email Admin: ");
        String adminEmail = scanner.next();
        System.out.println("Masukkan Dokumen Admin: ");
        String adminDoc = scanner.next();

        Admin admin = new Admin(adminId, adminPassword, adminName, adminAge, adminEmail, adminDoc);

        // Admin login
        if (admin.logIn(adminId, adminPassword)) {
            System.out.println("Login sebagai Admin: " + admin.getName());
            // Admin verifies customer
            admin.verifyUser(customer);
            System.out.println("Status Verifikasi Customer: " + (customer.getVerificationStatus() ? "Terverifikasi" : "Belum Terverifikasi"));
        } else {
            System.out.println("Login gagal!");
        }

        scanner.close();
        System.out.println("===========================\n          Selesai\n===========================");
    }
}
