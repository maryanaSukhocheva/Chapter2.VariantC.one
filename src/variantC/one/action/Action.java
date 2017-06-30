/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variantC.one.action;

import java.util.Random;

/**
 *
 * @author SLAVA
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
     public void outputMatrix(int n, int[][] a){
     for (int i = 0; i < n; i++) {
	for (int j = 0; j < n; j++) {
	System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
     }
    
     public void sortedMatrix(int n, int[][] a){
         int q=0;
         for (int i = 0; i < n * n - 1; i++) {
            for (int j = i; j < n * n; j++) {
                if (a[(int) i / n][(int) i % n] > a[(int) j / n][(int) j % n]) {
                    q = a[(int) i / n][(int) i % n];
                    a[(int) i / n][(int) i % n] = a[(int) j / n][(int) j % n];
                    a[(int) j / n][(int) j % n] = q;
                }
            }
        }
     }
     
}
