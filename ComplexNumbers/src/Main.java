import java.util.concurrent.Callable;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) {
        ComNam num1 = new ComNam(6, 9);
        ComNam num2 = new ComNam(3, 6);
        Calcul calcul = new Calcul();

        Logger logger = Logger.getLogger(Main.class.getName());
        logger.setLevel(Level.INFO);
        calcul.setOperat(new Addition());

        calcul.setOperat(new Addition());
        ComNam addresult = calcul.perform(num1,num2);
        logger.info("Addition Result: " + addresult);

        calcul.setOperat(new Multiplication());
        ComNam multi = calcul.perform(num1,num2);
        logger.info("Multiplication Result: " + multi);

        calcul.setOperat(new Division());
        ComNam divis = calcul.perform(num1,num2);
        logger.info("Division Result: " + divis);



    }
}


