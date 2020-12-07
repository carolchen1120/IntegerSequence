import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other){
    this.data = other;
    this.currentIndex = 0;
  }

  public void reset(){
    this.data = [];
    this.currentIndex = 0;
  }

  public int length(){
    return (this.data.size());
  }

  // public boolean hasNext(){
  //   return (this.current >= this.start && this.current <= this.end);
  // }
  //
  // //@throws NoSuchElementException
  // public int next(){
  //   if (!this.hasNext()) {
  //     throw new NoSuchElementException();
  //   } else {
  //     this.current++;
  //     return this.current;
  //   }
  // }



}
