import java.util.Scanner;
import java.util.Locale;

// exercise 4
// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.
class Main {
  public static void main(String[] args) {

    System.out.println("Enter your ID, your worked hours and the price per worked hour");

    Scanner input = new Scanner(System.in);

    int workers_id, worked_hours;
    double price_per_hour, payment;
    
    workers_id = input.nextInt();
    worked_hours = input.nextInt();
    price_per_hour = input.nextDouble();

    payment = worked_hours * price_per_hour;
  
    System.out.println("Workers ID:  "+ workers_id + "; Worked hours: " + worked_hours + "; Payment "+ payment);
    input.close();
  }
}
