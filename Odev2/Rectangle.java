public class Rectangle {
    private double kisa;
    private double uzun;
    private double x;
    private double y;

    public Rectangle(double kisa, double uzun) {
        this.kisa = kisa;
        this.uzun = uzun;
    }

    public double getKisa() {
        return kisa;
    }

    public void setKisa(double kisa) {
        this.kisa = kisa;
    }

    public double getUzun() {
        return uzun;
    }

    public void setUzun(double uzun) {
        this.uzun = uzun;
    }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

    public double getPerimeter (double aKisa , double aUzun){
            return 2*(aKisa+aUzun);
    }
    
    public double getArea(double S1, double L1){
            return S1*L1;
    }

}