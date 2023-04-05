
package posttesstt5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public final class Posttest5 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Herbivora> herbi = new ArrayList<>();
    static ArrayList<karnivora> karni = new ArrayList<>();
    
    public static void froze() throws IOException {
        System.out.print("Enter.. ");
        input.readLine();
        System.out.println("");
    }
    
    static final void display() { // final method
        System.out.println("\n=================================================");
        System.out.println("|                   List Data                   |");
    }
    
    public static void tambahData() throws IOException {
        System.out.println("Jenis");
        System.out.println("1. Herbivora");
        System.out.println("2. Karnivora");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("========== DATA HEWAN ==========");
            System.out.print("Masukkan Nama                       : ");
            String nama = input.readLine();
            System.out.print("Masukkan tanggal adopsi             : ");
            String tanggalAdopsi = input.readLine();
            System.out.print("Tinggi                              : ");
            int tinggi = Integer.parseInt (input.readLine());
            System.out.print("Berat/Lebar                         : ");
            int berat = Integer.parseInt(input.readLine());
            System.out.print("Jenis Hewan                         : ");
            String jenishewan = input.readLine();
            System.out.print("Jumlah Kaki                         : ");
            String jumlah_kaki = input.readLine();
            System.out.println("=============================================");
            Herbivora Herbi = new Herbivora(nama, tanggalAdopsi, tinggi, berat, jenishewan, jumlah_kaki);
            herbi.add(Herbi);
            Herbi.info(nama);

        }else if(pil == 2){
            System.out.println("========== DATA HEWAN ==========");
            System.out.print("Masukkan Nama                       : ");
            String nama = input.readLine();
            System.out.print("Masukkan tanggal adopsi             : ");
            String tanggalAdopsi = input.readLine();
            System.out.print("Tinggi                              : ");
            int tinggi = Integer.parseInt (input.readLine());
            System.out.print("Berat/Lebar                         : ");
            int berat = Integer.parseInt(input.readLine());
            System.out.print("Jenis Hewan                         : ");
            String jenishewan = input.readLine();
            System.out.print("Jumlah Kaki                         : ");
            String jumlah_kaki = input.readLine();
            System.out.println("=============================================");
            karnivora Karni = new karnivora(nama, tanggalAdopsi, tinggi, berat, jenishewan, jumlah_kaki);
            karni.add(Karni);
            Karni.info(nama); 
        }else{
            System.out.println("Pilihan Salah");

        }
    }
    
    public static void lihatData() throws IOException{
        System.out.println("Jenis Hewan");
        System.out.println("1. Herbivora");
        System.out.println("2. Karnivora");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("\n============ List Data Herbivora============");
            if (herbi.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < herbi.size();i++){
                    System.out.println("Data indeks ke-" + (i + 1));
                    herbi.get(i).look();
                    }
                }
                System.out.println("===========================================");
        }else if(pil == 2){
            System.out.println("\n=========== List Data Karnivora ===========");
            if (karni.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < karni.size();i++){
                    System.out.println("Data indeks ke-" + (i + 1));
                    karni.get(i).look();
                }
            }
                System.out.println("=======================================");
        }else{
            System.out.println("Pilihan salah");

        }
    }
    
    public static void editData() throws IOException{
        System.out.println("Jenis");
        System.out.println("1. Herbivora");
        System.out.println("2. Karnivora");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (herbi.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                for(int i = 0; i < herbi.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    herbi.get(i).look();
                    }
                System.out.print("Masukkan indeks data hewan yang ingin diubah : ");
                int index = Integer.parseInt(input.readLine());
                if(index <= herbi.size() || index > 0){
                    System.out.println("======= Masukkan data yang baru =======");
                    System.out.print("Masukkan Nama                       : ");
                    String nama = input.readLine();
                    herbi.get(index-1).setNama(nama);

                    System.out.print("Masukkan Tanggal Adopsi (DD/MM/YYYY): ");
                    String tanggalLahir = input.readLine();
                    herbi.get(index-1).setTanggalAdopsi(tanggalLahir);

                    System.out.print("Masukan Tinggi/Lebar                : ");
                    int tinggi = Integer.parseInt(input.readLine());
                    herbi.get(index-1).setTinggi(tinggi);

                    System.out.print("Masukan Berat                      : ");
                    int berat = Integer.parseInt(input.readLine());
                    herbi.get(index-1).setBerat(berat);

                    System.out.print("Masukkan Jenis Hewan               : ");
                    String jenisHewan = input.readLine();
                    herbi.get(index-1).setJenishewan(jenisHewan);
                    herbi.get(index-1).info(berat);
                    System.out.println("================================================");
                }else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        
     }else if(pil == 2){
            if (karni.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                for(int i = 0; i < karni.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    karni.get(i).look();
                    }
                System.out.print("Masukkan indeks data hewan yang ingin diubah : ");
                int index = Integer.parseInt(input.readLine());
                if(index <= karni.size() || index > 0){
                    System.out.println("======= Masukkan data yang baru =======");
                    System.out.print("Masukkan Nama                       : ");
                    String name = input.readLine();
                    karni.get(index-1).setNama(name);

                    System.out.print("Masukkan Tanggal Adopsi (DD/MM/YYYY): ");
                    String tanggalLahir = input.readLine();
                    karni.get(index-1).setTanggalAdopsi(tanggalLahir);

                    System.out.print("Masukan Tinggi/Lebar                : ");
                    int tinggi = Integer.parseInt(input.readLine());
                    karni.get(index-1).setTinggi(tinggi);

                    System.out.print("Masukan Berat                       : ");
                    int berat = Integer.parseInt(input.readLine());
                    karni.get(index-1).setBerat(berat);

                    System.out.print("Masukkan Jenis Hewan                : ");
                    String jenisHewan = input.readLine();
                    karni.get(index-1).setJenishewan(jenisHewan);
                    karni.get(index-1).info(berat);
                    System.out.println("================================================");
                }else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else{
            System.out.println("Input Salah");
        }
    } 

   
    
    
    public static void hapusData() throws IOException{
        System.out.println("Jenis data Hewan");
        System.out.println("1. Herbivora");
        System.out.println("2. Karnivora");
        System.out.print("Pilih Data Hewan: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){ 
        if (herbi.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
            for(int i = 0; i < herbi.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    herbi.get(i).look();
                    }
                System.out.print("Masukkan indeks data hewan yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if(index <= herbi.size() || index > 0) 
                {
                    herbi.remove(index-1);
                    System.out.println("Data hewan indeks " + index + " berhasil dihapus");
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else if(pil == 2){
            if (karni.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < karni.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    karni.get(i).look();
                    }
                System.out.print("Masukkan indeks data hewan yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if(index <= karni.size() || index > 0) 
                {
                    karni.remove(index-1);
                    System.out.println("Data hewan indeks " + index + " berhasil dihapus:");
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else{
            System.out.println("Input Salah");
        }
        
    }
        
    public static void main(String[] args) throws IOException  {
        boolean menu = true;
        while(menu == true){
        System.out.println("""
                           Program Toko Hewan DREAM Digital Online
                           ========================================
                           | 1. Menambah Data Hewan                |
                           | 2. Melihat Data  Hewan                |
                           | 3. Mengubah Data  Hewan               |
                           | 4. Menghapus Data  Hewan              |
                           | 5. Keluar Program  Hewan              |
                           ========================================
                           """);
        System.out.print("Pilih: ");
        int pilih = Integer.parseInt(input.readLine());
        switch(pilih){
            case 1:
                tambahData();
                froze();
                break;
            case 2:
                lihatData();
                froze();
                break;
            case 3:
                editData();
                froze();
                break;
            case 4:
                hapusData();
                froze();
                break;
            case 5:
                System.out.println("Program dihentikan");
                menu = false;
                break;
            default:
                System.out.println("Pilihan salah");
                froze();
                break;
            }
        }
    }
    
}
