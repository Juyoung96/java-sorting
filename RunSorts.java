/*
 * Project: RunSorts.java
 * Description: Running various sorting methods on the same array
 * Name: Juyoung
 * Date: Nov 17, 2015
 */ 

public class RunSorts {
  
  public static void main( String[] args ) {

    // Bubble Sort
    BubbleSort b = new BubbleSort();
    System.out.println( "Unsorted: " + b );
    b.sort();
    System.out.println( "SORTED: " + b + "\n" );
    
    // Selection Sort
    SelectionsSort s = new SelectionsSort();
    System.out.println( "Unsorted: " + s );
    s.sort();
    System.out.println( "SORTED: " + s + "\n" );
    
    // Insertion Sort
    
    // Quick Sort
    
    // Merge Sort
    
    // Radix Sort 
    
  } // END main method
  
} // END RunSorts