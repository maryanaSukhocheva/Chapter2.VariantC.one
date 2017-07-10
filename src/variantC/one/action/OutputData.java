
package variantC.one.action;


/**
 *
 * @author Sukhocheva Maryana
 */
public class OutputData {

    public OutputData() {
    }
    
    public static void printlnMsg(String stringOutput) {
     try {
        System.out.println(stringOutput);
    } catch (Exception e) {
       System.err.println("Неверный формат строки!"); 
    }
    }
    
    public static void printMsg(String stringOutput) {
     try {
        System.out.print(stringOutput);
    } catch (Exception e) {
       System.err.println("Неверный формат строки!"); 
    }
    }
 
    public static void printErr(String stringOutput) {
     try {
        System.out.println(stringOutput);
    } catch (Exception e) {
        System.err.println("Неверный формат строки!"); 
    }
    }
    
    public static void outputMatrix(int n, int[][] a){
     for (int i = 0; i < n; i++) {
	for (int j = 0; j < n; j++) {
            System.out.print(a[i][j] + "\t");
        }
	System.out.println();
	}
     }
}
