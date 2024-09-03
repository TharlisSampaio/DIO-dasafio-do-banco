public class ContaPoupanca extends Conta{

    @Override
    public void imprimiExtrato() {
        System.out.println("Extrato da Conta Poupança");
        super.imprimirInfoComuns();
    }

}
