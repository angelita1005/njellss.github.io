
package posttest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Posttest4 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Herbivora> herbi = new ArrayList<>();
    static ArrayList<karnivora> karni = new ArrayList<>();
    
    public static void froze() throws IOException {
        System.out.print("Enter.. ");
        input.readLine();
        System.out.println("");
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
            System.out.print("berat                               : ");
            int berat = Integer.parseInt(input.readLine());
            System.out.print("Jenis Hewan                         : ");
            String jenishewan = input.readLine();
            System.out.print("Jumlah Kaki                         : ");
            String jumlah_kaki = input.readLine();
            System.out.println("=============================================");
            herbi.add(new Herbivora(nama, tanggalAdopsi, tinggi, berat, jenishewan,  jumlah_kaki));
            System.out.println("Data berhasil ditambahkan!");

        }else if(pil == 2){
            System.out.println("========== DATA HEWAN ==========");
            System.out.print("Masukkan Nama                       : ");
            String nama = input.readLine();
            System.out.print("Masukkan tanggal adopsi             : ");
            String tanggalAdopsi = input.readLine();
            System.out.print("Tinggi                              : ");
            int tinggi = Integer.parseInt (input.readLine());
            System.out.print("berat                               : ");
            int berat = Integer.parseInt(input.readLine());
            System.out.print("Jenis Hewan                         : ");
            String jenishewan = input.readLine();
            System.out.print("Jumlah Kaki                         : ");
            String jumlah_kaki = input.readLine();
            System.out.println("=============================================");
            karni.add(new karnivora(nama, tanggalAdopsi, tinggi, berat, jenishewan,  jumlah_kaki));
            System.out.println("Data berhasil ditambahkan!");

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
                System.out.print("Masukkan indeks data Hewan yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                index =-1;
                if (index < 0 || index >= herbi.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Herbivora her = herbi.get(index);
                    System.out.println("Data indeks " + index + 1);
                    System.out.println("======= Masukkan data yang baru =======");
                    System.out.print("Masukkan Nama                       : ");                  
                    her .setNama(input.readLine());
                    System.out.print("Masukkan Tanggal Adopsi             : ");
                    her .setTanggalAdopsi(input.readLine());
                    System.out.print("Masukkan Tinggi                     : ");
                    her.setTinggi(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan berat                      : ");
                    her.setBerat(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Jenis Hewan                : ");
                    her .setJenishewan(input.readLine());
                    System.out.print("Masukkan jumlah kaki                : ");
                    her .setJumlah_kaki(input.readLine());
                    System.out.println("=================================================");
                    System.out.println("Data berhasil diubah!");
                }
            }
        }else if(pil == 2){
            if (karni.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data Karnivora yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                index =-1;
                if (index < 0 || index >= karni.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    karnivora krn = karni.get(index);
                    System.out.println("Data indeks " + index + 1);
                    System.out.println("======= Masukkan data yang baru =======");
                    System.out.print("Masukkan Nama                       : ");                  
                    krn .setNama(input.readLine());
                    System.out.print("Masukkan Tanggal Adopsi             : ");
                    krn.setTanggalAdopsi(input.readLine());
                    System.out.print("Masukkan Tinggi                     : ");
                    krn.setTinggi(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan berat                      : ");
                    krn.setBerat(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Jenis Hewan                : ");
                    krn .setJenishewan(input.readLine());
                    System.out.print("Masukkan jumlah kaki                : ");
                    krn .setJumlah_kaki(input.readLine());
                    System.out.println("=================================================");
                    System.out.println("Data berhasil diubah!");
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
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data Herbivora yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                index =-1;
                if (index < 0 || index >= herbi.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Herbivora her = herbi.get(index);
                    herbi.remove(index);
                    System.out.println("Data Herbivora dengan indeks " + index + " berhasil dihapus:");
                }
            }
        }else if(pil == 2){
            if (karni.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data Karnivora yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                index =-1;
                if (index < 0 || index >= karni.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    karnivora krn = karni.get(index);
                    karni.remove(index);
                    System.out.println("Data Karnivora dengan indeks " + index + " berhasil dihapus:");
                    
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


