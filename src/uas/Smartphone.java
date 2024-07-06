
package uas;


public class Smartphone {
    private String ImeiSmartphone;
    private String NamaSmartphone;
    private String AsalProduksi;
    private int TahunProduksi;


    public Smartphone(String ImeiSmartphone, String NamaSmartphone, String AsalProduksi, int TahunProduksi) {
        this.ImeiSmartphone = ImeiSmartphone;
        this.NamaSmartphone = NamaSmartphone;
        this.AsalProduksi = AsalProduksi;
        this.TahunProduksi = TahunProduksi;
    }

    
    public void setImeiSmartphone(String ImeiSmartphone) {
        this.ImeiSmartphone = ImeiSmartphone;
    }

    public void setNamaSmartphone(String NamaSmartphone) {
        this.NamaSmartphone = NamaSmartphone;
    }

    public void setAsalProduksi(String AsalProduksi) {
        this.AsalProduksi = AsalProduksi;
    }

    public void setTahunProduksi(int TahunProduksi) {
        this.TahunProduksi = TahunProduksi;
    }
    

    public String getImeiSmartphone() {
        return ImeiSmartphone;
    }

    public String getNamaSmartphone() {
        return NamaSmartphone;
    }

    public String getAsalProduksi() {
        return AsalProduksi;
    }

    public int getTahunProduksi() {
        return TahunProduksi;
    }
    
    
    public void DisplayInfo() {
        System.out.println("Imei Smartphone: " + ImeiSmartphone);
        System.out.println("Nama Smartphone: " + NamaSmartphone);
        System.out.println("Tahun Produksi: " + TahunProduksi);
                
    
}





}