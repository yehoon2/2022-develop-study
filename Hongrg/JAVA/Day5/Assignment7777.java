public class Assignment7777 {
  public static void main(String[]args) {
    int [][] arr = {{1, 2, 3, 4} , {5, 6, 7, 8} , {9, 10, 11, 12}, {13, 14, 15, 16} };

    for (int i = 0; i < arr.length; i++){
      int[] inArr = arr[i];
      for (int j = 0; j < arr.length; j++){
        System.out.print(inArr[j] + " ");
      }
      System.out.println("");
    }
  }
}
