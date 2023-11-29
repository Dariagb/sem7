public class Addition  implements Operation{
    @Override
    public ComNam calculate(ComNam num1, ComNam num2){
        double realpart=  num1.getRealpart()+num2.getRealpart();
        double imaginarypart= num1.getImaginarypart()+num2.getRealpart();
        return new ComNam(realpart,imaginarypart);
    }
}
