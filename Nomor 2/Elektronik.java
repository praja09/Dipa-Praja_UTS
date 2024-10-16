public class Elektronik {
    protected String merek;
    protected String ukuranLayar;
    protected double harga;

    public Elektronik(String merek, String ukuranLayar, double harga) {
        this.merek = merek;
        this.ukuranLayar = ukuranLayar;
        this.harga = harga;
    }

    public String getInfo() {
        return "Merek: " + merek + "\nUkuran Layar: " + ukuranLayar + "\nHarga: " + harga;
    }
}