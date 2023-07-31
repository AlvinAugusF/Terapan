package Controlers;

/*public class Nama_Barang {
    private String namaB;
    private Float Harga;
    public Nama_Barang(String namaB){
        this.namaB = namaB;
    }
    public String getNamaB(){return namaB;}
    public void setNama(String n){this.namaB = n;}
    public String toString(){return namaB;}


    public Nama_Barang(Float Harga){
        this.Harga = Harga;
    }
    public Float getHarga(){return Harga;}
    public void setHarga(Float H){this.Harga= H;}


}*/
// getter setter dan pengatur isi barang Control_Inventory
public class Nama_Inventory {
    private String Nama;
    private Integer Banyak;

    public Nama_Inventory(String Nama, Integer Banyak) {
        this.Nama = Nama;
        this.Banyak = Banyak;

    }

    public String getNama() {
        return Nama;
    }

    public Integer getBanyak() {
        return Banyak;
    }
}

