package com.ca.problems;

public class Problem18 {

	//Find the maximum sum travelling from the top of the triangle to the base.
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		final int rows = 15;
		
		/*
		int[] array = { 3,
						7,4,
						2,4,6,
						8,5,9,3 };
		*/		
		int[] array = { 75,
						95,64,
						17,47,82,
						18,35,87,10,
						20,04,82,47,65,
						19,01,23,75,03,34,
						88,02,77,73,07,63,67,
						99,65,04,28,06,16,70,92,
						41,41,26,56,83,40,80,70,33,
						41,48,72,33,47,32,37,16,94,29,
						53,71,44,65,25,43,91,52,97,51,14,
						70,11,33,28,77,73,17,78,39,68,17,57,
						91,71,52,38,17,14,91,43,58,50,27,29,48,
						63,66,04,68,89,53,67,30,73,16,69,87,40,31,
						04,62,98,27,23,9,70,98,73,93,38,53,60,04,23 };
		
		int iParent,iLeftChild,iRightChild;
		int parent,leftChild,rightChild;
		int rowCount;
		
		for(int i = rows - 1; i > 0; i--) {
			iParent = sigma(i - 1);
			rowCount = i;
			for(int j = iParent; rowCount > 0; j++) {
				iLeftChild = getLeftChildIndex(j, i);
				iRightChild = getRightChildIndex(j, i);
				parent = array[j];
				leftChild = array[iLeftChild];
				rightChild = array[iRightChild];
				if(leftChild > rightChild) {
					parent += leftChild;
				}
				else if(rightChild > leftChild) {
					parent += rightChild;
				}
				else if(rightChild == leftChild) {
					parent += leftChild;	//any child
				}
				array[j] = parent;
				rowCount--;
			}			
		}
		
		System.out.println("Your result = " + array[0]);
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");

	}
	
	public static int sigma(int number) {
		int sum = 0;
		for(int i = number; i > 0; i--) {
			sum += i;
		}
		return sum;
	}
	
	public static int getLeftChildIndex(int parent, int row) {
		return parent + row;
	}
	
	public static int getRightChildIndex(int parent, int row) {
		return parent + row + 1;
	}

}
