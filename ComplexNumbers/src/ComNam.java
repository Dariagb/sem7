public class ComNam {
    private double realpart;
    private double imaginarypart;
    public ComNam(double realpart, double imaginarypart){
        this.realpart=realpart;
        this.imaginarypart=imaginarypart;
    }

    public double getRealpart() {
        return realpart;
    }

    public void setRealpart(double realpart) {
        this.realpart = realpart;
    }

    public double getImaginarypart() {
        return imaginarypart;
    }

    public void setImaginarypart(double imaginarypart) {
        this.imaginarypart = imaginarypart;
    }

    @Override
    public String toString() {
        return realpart + "+"+ imaginarypart + "i" ;
    }
}
