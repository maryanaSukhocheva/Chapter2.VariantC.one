package variantC.one.main;

import variantC.one.action.Action;
import variantC.one.action.InputData;
import variantC.one.action.OutputData;


/**
 *
 * @author Sukhocheva Maryana
 */
public class Main {
    
    public static void main(String[] args) {
        
        InputData inputParametrs = new InputData();
        int n = inputParametrs.inputParametr("Введите размерность матрицы n");
        int k = inputParametrs.inputParametr("Введите номер столбца k");
        if (k < n) {
            Action action = new Action();
            int[][] arrayOfMatrix = action.createMatrix(n); 
            OutputData.printlnMsg("--------Created Matrix (Random)--------");
            OutputData.outputMatrix(n,arrayOfMatrix);
            action.sortedMatrix(n,k, arrayOfMatrix);
            OutputData.printlnMsg("--------New Matrix--------");
            OutputData.outputMatrix(n,arrayOfMatrix);
        } else {
            OutputData.printErr("Номер столбца больше чем размерность матрицы");
        }
    }

 
  
}
