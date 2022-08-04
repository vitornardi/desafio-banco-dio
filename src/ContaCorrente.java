
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente novoCliente) {
		super(novoCliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirMovimentacao();
	}

}
