package Exercicios.Interfaces.Exercicio2.Services;

import Exercicios.Interfaces.Exercicio2.Entities.Contract;
import Exercicios.Interfaces.Exercicio2.Entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractServices {
    private PaymentService paymentService;

    public ContractServices(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;
        for (int count = 1; count <= months; count++) {
            double updatedQuota = basicQuota + paymentService.insterest(basicQuota, count);
            double fullQuota = updatedQuota + paymentService.paymentFee(updatedQuota);

            Date dueDate = addMonths(contract.getRegisterDate(), count);

            contract.getInstallments().add(new Installment(dueDate, fullQuota));
        }
    }

    private Date addMonths(Date date, int n){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, n);

        return calendar.getTime();
    }
}
