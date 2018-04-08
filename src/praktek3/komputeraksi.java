package praktek3;

public class komputeraksi {
    public static void main(String[] args) {
        komputer k = new komputer();
        k.setMerk("acer");
        k.setSpesifikasi("intel core i3, 4gb");
        k.setHarga(10000000);
        
        k.cetakInfo();
        
        System.out.println("Merknya \t:");
        System.out.println(k.getMerk());
        System.out.println("Spesifikasi \t:");
        System.out.println(k.getSpesifikasi());
        System.out.println("Harganya \t:");
        System.out.println(k.getHarga());
        
        
        laptop L = new laptop();
        L.setMerk("asus");
        L.setSpesifikasi("intel inside , 3gb");
        L.setHarga(4000000);
        L.setWarnalaptop("merah");
        L.cetakInfo();
        System.out.println("Warna \t:"+L.getWarnalaptop());
        
        tablet T = new tablet();
        T.setMerk("asus");
        T.setSpesifikasi("intel inside , 3gb");
        T.setHarga(4000000);
        T.setUkuranlayar("7inch");
        T.cetakInfo();
        System.out.println("Ukuran \t:"+T.getUkuranlayar());
        
          flipbook F = new flipbook();
        F.setMerk("asus");
        F.setSpesifikasi("intel inside , 3gb");
        F.setHarga(4000000);
        F.setJenislayar("LED");
        F.cetakInfo();
        System.out.println("Jenis \t:"+F.getJenislayar());
    }
}
