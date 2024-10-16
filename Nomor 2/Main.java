public class Main {
    public static void main(String[] args) {
        Elektronik elektronik = new Elektronik("Samsung", "15 inch", 5000000);
        Laptop laptop = new Laptop("Asus", "14 inch", 7500000, "512GB SSD", "Intel i5");
        LaptopGaming laptopGaming = new LaptopGaming("Acer", "17 inch", 12000000, "1TB SSD", "Intel i7", "NVIDIA RTX 3070");

        System.out.println("=== Elektronik ===");
        System.out.println(elektronik.getInfo());
        System.out.println();

        System.out.println("=== Laptop ===");
        System.out.println(laptop.getInfo());
        System.out.println();

        System.out.println("=== Laptop Gaming ===");
        System.out.println(laptopGaming.getInfo());
        System.out.println();

        System.out.println("=== Simulasi Game ===");
        laptopGaming.mainGame("Robloxxxxx 2024");
    }
}