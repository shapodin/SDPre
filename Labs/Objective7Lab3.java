public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 0;
    do {
      System.out.println(counter);

        if(counter % 2 == 0){
        System.out.println("The number is even");
        }

        else if((counter % 2) > 0) {
        System.out.println("The number is odd");
        }
      counter = counter + 1;
    } while (counter <= 20);
  }
}