package JavaMaven;

import java.util.ArrayList;
import java.util.List;

public class MeminjamanBuku {

    public List<String> daftarBuku, daftarPeminjam, namaPeminjam;

    public MeminjamanBuku() {
        daftarBuku = new ArrayList<>();
        daftarPeminjam = new ArrayList<>();
        namaPeminjam = new ArrayList<>();
    }



    public void tambahBuku(String judul){
        daftarBuku.add(judul);
    }
    public void pinjamBuku(String judul, String peminjam){
        if (daftarBuku.contains(judul)){
            daftarBuku.remove(judul);
            daftarPeminjam.add(judul);
            namaPeminjam.add(peminjam);
            System.out.println("buku "+judul+" berhasil dipinjam "+peminjam);
        }else {
            System.out.println("buku "+judul+" tidak tersedia dan tidak berhasil dipinjam "+peminjam);
        }

    }
}
