public class ContaCorrente extends Conta{

    @Override
    public void imprimiExtrato() {
        System.out.println("Extrato da Conta Corrente");
        super.imprimirInfoComuns();

    }
}
