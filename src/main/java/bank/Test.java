package bank;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        RenteTilskriver renteTilskriver = new RenteTilskriver(1.1);
        for (int i = 0; i < 10; i++) {
            Kunde kunde = new Kunde(new KundeData(i, "Jens", 20, "Mand"));
            kunde.getKonto().deposit(i);
            bank.addkunde(kunde);
        }
        for (Kunde kunde: bank.getKunder()) {
            System.out.println(kunde.getKonto().getSaldo());
        }

        for (Kunde kunde: bank.getKunder()) {
            renteTilskriver.addInterest(kunde.getKonto(), bank);
        }

        System.out.println("Renter tilskrevet");

        for (Kunde kunde: bank.getKunder()) {
            System.out.println(kunde.getKonto().getSaldo());
        }
    }
}
