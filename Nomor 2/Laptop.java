public class Laptop extends Elektronik {
    private String penyimpanan;
    private String processor;

    public Laptop(String merek, String ukuranLayar, double harga, String penyimpanan, String processor) {
        super(merek, ukuranLayar, harga);
        this.penyimpanan = penyimpanan;
        this.processor = processor;
    }

    public String getInfo() {
        return super.getInfo() + "\nPenyimpanan: " + penyimpanan + "\nProcessor: " + processor;
    }
}
