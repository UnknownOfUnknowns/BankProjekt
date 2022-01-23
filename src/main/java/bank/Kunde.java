package bank;

public class Kunde {
    private KundeData kundeData;
    private Konto konto;

    public Kunde(KundeData data){
        kundeData = data;
        konto = new Konto(new Valuta("DKK", 1));
    }

    public Konto getKonto() {
        return konto;
    }

    public KundeData getKundeData() {
        return kundeData;
    }
}

