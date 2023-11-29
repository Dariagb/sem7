public class Division implements Operation{
    @Override
    public ComNam calculate(ComNam num1, ComNam num2) {
        double div= num2.getRealpart()*num2.getRealpart()+num2.getImaginarypart()*num2.getImaginarypart();
        double real=(num1.getRealpart()*num2.getRealpart()+num1.getImaginarypart()*num2.getImaginarypart())/div;
        double imaginarypart=(num1.getImaginarypart()*num2.getRealpart()-num1.getRealpart()*num2.getImaginarypart()/div);
        return new ComNam(real,imaginarypart);
    }
}
