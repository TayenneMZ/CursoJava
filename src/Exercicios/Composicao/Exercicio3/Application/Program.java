package Exercicios.Composicao.Exercicio3.Application;

import Exercicios.Composicao.Exercicio3.Entities.Client;
import Exercicios.Composicao.Exercicio3.Entities.Order;
import Exercicios.Composicao.Exercicio3.Entities.OrderItem;
import Exercicios.Composicao.Exercicio3.Entities.Product;
import Exercicios.Composicao.Exercicio3.EntitiesEnum.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter client data");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        System.out.println();
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        sc.nextLine();
        String status = sc.nextLine();
        System.out.print("How many items to this order? ");
        int numberItems = sc.nextInt();

        Order order = new Order(OrderStatus.valueOf(status), new Client(name, email, birthDate));

        for (int cont = 1; cont <= numberItems; cont++) {
            System.out.println();
            System.out.println("Enter #" + cont + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String nameItem = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem item = new OrderItem(quantity, price, new Product(nameItem, price));

            order.addItem(item);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println("Order moment: " + sdf2.format(order.getMoment()));
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + order.getClient().getName() + " (" + sdf.format(order.getClient().getBrithDate()) + ") - " + order.getClient().getEmail());
        System.out.println("Order items: ");
        System.out.println(order);
    }
}
