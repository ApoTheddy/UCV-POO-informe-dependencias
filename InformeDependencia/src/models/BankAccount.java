package models;

import java.util.Date;
import javax.swing.JOptionPane;
import models.Client;
import lombok.Getter;
import lombok.Setter;

public class BankAccount {

    @Getter
    @Setter
    private String accountNumber;
    
    @Getter
    @Setter
    private double balance;

    /*
   * Al declarar una variable de tipo 'Cliente' estamos indicando que la clase
   * 'CuentaBancaria' depende de 'Cliente' para que pueda funcionar correctamente
     */
    private Client headline;

    public BankAccount(Client headline) {
        this.headline = headline;
        accountNumber = generateNumberAccount();
    }

    public void depositeMoney(double amount) {
        balance += amount;
        JOptionPane.showMessageDialog(null, "Se deposito la cantidad de S/" + amount + " correctamente el dinero");
    }

    public void withdrawals(double amount) {
        if (balance >= 0 && amount <= balance) {
            balance -= amount;
            JOptionPane.showMessageDialog(null, "Se retiro la cantidad de S/" + amount + " a la cuenta de " + headline.getName() + "correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede retirar dinero, ya que no cuenta con lo suficiente");
        }
    }

    public String obtenerNombreTitular() {
        return headline.getName();
    }

    String generateNumberAccount() {
        return headline.getName().split("")[0] + new Date().getTime() + "bank";
    }
}
