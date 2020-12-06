import java.util.NoSuchElementException;

public interface IntegerSequence {
  boolean hasNext();//does the sequence have more elements?
  int next();       //return the current value in the sequence and advances to the next element.
  int length();     //returns the total length of the sequence
  void reset();     //start over from the start of the sequence
}


public class Range implements IntegerSequence{
  private int start, end, current;

  public Range(int start, int end){
    
  }

  public void reset(){

  }

  public int length(){

  }

  public boolean hasNext(){

  }

  //@throws NoSuchElementException
  public int next(){

  }

}
