package Tavsan_Kaplumba;

import java.security.SecureRandom;

public class Kaplumbaga{
    String isim;
    int konum=0;
    public Kaplumbaga(String isim){
        this.isim = isim+".Kaplumba";
    }

    public void move(){
        SecureRandom random = new SecureRandom();
        
        if(random.nextInt()%10 >= 0 && random.nextInt()%10 <= 4){
            konum +=3;
        }
        else if(random.nextInt()%10 >= 5 && random.nextInt()%10 <= 6){
            konum -=6;

        }
        else if(random.nextInt()%10 >= 7 && random.nextInt()%10 <= 9){
            konum +=1;
        }
        if(konum<1)
            konum=1;

    }

    
}