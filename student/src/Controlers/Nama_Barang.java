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
// getter setter untuk nama barang atau data untuk tabel yang ada pada control_resi
public class Nama_Barang {
    private String Nama;
    private Integer Harga;
    private Integer Banyak;
    private Integer Total;

    public Nama_Barang(String Nama, Integer Harga, Integer Banyak, Integer Total){
        this.Nama = Nama;
        this.Harga = Harga;
        this.Banyak = Banyak;
        this.Total = (Harga * Banyak);

    }

    public String getNama() {
        return Nama;
    }

    public Integer getHarga() {
        return Harga;
    }

    public Integer getBanyak() {
        return Banyak;
    }
    public Integer getTotal(){
        return Total;
    }
}
