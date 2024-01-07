class Tas implements TasInterface {
    private String merek;
    private double harga;
    private String ukuran;

    public Tas(String merek, double harga, String ukuranTas) {
        this.merek = merek;
        this.harga = harga;
        this.ukuran = ukuranTas;
    }

    public String getMerek() {
        return merek;
    }

    public double getHarga() {
        return harga;
    }

    public String getUkuran() {
        return ukuran;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Ukuran: " + ukuran + " cm");
    }
}