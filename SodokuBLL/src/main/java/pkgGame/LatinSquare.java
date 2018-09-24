package pkgGame;

public class LatinSquare {
	
	private static int length;
	private int [][] myLatinSquare;
	
	public LatinSquare(int [][] twoDimArray)
	{
		this.myLatinSquare = twoDimArray;
	}
	
	public boolean containsZeros() {
		for (int iCol = 0; iCol < myLatinSquare.length; iCol++)
		{
			for (int iRow = 0; iRow < myLatinSquare.length; iRow++)
			{
				if (myLatinSquare[iRow][iCol]==0)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	
	public boolean doesElementExist(int[] arr, int iValue) {
		for (int i : arr) {
			if (i==iValue) {
				return true;
			}
		}
		return false;
	}
	
	public int[] getRow(int iRow) {
		for (int iRow = 0; iRow < LatinSquare.length; iRow++) {
			int[] myArray;
			System.out.println(iRow + "\t" + myArray[iRow]);
		}
	}

}
