package co.istad.banking;

import co.istad.banking.database.Database;
import java.time.LocalDate;

public class BankProgram {

    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard();
        creditCard.setNumber(888111222);
        creditCard.setPin(123);
        creditCard.setThruDate(LocalDate.now());
        if (creditCard.getNumber().equals(Database.creditCard().getNumber())){
            creditCard = Database.creditCard();
        }
        creditCard.deposit(500.50);

        creditCard.showBalance();
        SavingAccount savingAccount = new SavingAccount(123456789,"MuyleangIng",100.0);
        if (savingAccount.getNumber().equals(Database.savingAccount().getNumber())){
            savingAccount = Database.savingAccount();
        }
        savingAccount.showBalance();
    }
}
