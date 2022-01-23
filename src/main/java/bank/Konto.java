package bank;

public class Konto {
    private Valuta valuta;
    private double saldo;

    public Konto(Valuta valuta){
        this.valuta = valuta;
        saldo = 0;
    }

    public double withdraw (double ammount) throws Exception {
        if (saldo >= ammount) {
            saldo -= ammount;
            return saldo;
        } else throw new Exception("Your balance is lower than your requested withdrawing ammount");
    }
    public double deposit (double ammount){
        saldo +=ammount;
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
