// BubbleSort.java

public class BubbleSort extends Sorts {
  
  // instance variables
  private int[] bubble = new int[12];
  private String name;
  
  // constructor
  public BubbleSort() {
   bubble = super.array;
   name = "Bubble" ;
  }
  
  // methods
  public void sort() {
    // Timing: BEST = 0(n); AVE/WORST = 0(n^2)
    
    System.out.println( "Doing " + name + " Sort:" );
    boolean continueLoop;
      do {
      
      continueLoop = false;
      for ( int i = 0; i < bubble.length-1; i++ ) {
        if( bubble[i] > bubble[i+1] ) {
         super.swap( i, i+1 ); 
         continueLoop = true;
        }
      }
      
    } while( continueLoop );
      
  }
  
} // END BubbleSort