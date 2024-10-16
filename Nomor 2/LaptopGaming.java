public class LaptopGaming extends Laptop {
    private String gpu;

    public LaptopGaming(String merek, String ukuranLayar, double harga, String penyimpanan, String processor, String gpu) {
        super(merek, ukuranLayar, harga, penyimpanan, processor);  // Memanggil konstruktor kelas induk
        this.gpu = gpu;
    }

    public void mainGame(String namaGame) {
        System.out.println("Memainkan game: " + namaGame);
    }

    public String getInfo() {
        return super.getInfo() + "\nGPU: " + gpu;
    }
}
