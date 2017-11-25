package pemesanantiketkereta;

public abstract class Tiket {
    private String jamBerangkat;
    private String jamSampai;
    private String tglBerangkat;
    private String tujuan;
    private String asal;
    private Kereta kereta;
    private int id;
    private int harga;  // Eksekutif = harga + 30% harga, Bisnis = harga + 10% harga, Ekonomi = harga

    public Tiket(int id, Kereta kereta, String jamBerangkat, String jamSampai, String tglBerangkat, String asal, String tujuan, int harga) {
        this.id = id;
        this.kereta = kereta;
        this.kereta.tambahJadwal(jamBerangkat, jamSampai);       
        this.jamBerangkat = jamBerangkat;
        this.jamSampai = jamSampai;
        this.tglBerangkat = tglBerangkat;
        this.tujuan = tujuan;
        this.asal = asal;
        this.harga = this.setHarga(harga);
    }

    public int getHarga() {
        return harga;
    }   
    
    public int setHarga(int harga) {
        this.harga = harga;
        if("Eksekutif".equals(kereta.getKelas())) return harga += (0.3*harga);
        else if("Bisnis".equals(kereta.getKelas())) return harga += (0.1*harga);
        else if("Ekonomi".equals(kereta.getKelas())) return harga += harga;
        else return 0;
    }
    
    public Kereta getKereta(){
        return kereta;
    }   

    public String getJamBerangkat() {
        return jamBerangkat;
    }

    public String getJamSampai() {
        return jamSampai;
    }

    public String getTglBerangkat() {
        return tglBerangkat;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getAsal() {
        return asal;
    }

    public int getId() {
        return id;
    }
    
    
}
