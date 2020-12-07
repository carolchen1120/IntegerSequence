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
    this.start = start;
    this.end = end;
    this.current = start;
  }

  public void reset(){
    this.start = 0;
    this.end = 0;
  }

  public int length(){
    return (this.end - this.start + 1);
  }

  public boolean hasNext(){
    return (this.current >= this.start && this.current <= this.end);
  }

  //@throws NoSuchElementException
  public int next(){

  }

}
