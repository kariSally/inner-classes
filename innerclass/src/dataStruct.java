
public class dataStruct {
	//CREATE ARRAY
	private final static int SIZE = 100;
	private int[] arrayOfInts = new int [SIZE];
	
	public dataStruct() {
		//FILL ARRAY W ASCENDING INT VALS
		for(int i=0;i<SIZE;i++) {
			arrayOfInts[i] =i;
		}
		
	}
	
	public void printEven() {
		//PRINTS VALS OF EVEN NO.s
		dataStructIterator iterator = this.new EvenIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+ " ");
		}
		System.out.println();
	}
	
	interface dataStructIterator extends java.util.Iterator<Integer>{}
	//INNERCLASS IMPLEMENTING dataStructIterator INTERFACE WHICH EXTENDS THE ITERATOR <INTEGER> INTERFACE
	
	private class EvenIterator implements dataStructIterator{
		//BEGIN STEPPING THROUGH ARRAY FROM START
		private int nextIndex = 0;
		
		public boolean hasNext() {
			//CHECK IF CURRENT ELEMENT IS LAST IN ARRAY
			return(nextIndex < SIZE - 1);
		}
		
		public Integer next() {
			//RECOR VALS OF EVEN INDICES OF ARRAY
			
			Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
			
			//GET NEXT EVEN ELEMENT
			nextIndex += 2;
			return retValue;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FILL ARRAY W INT VALS AND PRINT OUT ONLY THE EVEN ONES
		
		dataStruct ds = new dataStruct();
		ds.printEven();

	}

}
