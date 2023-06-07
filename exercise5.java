import java.util.Scanner;
import java.util.Locale;

// exercise 5
// Fazer um programa para ler o código de uma peça 1,
// o número de peças 1
// o valor unitário de cada peça 1
// código de uma peça 2
// o número de peças 2 
// o valor unitário de cada peça 2.
// Calcule e mostre o valor a ser pago.
class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int code1, code2, num1, num2, price1, price2, total_price;

    System.out.println("Enter the code from pieces from the type 1: ");
    code1 = input.nextInt();

    System.out.println("Enter the code from pieces from the type 2: ");
    code2 = input.nextInt();

    System.out.println("Enter the number of pieces from the type 1: ");
    num1 = input.nextInt();

    System.out.println("Enter the number of pieces from the type 2: ");
    num2 = input.nextInt();

    System.out.println("Enter the price of each piece from the type 1: ");
    price1 = input.nextInt();

    System.out.println("Enter the price of each piece from the type 2: ");
    price2 = input.nextInt();

    total_price = num1 * price1 + num2 * price2;

  
    System.out.println("The total value is: "+ total_price);
    input.close();
  }
}
