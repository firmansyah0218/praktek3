package praktek3;

public class komputeraksi {
    public static void main(String[] args) {
        komputer k = new komputer();
        k.setMerk("acer");
        k.setSpesifikasi("intel inside, 3gb");
        k.setHarga(4000000);
        
        k.cetakInfo();
    }
}
