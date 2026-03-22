public class Main {
    public static void main(String[] args) {
        System.out.println("BIENVENIDO AL SISTEMA BANCARIO");
        Billetera miBilletera = new Billetera("Juan Perez", 100.0);

        miBilletera.mostrarSaldo();

        double monto = 30.0;
        miBilletera.transferir(monto);

        miBilletera.transferir(10.0);
        miBilletera.transferir(5.0);
        miBilletera.transferir(15.0);

        miBilletera.mostrarSaldo();

        Billetera billetera2 = new Billetera("Maria Lopez", 500.0);
        billetera2.mostrarSaldo();
    }
}