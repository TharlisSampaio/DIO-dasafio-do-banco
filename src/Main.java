public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Conta contaCorrente = new ContaCorrente();
        contaCorrente.depositar(100);

        contaCorrente.imprimiExtrato();

        Conta contaPoupanca = new ContaPoupanca();
        contaCorrente.transferir(contaPoupanca, 100);

        contaPoupanca.imprimiExtrato();
        contaCorrente.imprimiExtrato();
    }
}