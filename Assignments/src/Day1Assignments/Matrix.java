/**
 * 
 */
package Day1Assignments;

/**
 * @author : Nate
 * @date   : Jan 17, 2023
 * 
 */
public class Matrix {
	int rows, columns;
	int[][] mat = new int[10][10];
	/**
	 * 
	 */
	public Matrix() {
		rows = columns = 0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				mat[i][j]=0;
			}
		}
	}
	
	public Matrix(int rows, int columns) {
		this();
		this.rows=rows;
		this.columns=columns;
	}
	
	public void setElement(int row, int column, int value) {
		
		if(value>=0 && row>=0 && row<10 && column>=0 && column<10 ) {
			mat[row][column]=value;
		}
		
	}
	
	public Matrix transpose() {
		Matrix transposedMat = new Matrix(columns,rows);
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				transposedMat.mat[i][j]=this.mat[j][i];
			}
		}
		return transposedMat;
	}
	
	public void displayMat() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
