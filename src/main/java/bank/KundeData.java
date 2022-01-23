package bank;

public class KundeData {
    private int kundenummer;
    private String navn;
    private int alder;
    private String køn;


    public KundeData(int kundenummer, String navn, int alder, String køn) {
        this.kundenummer = kundenummer;
        this.navn = navn;
        this.alder = alder;
        this.køn = køn;
    }
    public int getKundenummer(){
        return kundenummer;

    }

    public void setKundenummer(int kundenummer){
        this.kundenummer = kundenummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String getKøn() {
        return køn;
    }

    public void setKøn(String køn) {
        this.køn = køn;
    }
}
