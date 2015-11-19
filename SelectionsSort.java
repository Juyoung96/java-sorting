// SelectionSort.java

public class SelectionsSort extends Sorts {
   
    // instance variables
  private int[] selection = new int[12];
  private String name;
  
  // constructor
  public SelectionsSort() {
   selection = super.array;
   name = "Selection" ;
  }
  
  // methods
  public void sort() {
    
    System.out.println( "Doing " + name + " Sort:" );
    int count=1;
    
    int minValue, minIndex;
    for( int i=0; i < selection.length; ++i ) {
      
      System.out.print( "Step #" + count );
      
      // Temp values to remember the lowest # and its index
      minValue = selection[i];
      minIndex = i;
      
        for( int j = i+1; j<selection.length; ++j) {
        
          System.out.print( "Step #" + count ); // Stemp #1-1
          printArray();
          
         // Resets the lowest #
        if( selection[j] < minValue ) {
          minValue = selection[j];
          minIndex = j;
        }
        count++;
        }  
        selection [minIndex] = selection[i];
        selection[i] = minValue;
        
        count++;
        
    }
  }
    
} // END SelectionSort