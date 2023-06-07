import java.util.Scanner;

// exercise 2
class Main {
  public static void main(String[] args) {

    System.out.println("Enter a number for the radius: ");

    Scanner input = new Scanner(System.in);

    int radius;
    radius = input.nextInt();
    
    double area, pi = 3.14159;

    area = pi*radius*radius;

    System.out.println("The area of the circle with a radius of "+ radius + " is:" + area);

  }
}
