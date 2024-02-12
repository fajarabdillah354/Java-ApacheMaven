package JavaMaven;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class Pertamax
{
    public static void main(String[] args) {

    }

    public static void buku(){

            Gson gson = new Gson();
            Person person = new Person("Fajar Abdillah Ahmad");
            String json = gson.toJson(person);
            System.out.println(json);


            MeminjamanBuku meminjamanBuku = new MeminjamanBuku();
            meminjamanBuku.tambahBuku("Atomic Habbit");
            meminjamanBuku.tambahBuku("Clean Code");
            meminjamanBuku.tambahBuku("Harry Potter");
            meminjamanBuku.pinjamBuku("Mindset","fajar abdillah ahmad");

    }

    public Integer pertamax(int harga, int bayar){
        System.out.println("===== selamat datang di POM MINI =====");
        System.out.println("Harga pertamax : 15000");
        System.out.println(bayar - harga);
        return bayar - harga;


    }

    public Integer uangKurangPertamax(int harga, int bayar) throws Exception {
        if(bayar < harga){
            throw new Exception("uang tidak cukup untuk membeli");
        }else {
            return bayar - harga;
        }
    }


}


