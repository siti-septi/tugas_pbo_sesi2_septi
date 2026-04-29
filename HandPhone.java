public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;

    // Perbaikan: Urutan modifier dan penggunaan 'this'
    public void setDataHP(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    // Perbaikan: Menambahkan return value
    public String getJenisHP() {
        return jenis_hp;
    }

    // Perbaikan: Tipe data return harus sesuai (int)
    public int getTahunPembuatan() {
        return tahun_pembuatan;
    }

    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        
        // Mengisi data
        hp.setDataHP("Samsung S23", 2023);
        
        // Menampilkan data (pake System.out.println)
        System.out.println("Jenis HP: " + hp.getJenisHP());
        System.out.println("Tahun Pembuatan: " + hp.getTahunPembuatan());
    }
}