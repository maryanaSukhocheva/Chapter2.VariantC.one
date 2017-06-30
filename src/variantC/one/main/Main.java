package variantC.one.main;

import java.util.Scanner;
import variantC.one.action.Action;


public class Main {
    
    public static void main(String[] args) {
     
        //Matrix matr=new Matrix(2,2);
        Action action = new Action();
      //  int n = action.getRandom(2, 10);
        System.out.print("Введите размерность матрицы n =" );
        Scanner scan = new Scanner(System.in);
        int n;
        try {  
            n=scan.nextInt();
            int[][] a =action.createMatrix(n); 
            System.out.println("--------Created Matrix (Random)--------");
            action.outputMatrix(n,a);
            action.sortedMatrix(n, a);
            System.out.println("--------New Matrix--------");
            action.outputMatrix(n,a);
         } catch(NumberFormatException e) {
            System.out.println("Число введено некорректно!!!");
            
        }
    }

 
  
}
