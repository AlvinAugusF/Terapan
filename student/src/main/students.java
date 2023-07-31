package main;

public class students {

    private String nama;
    public students(String nama){
        this.nama = nama;
    }
    public String getNama(){return nama;}
    public void setNama(String n){this.nama = n;}
    public String toString(){return "nama : " + nama;}
}
