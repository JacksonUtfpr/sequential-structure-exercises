import java.util.Scanner;

// exercise 3
// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
class Main {
  public static void main(String[] args) {

    System.out.println("Enter four integer numbers: ");

    Scanner input = new Scanner(System.in);

    int A , B , C , D , result;
    
    A = input.nextInt();
    B = input.nextInt();
    C = input.nextInt();
    D = input.nextInt();
    
    result = A * B - C * D;
  
    System.out.println("The product of the first typed number and the second, minus the product of the fourth and the fifth number is:  "+ A + " times: " + B + " minus "+ C + " times: " + D + " is: " + result);

  }
}
