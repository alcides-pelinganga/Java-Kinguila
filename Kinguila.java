import java.util.Scanner;

/**
 * Author: Alcides Pelinganga
 * Esta classe basica fornece o montante necessario em kwanzas
 *  para comprar divisas no mercado informal */


public class Kinguila {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Câmbio  Euros|Dólares (exemplo: 550): ");
        double rate = input.nextDouble();

        System.out.print("Montante pretendido em Euros|Dólares : ");
        double amount = input.nextDouble();

        double finalAmount = rate * amount;

        System.out.println("Montante para comprar Euros|Dólares : " + finalAmount +  "Kwanzas");

    }
}