package pert702;

/**
 *
 * @author 20101290 I Ketut Agus Suryawan
 */
public class Apel extends buah{
//    private String Nama, Warna;
//    private double Harga;
//    
//    public void setNama(String N){
//    this.Nama = N;
//    }
//    public String getNama(){
//    return this.Nama;
//    }
//    public void setWarna(String color){
//    this.Warna = color;
//    }
//    public String getWarna(){
//    return this.Warna;
//    }
//    public void setHarga(double H){
//    this.Harga = H;
    
    @Override
      public void TampilInfo(){
    System.out.println("Informasi Data Harga Buah Apel");
    System.out.println("Nama Buah   :"+this.getNAMA());
    System.out.println("Harga       :"+this.getHARGA());
    System.out.println("Warna       :"+this.getWARNA());
}
}