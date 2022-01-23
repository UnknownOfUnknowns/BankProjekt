package bank;

public class RenteTilskriver {
    private double interest;

    public RenteTilskriver (double interest) {
        this.interest = interest;

    }

    public void addInterest(Konto konto, Bank bank){
        konto.deposit(konto.getSaldo()*interest/100);
        bank.setSaldo(-konto.getSaldo()*interest/100+ bank.getSaldo());
    }
}
