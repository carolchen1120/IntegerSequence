import java.util.NoSuchElementException;
import java.lang.reflect.Array;

public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other){
    this.data = other;
    this.currentIndex = 0;
  }

  public void reset(){
    this.data = new int[0];
    this.currentIndex = 0;
  }

  public int length(){
    return (this.data.length);
  }

  public boolean hasNext(){
    return (this.currentIndex >= 0 && this.currentIndex < this.length());
  }

  //@throws NoSuchElementException
  public int next(){
    if (!this.hasNext()) {
      throw new NoSuchElementException();
    } else {
      this.currentIndex++;
      return (int)Array.get(this.data, this.currentIndex);
    }
  }

  public ArraySequence(IntegerSequence otherseq){
    this.data = otherseq;
  }



}
