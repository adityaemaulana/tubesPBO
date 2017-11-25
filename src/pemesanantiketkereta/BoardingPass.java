package pemesanantiketkereta;

public class BoardingPass extends Tiket {
    private String tempatCheckin;
    private String tanggalCheckin;
    private String jalur;

    public BoardingPass(String tC, String tglC, String j, int id, Kereta kereta, String jamBerangkat, String jamSampai, String tglBerangkat, String asal, String tujuan, int harga) {
        super(id, kereta, jamBerangkat, jamSampai, tglBerangkat, asal, tujuan, harga);
        this.jalur = j;
        this.tanggalCheckin = tglC;
        this.tempatCheckin = tC;
    }

    public String getTempatCheckin() {
        return tempatCheckin;
    }

    public String getTanggalCheckin() {
        return tanggalCheckin;
    }

    public String getJalur() {
        return jalur;
    }

   
    public void showDetilKereta(){
        System.out.println("Kereta " + super.getKereta().getNama() + " berada di Jalur " + super.getKereta().getJalur());
    }

    public void setTempatCheckin(String tempatCheckin) {
        this.tempatCheckin = tempatCheckin;
    }

    public void setTanggalCheckin(String tanggalCheckin) {
        this.tanggalCheckin = tanggalCheckin;
    }

    public void setJalur(String jalur) {
        this.jalur = jalur;
    }
}
