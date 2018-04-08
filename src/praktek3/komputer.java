package praktek3;

public class komputer {
    private String merk;
    private String spesifikasi;
    private double harga;
    
    
    void cetakInfo(){
        System.out.println("Merk \t;"+merk+"\n"+
                "Spesifikasi \t;"+spesifikasi+"\n"+
                "Harga \t;"+harga);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public void setSpesifikasi(String spesifikasi) {
        this.spesifikasi = spesifikasi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}
