package bank;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Kunde> kunder;
    private double saldo;
    public Bank (){
        kunder = new ArrayList<>();
        saldo = 1000000;
    }
    public void addkunde(Kunde kunde) {
        kunder.add(kunde);
    }

    public ArrayList<Kunde> getKunder() {
        return kunder;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
