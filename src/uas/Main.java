package uas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Smartphone Yang Ingin DiInput : ");
        int JumlahSmartphone = Integer.parseInt(scanner.nextLine());
        
        Series[] DaftarSmartphone = new Series[JumlahSmartphone];
        
        for (int i = 0; i < JumlahSmartphone; i++) {
            System.out.println("Input Data Smartphone Ke-" + (i+1) + "  ");
            
            String ImeiSmartphone = "";
            while (true) {
                try {
                    System.out.print("Masukkan Imei Smartphone (6 Angka) : ");
                    ImeiSmartphone = scanner.nextLine();
                    if (!ImeiSmartphone.matches("\\d+")) {
                        throw new NumberFormatException("Kode Imei Harus Berupa Angka.");
                    }
                    if (ImeiSmartphone.length() != 6) {
                        throw new IllegalArgumentException("Kode Imei Harus 6 Angka.");
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            
            System.out.print("Masukkan Nama Smartphone : ");
            String NamaSmartphone = scanner.nextLine();
           
            System.out.print("Masukkan Asal Produksi : ");
            String AsalProduksi = scanner.nextLine();
            
            int TahunProduksi = 0;
            while (true) {
                try {
                    System.out.print("Masukkan Tahun Produksi (4 Angka): ");
                    String TahunProduksiStr = scanner.nextLine();
                    if (TahunProduksiStr.length() !=4) {
                        throw new IllegalArgumentException("Tahun Produksi Harus 4 Angka");
                    }
                    TahunProduksi = Integer.parseInt(TahunProduksiStr);
                    break;
                } catch(NumberFormatException e) {
                    System.out.println("Error: Tahun Produksi Harus Angka");
                } catch(IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            
            System.out.println("Pilih Series Smartphone :");
            System.out.println("1. 14 ");
            System.out.println("2. 14 Plus ");
            System.out.println("3. 14 Pro ");
            System.out.println("4. 14 Pro Max ");
            System.out.println("5. Lainnya ");
            
            int pilihan = 0;
            while (true) {
                try {
                    pilihan = Integer.parseInt(scanner.nextLine());
                    if (pilihan < 1 || pilihan > 5) {
                        throw new NumberFormatException("Pilihan Tidak Ada.");
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Pilihan Harus Berupa Angka Antara 1 Sampai 5");
                }
            }
            
            String series = "";
            switch (pilihan) {
                case 1:
                    series = "14 ";
                    break;
                case 2:
                    series = "14 Plus ";
                    break;
                case 3:
                    series = "14 Pro ";
                    break;
                case 4:
                    series = "14 Pro Max ";
                    break;
                case 5:
                    series = "Lainnya";
                    break;
            }
            
            DaftarSmartphone[i] = new Series(ImeiSmartphone, NamaSmartphone , AsalProduksi, TahunProduksi, series);   
        }
        
        System.out.println("\nDaftar Smartphone Iphone Series di Toko");
        for (Series Smartphone : DaftarSmartphone) {
            Smartphone.DisplayInfoLengkap();
            System.out.println();
        }
    }
    
}

