package Exercicios.Heranca.Exercicio2.Application;

import Exercicios.Heranca.Exercicio2.Entities.ImportedProduct;
import Exercicios.Heranca.Exercicio2.Entities.Product;
import Exercicios.Heranca.Exercicio2.Entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int number = sc.nextInt();

        for (int cont = 1; cont <= number; cont++) {
            System.out.println();
            System.out.println("Product #" + cont + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char choose = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (choose == 'i') {
                System.out.print("Custom fee: ");
                double customFee = sc.nextDouble();

                Product product = new ImportedProduct(name, price, customFee);

                list.add(product);
            } else if (choose == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());

                Product product = new UsedProduct(name, price, manufactureDate);

                list.add(product);
            } else{
                Product product = new Product(name, price);

                list.add(product);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");

        for (Product product : list){
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
