package Exercicios.Interfaces.Exercicio1.Application;

import Exercicios.Interfaces.Exercicio1.Entities.CarRental;
import Exercicios.Interfaces.Exercicio1.Entities.Vehicle;
import Exercicios.Interfaces.Exercicio1.Services.BrazilTaxService;
import Exercicios.Interfaces.Exercicio1.Services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter rental data");
        System.out.print("Cad model: ");
        String carModel = sc.nextLine();
        System.out.printf("Pickup (dd/MM/yyyy hh:ss): ");
        Date start = sdf.parse(sc.nextLine());
        System.out.print("Return (dd/MM/yyyy hh:ss): ");
        Date finish = sdf.parse(sc.nextLine());

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.printf("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("INVOICE: ");
        System.out.println("Basic Payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total Payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
        sc.close();
    }
}
