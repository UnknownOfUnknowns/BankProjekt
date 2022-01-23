package bank;


public class Valuta {
private String name;
private double valToDKK;

    public Valuta(String name, double valToDKK) {
        this.name = name;
        this.valToDKK = valToDKK;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Valuta{" +
                "name='" + name + '\'' +
                ", valToDKK=" + valToDKK +
                '}';
    }

    public double getValToDKK() {
        return valToDKK;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValToDKK(double valToDKK) {
        this.valToDKK = valToDKK;
    }
}


