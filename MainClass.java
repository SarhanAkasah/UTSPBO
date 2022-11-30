package Uts;

public class MainClass {
    public static void main(String[] args) {
        
        // hitung luas persegipanjang CDEF
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.setPanjang(12);
        pp1.setLebar(7);
        double luasCDEF = pp1.getLuas();
         
        // hitung luas setengah lingkaran X
        Lingkaran l1 = new Lingkaran();
        l1.setJejari(6);
        double luasX = 0.5 * l1.getLuas();
         
        // hitung luas daerah diarsir
        double luasArsir =  luasCDEF - luasX;
        System.out.println("Luas daerah diarsir: " + luasArsir + " cm2");
    }
}
