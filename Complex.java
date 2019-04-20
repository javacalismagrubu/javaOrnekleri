
public class Complex {
   private double reel;
   private double imaginel;
    
    public Complex (double reel , double imaginel){
        this.reel = reel;
        this.imaginel = imaginel;
    }
    public Complex (Complex complexNumber){
        this.reel = complexNumber.reel;
        this.imaginel = complexNumber.imaginel;
    }
    public void addComplex(double reel,double imaginel){ // Karmaşık sayıları toplar
        this.reel += reel;
        this.imaginel += imaginel;
        
    }
    public void addComplex (Complex compObj){ // Parametre olarak obje alıp karmasık sayıları toplar
        this.reel += compObj.reel;
        this.imaginel += compObj.imaginel;
        
    }
    public void subtractComplex(double reel, double imaginel){//Karmasık sayıları cıkarır
        this.reel -=reel;
        this.imaginel -=imaginel;
      
    }
    public void subtractComplex(Complex compObj){//Parametre olarak obje alıp çıkarır
        this.reel -=compObj.reel;
        this.imaginel -=compObj.imaginel;
    }
    
    public void multiplyComplex(double reel , double imaginel){//Karmasık sayıları çarpar
        double tempReel=this.reel;
        this.reel = (this.reel * reel) - (imaginel*this.imaginel);
        this.imaginel = (reel*this.imaginel) + (tempReel*imaginel);

    }
    public void multiplyComplex(Complex compObj){//Obje alıp çarpar
        double tempReel = this.reel;
        this.reel = this.reel*compObj.reel - this.imaginel*compObj.imaginel;
        this.imaginel = (tempReel*compObj.imaginel) + (compObj.reel*this.imaginel);
        }

    
    
    public void setReel(double reel){
        this.reel = reel ;
    }
    public double getReel(){
        return this.reel;
    }
    
    public void setImaginel(double imaginel){
        this.imaginel = imaginel;
    }
    public double getImaginel(){
        return this.imaginel;
    }
    
    
    public String toString(){
       if(imaginel == 0) return (int)reel +"";
       if(reel == 0 )   return (int)imaginel +"i";
       if(imaginel < 0 ) return (int)reel +"-"+(int)(-imaginel)+"i";
      return   (int)reel+"+"+(int)imaginel+"i";
    }

    
}
