package Exercicios.Composicao.Exercicio3.Entities;

import Exercicios.Composicao.Exercicio3.EntitiesEnum.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment = new Date();
    private OrderStatus status;
    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        double sum = 0;

        for (OrderItem i: items){
            sum += i.subTotal();
        }
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        double total = 0;

        for (OrderItem i : items){
            sb.append(i.getProduct().getName() + ", $" + String.format("%.2f", i.getProduct().getPrice()) + ", Quantity: " + i.getQuantity() + ", Subtotal: $" + String.format("%.2f", i.subTotal()) + "\n");
            total += i.subTotal();
        }

        sb.append("Total price: $" + total);

        return sb.toString();
    }
}
