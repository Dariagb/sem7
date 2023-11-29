
public class Calcul {
    private Operation operat;

//    public void setOperat(Calcul operat) {
//        this.operat = operat;

    public void setOperat(Operation operat) {
        this.operat = operat;
    }


    public ComNam perform(ComNam num1, ComNam num2) {
        if (operat != null)
            return operat.calculate(num1, num2);
        else {
            throw new IllegalStateException("Операция не задана.");
        }
    }

}


