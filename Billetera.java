public class Billetera {
    double balanceTotal; // CAMBIO que te toca a ti (antes era saldo)
    String titular;

    public Billetera(String titular, double saldoinicial) {
        this.titular = titular;
        this.balanceTotal = saldoinicial; // también aquí cambias saldo → balanceTotal
    }

    public void transferir(double monto) {
        balanceTotal = balanceTotal - monto;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de " + titular + ": $" + balanceTotal);
    }
}