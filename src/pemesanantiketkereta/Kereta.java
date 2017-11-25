package pemesanantiketkereta;

public class Kereta {
    private String nama;
    private int jalur;
    private String asal;
    private String tujuan;
    private String kelas;  //Kelas kereta (Eksekutif, Bisnis, Ekonomi)
    private Jadwal[] jadwal; 
    private int i=0;
 
    public Kereta(String nama,int jalur, String asal,String tujuan, String kelas) {
        this.jalur = jalur;
        this.nama = nama;
        this.asal = asal;
        this.kelas = kelas;
    }
    
    public void tambahJadwal(String jB, String  jS){     
        Jadwal j = new Jadwal(jB, jS);
        jadwal[i] = j;
        i++;
    }

    public void pindahPosisi(String asal, String tujuan, String tujuanBaru){
        this.asal = tujuan;
        this.asal = tujuanBaru;
    } 
    
    public Jadwal[] getJadwal(){
        return this.jadwal;
    }
    
    public Jadwal getJadwalByIdx (int idx){
        return this.jadwal[idx];
    }
    
    public Jadwal getJadwalByJam(String jam){
         int i = 0;
         while((i < this.jadwal.length)&& (!jadwal[i].getJamBerangkat().equals(jam))){
             i++;
         }
         Jadwal j = jadwal[i];
         if(j != null) return j;
         else{
             System.out.println("Jadwal tidak ditemukan");
             return j;
         }
    }
    
    
    public String getKelas() {
        return kelas;
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public int getJalur() {
        return jalur;
    }
    
    
}
