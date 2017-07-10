package variantC.one.action;

import java.util.Scanner;

/**
 *
 * @author Sukhocheva Maryana
 */
public class InputData {

    public InputData() {
    }
    
    public int inputParametr(String nameOfParametr)  {
        int parametr = 0;
        try {
            Scanner scan = new Scanner(System.in);
            OutputData.printMsg(nameOfParametr + " = ");
            parametr = scan.nextInt();
        } catch(NumberFormatException e) {
            OutputData.printErr("Число введено некорректно!");
        }
        return parametr;
    }
}
