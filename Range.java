import java.util.NoSuchElementException;

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
    if (!this.hasNext()) {
      throw new NoSuchElementException();
    } else {
      this.current++;
      return this.current;
    }
  }

}
