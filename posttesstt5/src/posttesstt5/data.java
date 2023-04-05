package posttesstt5;

// abstract class
public abstract class data { 
    protected  final String lokasi = "Mahak Baru, Kalimantan Utara"; // final pada atribut
    private String nama;
    private String tanggalAdopsi;
    private int tinggi;
    private int berat;
    
public data(String nama, String tanggalAdopsi, int tinggi, int berat) {
        this.nama = nama;
        this.tanggalAdopsi = tanggalAdopsi;
        this.tinggi = tinggi;
        this.berat = berat;
}

    /**
     * @return the name
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param name the name to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the tanggalAdopsi
     */
    public String getTanggalAdopsi() {
        return tanggalAdopsi;
    }

    /**
     * @param tanggalAdopsi the tanggalAdopsi to set
     */
    public void setTanggalAdopsi(String tanggalAdopsi) {
        this.tanggalAdopsi = tanggalAdopsi;
    }

    /**
     * @return the tinggi
     */
    public int getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    /**
     * @return the berat
     */
    public int getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(int berat) {
        this.berat = berat;
    }
    
//    public void look(){
//        System.out.println("Nama : " + nama);
//        System.out.println("Tanggal Adopsi : " + tanggalAdopsi);
//        System.out.println("Tinggi : " + tinggi);
//        System.out.println("Berat : " + berat);
//    }
    
     //Overloading
    public void info(String nama){
        System.out.println("\tData Hewan" + nama + "  berhasil ditambahkan!" );
    }
    
    //Overloading
    public void info(int berat){
        System.out.println("\tData Hewan dengan Berat" + berat + " berhasil diubah !");
    }
    
    // abstract method  
    public abstract void look();
  
}
