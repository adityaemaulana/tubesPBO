package pemesanantiketkereta;

public class Jadwal {
    private String jamBerangkat;
    private String jamSampai;
    private Penumpang[] penumpang = new Penumpang[50];
    private int i = 0;

    public Jadwal(String jB, String jS) {
        this.jamBerangkat = jB;
        this.jamSampai = jS;

    }
    
    public void tambahPenumpang(Penumpang p){
        if(penumpang.length <= 50){
            penumpang[i] = p;
            p.setNoKursi(i+1);
            i++;
            System.out.println("Penumpang berhasil ditambahkan");
        } else System.out.println("Kereta Penuh");
    }

    public String getJamBerangkat() {
        return jamBerangkat;
    }

    public String getJamSampai() {
        return jamSampai;
    }

    public boolean isFull(){
        return penumpang.length == 50;
    }
    
    
}
