import java.util.Scanner;

// exercise 1
class Main {
  public static void main(String[] args) {
  
    Scanner entry = new Scanner(System.in);

    int num_a , num_b , sum;
    
    num_a =  entry.nextInt();

    num_b =  entry.nextInt();

    sum = num_a + num_b;
    
    System.out.println(" The sum of "+ num_a + " plus "+ num_b+ " is equal to: "+ sum);

    entry.close();
  }
}
