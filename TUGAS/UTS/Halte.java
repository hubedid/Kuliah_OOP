import java.util.ArrayList;
import java.util.HashMap;

public class Halte {
    private String namaHalte;
    public Halte(String name){
        this.namaHalte = name;
    }
    // public Halte tujuanPenungguBus[];
    // public Halte asalPenumpangTurun[];
    private ArrayList<HashMap<String, Halte>> penungguBus = new ArrayList<HashMap<String, Halte>>();

    private ArrayList<Halte> penumpangTurun = new ArrayList<Halte>();

    public void tambahPenunggu(Halte tujuan){
        HashMap<String, Halte> informasiPenunggu = new HashMap<>();
        informasiPenunggu.put("berangkat", this);
        informasiPenunggu.put("tujuan", tujuan);
        penungguBus.add(informasiPenunggu);
        // System.out.println(penungguBus);
    }
    public void tambahPenumpangTurun(Halte penumpangTurun){
        this.penumpangTurun.add(penumpangTurun);
    }
    public String getNamaHalte(){
        return namaHalte;
    }
    public void getInformasiHalte(){
        System.out.println("========================= Informasi Halte " + this.namaHalte +"==============================");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Informasi Penunggu : ");
        System.out.println("------------------------------------------------");
            int i = 0;
        for(HashMap<String, Halte> Penunggu: this.penungguBus){
            System.out.println("Penunggu ke-" + i);
            // System.out.println("--------------------");
            System.out.println("Halte Keberangkatan : "+ Penunggu.get("berangkat").getNamaHalte());
            System.out.println("Halte Tujuan : "+ Penunggu.get("tujuan").getNamaHalte());
            System.out.println("------------------------------------------------");
            i++;
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Informasi Penumpang Turun : ");
        int j = 0;
        for(Halte informasiPenumpangTurun: this.penumpangTurun){
            System.out.println("Penumpang Turun ke-" + j);
            // System.out.println("--------------------");
            System.out.println("Halte Keberangkatan : "+ informasiPenumpangTurun.getNamaHalte());
            System.out.println("------------------------------------------------");
            j++;
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println("==================================================================================");

    }
}
