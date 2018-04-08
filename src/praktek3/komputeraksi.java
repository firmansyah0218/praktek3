package praktek3;

public class komputeraksi {
    public static void main(String[] args) {
        komputer k = new komputer();
        k.setMerk("acer");
        k.setSpesifikasi("intel inside, 3gb");
        k.setHarga(4000000);
        
        k.cetakInfo();
        
        System.out.println("Merknya \t:");
        System.out.println(k.getMerk());
        System.out.println("Spesifikasi \t:");
        System.out.println(k.getSpesifikasi());
        System.out.println("Harganya \t:");
        System.out.println(k.getHarga());
    }
}
