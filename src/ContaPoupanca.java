
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente novoCliente) {
		super(novoCliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirMovimentacao();
	}

}