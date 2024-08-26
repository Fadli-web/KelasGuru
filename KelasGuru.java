
public class KelasGuru {
    
    int nip;
     String nama;
     String status;
     String mapel;
//constructor default//

public KelasGuru(){

    nip = 0;
    nama = "kosong";
    status = "kosong";
    mapel = "kosong";


}
public void print() {
    System.out.println("NIP :" +nip);
    System.out.println("nama :" +nama);
    System.out.println("Mapel :" +mapel);
    System.out.println("status :" +status);
}
}
