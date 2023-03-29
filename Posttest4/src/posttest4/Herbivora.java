
package posttest4;


public class Herbivora extends data{
    private String jenishewan;
    private String jumlah_kaki;
    
    public Herbivora(String nama, String tanggalAdopsi, int tinggi, int berat, String jenishewan, String jumlah_kaki){
    super(nama, tanggalAdopsi, tinggi, berat);
    this.jenishewan = jenishewan;
    this.jumlah_kaki = jumlah_kaki;
        
    }


    public String getJenishewan() {
        return jenishewan;
    }


    public void setJenishewan(String jenishewan) {
        this.jenishewan = jenishewan;
    }

    public String getJumlah_kaki() {
        return jumlah_kaki;
    }


    public void setJumlah_kaki(String jumlah_kaki) {
        this.jumlah_kaki = jumlah_kaki;
    }
    @Override
    public void look(){
        super.look();
        System.out.println("Jenis Hewan : " + jenishewan);
        System.out.println("Jumlah Kaki : " + jumlah_kaki);
    }
    
    
}

