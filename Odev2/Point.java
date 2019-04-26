
public class Point {
    private double x;
    private double y;
    
   public Point(double x , double y){
        this.x = x;
        this.y = y;
        
    }
   public Point(Point point){
      this.x = point.x;
      this.y = point.y;
   }

   public Point findClosest(Point [] pointArray){
       double yakinX = pointArray[0].x;
       double yakinY = pointArray[0].y;
       double noktaX = this.x;
       double noktaY = this.y;
       double geciciMesafe;
       double farkX = Math.abs(noktaX-yakinX);
       double farkY = Math.abs(noktaY-yakinY);
       double mesafe = Math.sqrt(farkX*farkX+farkY*farkY);
       int index=0;
       
       
       for(int i=1; i<pointArray.length; i++){
          yakinX = pointArray[i].x;
          yakinY = pointArray[i].y;
          farkX = Math.abs(noktaX-yakinX);
          farkY = Math.abs(noktaY-yakinY);
          geciciMesafe = Math.sqrt(farkX*farkX+farkY*farkY);
          if(geciciMesafe < mesafe){
              mesafe = geciciMesafe;
              index = i ;
          }
       }
       return pointArray[index];
   }
   
    public static Point findFurthest(Point []pointArray){
        int furthestPoint=0;
        double furthestX;
        double furthestY;
        double tempFurt;
        double furthest = Math.sqrt(Math.pow(pointArray[0].x,2)+Math.pow(pointArray[0].y,2));
        for(int i=0; i<pointArray.length; i++){
            furthestX = pointArray[i].x;
            furthestY = pointArray[i].y;
            tempFurt = Math.sqrt((furthestX*furthestX)+(furthestY*furthestY));
            
            if(tempFurt > furthest){
                furthest = tempFurt;
                furthestPoint = i;
            }
        }
        return pointArray[furthestPoint];
    }
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

   
    public void setY(double y) {
        this.y = y;
    }
   
    public String toString(){
    
        return x+" "+y;
    }
}
