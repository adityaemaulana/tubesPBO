package pemesanantiketkereta;

public class Transaksi {
    private String tglBayar;
    private int id;
    private Kereta kereta;
    private Jadwal jadwal;
    private Tiket[] tiket;
    private Penumpang penumpang;
    private int i = 0;
    
    public void Transaksi(int id){
        this.id = id;
    }
    
    public void beliTiket(Penumpang penumpang, Tiket tiket, String tglBayar){
        if(tiket.getKereta().getJadwalByJam(tiket.getJamBerangkat()).isFull()){
            System.out.println("Kereta penuh, tiket tidak dapat dibeli");
        }else{
            this.tglBayar = tglBayar;
            tiket.getKereta().getJadwalByJam(tiket.getJamBerangkat()).tambahPenumpang(penumpang);
            System.out.println("Tiket berhasil dibeli");
        }
        
    }
    
    public void tambahTiket(Tiket t){
        tiket[i] = t;
        i++;
    }
    public void tambahTiketPenumpang(Penumpang p, Tiket t){
        p.getTiket()[p.getIdx()] = t;
    }
    
    public void showTiket(){
        for (int j = 0; j < tiket.length; j++) {
            for (int k = 0; k < tiket[j].getKereta().getJadwal().length; k++) {
                System.out.print("Nama: " + tiket[j].getKereta().getNama());
                System.out.print(" || Asal: " + tiket[j].getAsal());
                System.out.print(" || Tujuan: " + tiket[j].getTujuan());
                System.out.print(" || Jam Berangkat: " + tiket[j].getJamBerangkat());
                System.out.print(" || Jam Sampai: " + tiket[j].getJamSampai());
                System.out.println(" || Harga: " + tiket[j].getHarga());
            }
        }
    }

    
}
