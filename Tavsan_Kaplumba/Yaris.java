package Tavsan_Kaplumba;
public class Yaris{
    public final int YOL = 70;
    Kaplumbaga[] kaplumbagalar;
    Tavsan[] tavsanlar;

    public Yaris(int kaplumbagalar , int tavsanlar){
        this.kaplumbagalar = new Kaplumbaga[kaplumbagalar];
        this.tavsanlar = new Tavsan[tavsanlar];

    }
    public void allMove(){
        boolean flag=true;
        while(flag){
            for(int i=0 ; i<kaplumbagalar.length ; i++){
            kaplumbagalar[i].move();
            tavsanlar[i].move();
            System.out.println(i+".Kaplumbağa"+" Konumu : "+kaplumbagalar[i].konum);
            System.out.println(i+"Tavsan Konumu : "+tavsanlar[i].konum);
        }
        for(int i=0 ; i<kaplumbagalar.length ; i++){
            if(kaplumbagalar[i].konum>=70){
                System.out.println(i+".Kaplumbaga Kazandi :"+kaplumbagalar[i].konum);
                flag=false;
            }
            else if(tavsanlar[i].konum>=70){
                System.out.println(i+".Tavsan Kazandi :"+tavsanlar[i].konum);
                flag = false;
            }
        }
    }
}

public static void main(String[]args){
    Yaris yaris = new Yaris(10,10);
    for(int i=0 ; i<yaris.kaplumbagalar.length; i++){
            yaris.kaplumbagalar[i] = new Kaplumbaga(String.valueOf(i));
    }
    for(int i=0 ; i<yaris.tavsanlar.length; i++){
        yaris.tavsanlar[i] = new Tavsan(String.valueOf(i));
    }
    yaris.allMove();
    
    

}



}