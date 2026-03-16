package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q01 {

	public static void recursiveCarpet ( double xCtr , double yCtr , double halfLength ) {
		if(halfLength < 0.01) {
			return;
		} else {
		StdDraw.filledSquare(xCtr,yCtr,halfLength);
		double newHalfLength = halfLength *2;
		StdDraw.filledSquare(xCtr+newHalfLength, yCtr + newHalfLength, halfLength/3);
		recursiveCarpet(xCtr+newHalfLength, yCtr + newHalfLength, halfLength/3);
		StdDraw.filledSquare(xCtr-newHalfLength, yCtr+newHalfLength, halfLength/3);
		recursiveCarpet(xCtr-newHalfLength, yCtr+newHalfLength, halfLength/3);
		StdDraw.filledSquare(xCtr+newHalfLength, yCtr-newHalfLength, halfLength/3);
		recursiveCarpet(xCtr+newHalfLength, yCtr-newHalfLength, halfLength/3);
		StdDraw.filledSquare(xCtr-newHalfLength, yCtr-newHalfLength, halfLength/3);
		recursiveCarpet(xCtr-newHalfLength, yCtr-newHalfLength, halfLength/3);
		}
		
	}

	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image01.png" in the images folder.

		//Your solution must use recursion

		double halfCarpetLength = 0.15 ;
		recursiveCarpet ( 0.5 , 0.5 , halfCarpetLength ) ;
	}

}
