package variantC.one.action;

import java.util.Random;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Action {
     public Action() {

    }
    public int[][] createMatrix(int n) {
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = getRandom(-n, n);
            }
        }
        return a;
    
    }
    
    public static int getRandom(int min, int max) {
	Random ran = new Random();
	int n = max - min + 1;
	int i = ran.nextInt() % n;
	if (i < 0) {
               i = -i;
            }
	return min + i;
	}
    
     
    
     public void sortedMatrix(int n, int k, int[][] arrayOfMatrix){
            for (int i=0;  i<n; i++) {
             for (int q=i+1; q < n; q++) {
                 if (arrayOfMatrix[i][k-1] > arrayOfMatrix[q][k-1]){ //сравниваю значения i-той строки в 
                     //k-м столбце со значением q-той строки в k-м столбце
                     for (int j=0; j < n; j++) {
                         int temp = arrayOfMatrix[i][j]; 
                         arrayOfMatrix[i][j]=arrayOfMatrix[q][j]; //если больше переставляем значения строк
                         arrayOfMatrix[q][j]=temp;
                     }
                 }
             }
         }
         
         
        }
     
}
