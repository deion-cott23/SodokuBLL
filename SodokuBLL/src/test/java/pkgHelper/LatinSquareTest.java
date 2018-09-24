package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgGame.LatinSquare;

public class LatinSquareTest {

	@Test
	public void getRowTest() {
		
		int[][] myArray = {{1,2,3}, {2,3,1}, {3,1,2}};
		
		LatinSquare ls = new LatinSquare(myArray);
		
		System.out.println(ls.getRow(1));
		
	}

}
