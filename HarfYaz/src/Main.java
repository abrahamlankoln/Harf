
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[][] harf = new String[7][4];

		for (int i = 0; i < harf.length; i++) {
			for (int j = 0; j < harf[i].length; j++) {
				if ((i == 0 || i == 3 || i == 6) && j < 3) {
					harf[i][j] = " *";
				} else if ((i == 1 || i == 2 || i == 4 || i == 5) && (j == 0 || j == 3)) {
					harf[i][j] = " *";
				}else {
					harf[i][j]="  ";
				}
			}
		}
		 for (String[] row : harf){
	            for (String col : row){
	                System.out.print(col);
	            }
	            System.out.println();
	        }
	}

}
