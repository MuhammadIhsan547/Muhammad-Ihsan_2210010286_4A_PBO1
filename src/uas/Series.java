
package uas;


public class Series extends Smartphone {
    private String series;
    
   
    public Series(String ImeiSmartphone, String NamaSmartphone,String AsalProduksi, int TahunProduksi,String series) {
        super(ImeiSmartphone, NamaSmartphone, AsalProduksi, TahunProduksi);
        this.series = series;
    }
    
    
    
    public void setSeries(String series) {    
        this.series = series;
    }

    
    public String getSeries() {
        return series;
    }
    
   
    public void DisplayInfoLengkap() {
        super.DisplayInfo();
        System.out.println("Series: " + series);
    }
    
    
}
