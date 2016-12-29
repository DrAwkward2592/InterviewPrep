package CrackingTheCodingInterview.Chapter1_ArraysAndStrings;

public class Q8_NullifyMatrix {

	public static void nullifyRow(int matrix[][], int row){
		for(int i=0;i<matrix.length;i++){
			matrix[row][i]=0;
		}
	}
	
	public static void nullifyColumn(int matrix[][], int column){
		for(int i=0;i<matrix.length;i++){
			matrix[i][column] = 0;
		}
	}
	
	public static boolean nullifyMatrix(int matrix[][]){
		
		if(matrix.length==0 || matrix.length!=matrix[0].length) return false;
		boolean row[] = new boolean[matrix.length];
		boolean column[] = new boolean[matrix.length];
		
		for(int i=0;i<matrix.length;++i){
			for(int j=0;j<matrix[0].length;++j){
				if(matrix[i][j]==0){
					row[i] = true;
					column[j] = true;
				}
			}
		}
		for(int i =0;i<row.length;++i){
			if(row[i])
				nullifyRow(matrix, i);
		}
		
		for(int i =0;i<column.length;++i){
			if(column[i])
				nullifyColumn(matrix, i);
		}
		return true;
	}
	
	public static void main(String args[]){
		int matrix[][] = {{1,2,3,4},
						{0,2,3,5},
						{1,5,6,7},
						{5,4,3,0}		
		};
		
		nullifyMatrix(matrix);
		for(int i=0;i<4;++i){
			for(int j=0;j<4;++j){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
