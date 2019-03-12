/* Quiz Lokanta sorusu*/
package lokanta;

/**
 *
 * @author muhammed
 */
public class Lokanta {
    private String lokantaAdi;
    private String lokantaAdresi;
    private String lokantaSahibi;
    private int bosMasa;
    private int doluMasa;
    private int toplamMasa;
    Menu menuler = new Menu();
    
    public Lokanta(){}
    
    public Lokanta(String lokantaAdi , String lokantaAdresi , String lokantaSahibi , int bosMasa){
        this.lokantaAdi = lokantaAdi;
        this.lokantaAdresi = lokantaAdresi;
        this.lokantaSahibi = lokantaSahibi;
        this.bosMasa = bosMasa;
    }

    public String getLokantaAdi() {
        return lokantaAdi;
    }

    public void setLokantaAdi(String lokantaAdi) {
        this.lokantaAdi = lokantaAdi;
    }

    public String getLokantaAdresi() {
        return lokantaAdresi;
    }

    public void setLokantaAdresi(String lokantaAdresi) {
        this.lokantaAdresi = lokantaAdresi;
    }

    public String getLokantaSahibi() {
        return lokantaSahibi;
    }

    public void setLokantaSahibi(String lokantaSahibi) {
        this.lokantaSahibi = lokantaSahibi;
    }

    public int getToplamMasa() {
        return toplamMasa;
    }

    public void setToplamMasa(int toplamMasa) {
        this.toplamMasa = toplamMasa;
    }
    
    public void setMenuler(Object menuler){
        this.menuler = (Menu) menuler;
    }
    public void menuGoster(){ /*Menuyu yazdırır*/
        System.out.println(menuler.toString());
    }
    
    public void yerAyirtma(int ayirtilanMasa){ /* Masa rezervasyonu */
        if(ayirtilanMasa > bosMasa){
           System.out.println("Yeterli yerimiz yoktur.");
        }
        else{
            bosMasa = bosMasa - doluMasa;
            doluMasa = doluMasa + ayirtilanMasa;
            System.out.println("Sectiginiz masalar ayırtılmıştır.");
        }
    }
    
class Menu{ /* Menu Class'ı menuler degiskenin ayrı bir class olması istenilmis.*/
    private String menuler = "Dürüm , 5 TL , Cola , 3 TL ,Ayran 2 TL";
    
    public String toString(){
        
        return menuler ;
    }

}
   
    public static void main(String[] args) {
        Lokanta deneme = new Lokanta("Dürümcü","a/b/c","Ali",20);
        deneme.menuGoster();
        deneme.yerAyirtma(52);
    }
    
}
