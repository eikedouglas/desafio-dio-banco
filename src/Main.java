public class Main {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente(new Cliente("João"));
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(new Cliente("Josué"));
        cc.transferir(27, poupanca);

        cc.imprmirExtrato();
        poupanca.imprmirExtrato();
    }
}
