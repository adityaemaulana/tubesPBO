package Model;

public class Penumpang {
    private String nama;
    private String alamat;
    private String gender;
    private int noKursi;
    private Tiket[] tiket;
    private int i=-1;

    public Penumpang(String nama, String alamat, String gender) {
        this.nama = nama;
        this.alamat = alamat;
        this.gender = gender;
    }

    public String getNama() {
        return nama;
    }
    
    public void showTiket(){
        for (int j = 0; j < tiket.length; j++) {
            System.out.println("Tiket - " + i+1);
            System.out.println("Id Tiket: " + tiket[j].getId());
            System.out.print("Nama Kereta: " + tiket[j].getKereta().getNama());
            System.out.print("Asal: " + tiket[j].getAsal());
            System.out.println("Tujuan: " + tiket[j].getTujuan());
            System.out.println("Nomor Kursi" + this.getNoKursi());
        }
    }

    public int getNoKursi() {
        return noKursi;
    }
    
    public void setNoKursi(int noKursi) {
        this.noKursi = noKursi;
    }

    public Tiket[] getTiket() {
        return tiket;
    }

    public int getIdx() {
        i++;
        return i;   
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }  
}
