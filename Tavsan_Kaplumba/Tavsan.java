package Tavsan_Kaplumba;

import java.security.SecureRandom;

public class Tavsan{
    String isim;
    int konum=0;
    public Tavsan(String isim){
        this.isim = isim+".Tavsan";
    }
    
    public void move(){
        SecureRandom random = new SecureRandom();
        
        if(random.nextInt()%10 >= 0 && random.nextInt()%10 <= 1){
            
        }
        else if(random.nextInt()%10 >= 2 && random.nextInt()%10 <= 3){
            konum +=9;

        }
        else if(random.nextInt()%10==4){
            konum +=9;
        }
        else if(random.nextInt()%10 >=5 && random.nextInt()%10 <= 7){
            konum +=1;
        }
        else if(random.nextInt()%10 >=8 && random.nextInt()%10 <=9){
            konum -=2;
        }
        if(konum<1)
            konum=1;
        
    }

}