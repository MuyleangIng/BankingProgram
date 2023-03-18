package co.istad.banking.database;

import co.istad.banking.CreditCard;
import co.istad.banking.SavingAccount;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Database {
    public static CreditCard creditCard(){
        CreditCard creditCard = new CreditCard(11223344,"MuyleangIng".toUpperCase(),10000.0);
        creditCard.setPin(123);
        creditCard.setLimitAmount(100000.0);
        creditCard.setThruDate(LocalDate.now().plus(1, ChronoUnit.DAYS));
        return creditCard;
    }

    public static SavingAccount savingAccount(){
        SavingAccount savingAccount = new SavingAccount(123456789,"SenPai",1000.0);
        savingAccount.setInterest(0.06);
        return savingAccount;
    }


}
