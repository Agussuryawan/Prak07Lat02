package pert702;

/**
 *
 * @author 20101290 I Ketut Agus Suryawan
 */
public class Pert702 {

    public static void main(String[] args) {
        buah dtbuah = new buah ();
        dtbuah.setNAMA("Anggur");
        dtbuah.setWARNA("Unggu");
        dtbuah.setHARGA(150000);
        dtbuah.TampilInfo();
        
        Apel A = new Apel();
        A.setNAMA("Apel Merah");
        A.setWARNA("merah");
        A.setHARGA(20000);
        A.TampilInfo();
    }
    
}
