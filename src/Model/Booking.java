package Model;

public class Booking extends Tiket{
    private int kodeBooking;

    public Booking(int kode, int id, Kereta kereta, String jamBerangkat, String jamSampai, String tglBerangkat, String asal, String tujuan, int harga) {
        super(id, kereta, jamBerangkat, jamSampai, tglBerangkat, asal, tujuan, harga); 
        this.kodeBooking = kode;
    }
 
    public void showBooking(){
        System.out.println("Kode booking : " + this.kodeBooking + " ,harap checkin di stasiun terdekat");
    }

    public int getKodeBooking() {
        return kodeBooking;
    }

    public void setKodeBooking(int kodeBooking) {
        this.kodeBooking = kodeBooking;
    }
    
    
}
