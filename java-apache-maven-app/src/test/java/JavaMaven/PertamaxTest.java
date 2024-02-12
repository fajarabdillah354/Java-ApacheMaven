package JavaMaven;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit test for simple Pertamax.
 */

@DisplayName("Class Pertamax Test") //penggunaan annotation @DisplayName untuk class
public class PertamaxTest {

    private Pertamax pertamax = new Pertamax();
    private Penjumlahan penjumlahan = new Penjumlahan();


    /**
     dibawah ini adalah contoh dari penggunana assertion, masih banyak lagi contoh yang lain ini hanya gambaran saja
     */
    @Test
    public void testPertamax(){
        var result = pertamax.pertamax(15000,20000);
        assertEquals(5000,result); //ekspektasi kita harus sama dengan realita yang ada
        assertNotEquals(10000, result); //ekspektasi kita tidak boleh sama dengan realita yang ada
    }
    @Test
    public void invalidBayar(){
     // dalam unit test kita tidak boleh throw error jika terjadi maka dianggap gagal, maka kita perlu assertThrow untuk bisa throw error
        assertThrows(Exception.class, () -> {
            pertamax.uangKurangPertamax(15000, 5000);
        });
    }

    /*
    @Test
    public void gagalInvalidBayar() throws Exception {
        // ini contoh jika tidak menggunakan assertThrow, maka Test akan error
        var result = pertamax.uangKurangPertamax(15000,5000);
        System.out.println(result);
    }


     */


    /**
     kita bisa memberi nama test sesuka kita dengan menggunakan @DisplayName pada class ataupun pada method


     */

    @Test
    @DisplayName("test Method Tambah")// maka hasil dari test method ini sesuai dengan param yang kita tulis di @DisplayName
    public void testPenjumlahan(){
        var jumlah = penjumlahan.tambah(5,9);
        assertEquals(14,jumlah);
    }

    /**
     kadang kita ingin men Disable test yang kita buat , caranya dengan menggunakan @Disable
     */

    @Test
    @Disabled//ketika menggunakan annotation ini maka test akan di skipped
    public void iniKedisable(){

    }

    /**
     @BeforeEach & @AfterEach
     untuk menandai function sebelum dan setelah dieksekusi
     */


    @BeforeEach
    public void iniBeforeEach(){
        System.out.println("ini beforeEach");
    }


    @AfterEach
    public void iniAfterEach(){
        System.out.println("ini afterEach");
    }


    /**
     @BeforeAll & @AfterAll
     digunakan melakukan sesuatu setelah atau sebelum unit test berjalan
     */

    @BeforeAll// ketika running maka method ini pertama kali dijalankan setelah ini semua unit testnya
    public static void iniBeforeAll(){
        System.out.println("ini before yang maka all");
    }

    @AfterAll// ketika semua unit test sudah berjalan baru method ini berjalan
    public static void iniAfterAll(){
        System.out.println("ini after yang make all");
    }

}
