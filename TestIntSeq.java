public class TestIntSeq() {
  int[]nums = {1,3,5,0,-1,3,9};
  IntegerSequence as = new ArraySequence(nums);

  System.out.println("ArraySequence(array):");
  while(as.hasNext()){
   System.out.print(as.next()+", ");
  }

}
