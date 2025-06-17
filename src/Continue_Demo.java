public class Continue_Demo {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        continue;           // 4  is omited
      }
      System.out.println(i);
    }  
  }
}
