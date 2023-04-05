import java.util.HashMap;
import java.util.ArrayList;
public class Bus {
    public String namaBus;
    public Bus(String namaBus) {
        this.namaBus = namaBus;
    }
    private final int maxPenumpang = 20;
    private Halte posisiBus;
    private ArrayList<Halte> tujuanBus = new ArrayList<Halte>();
    private ArrayList<HashMap<String, Halte>> penumpangBus = new ArrayList<HashMap<String, Halte>>();
    public void tambahPenumpang(Halte berangkat, Halte tujuan) {
        HashMap<String, Halte> informasiPenumpang = new HashMap<>();
        if (penumpangBus.size() > maxPenumpang) {
            System.out.println("Bus Sudah Penuh!");
        }else{
            informasiPenumpang.put("berangkat", berangkat);
            informasiPenumpang.put("tujuan", tujuan);
            penumpangBus.add(informasiPenumpang);
        }
    }
    public ArrayList<Halte> getListTujuan(){
        return tujuanBus;
    }
    public void tambahTujuan(Halte tujuan){
        tujuanBus.add(tujuan);
    }
    public Halte berangkat(){
        tujuanBus.remove(0);
        System.out.println("Bus telah berangkat");
        System.out.println("Bus telah tiba di Halte " + tujuanBus.get(0).getNamaHalte());
        posisiBus = tujuanBus.get(0);
        return posisiBus;

    }
    public void informasiBus(){
        System.out.println("Posisi Bus Saat Ini: " + (posisiBus != null ? posisiBus.getNamaHalte() : "null"));
        System.out.println("Tujuan Bus Selanjutnya : ");
        for (int i = 0; i < tujuanBus.size(); i++) {
            System.out.print(tujuanBus.get(i).getNamaHalte() + " -> ");
        }
        System.out.println("null");
        System.out.println("Isi Penumpang Bus : " + penumpangBus.size());
        System.out.println("Pilih menu Berangkatkan Bus untuk melanjutkan ke Halte berikutnya");

    }
    public void turunkanPenumpang(Halte haltePenumpangTurun){
        for (int i = 0; i < penumpangBus.size(); i++) {
            if(penumpangBus.get(i).get("tujuan").getNamaHalte().equals(haltePenumpangTurun.getNamaHalte())){
                haltePenumpangTurun.tambahPenumpangTurun(penumpangBus.get(i).get("berangkat"));
                penumpangBus.remove(i);
            }
        }
    }
}
