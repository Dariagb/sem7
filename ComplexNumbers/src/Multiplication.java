public class Multiplication implements Operation {
    @Override
    public ComNam calculate(ComNam num1, ComNam num2) {
        double realpart = num1.getRealpart() * num2.getRealpart() - num1.getImaginarypart() * num2.getImaginarypart();
        double imaginarypart = num1.getRealpart() * num2.getImaginarypart() + num1.getImaginarypart() * num2.getRealpart();
        return new ComNam(realpart, imaginarypart);
    }
}
