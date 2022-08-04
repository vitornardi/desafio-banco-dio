
public class Main {

	public static void main(String[] args) {
		
		Cliente novoCliente = new Cliente();
		novoCliente.setNome("Novo Cliente");
		
		Conta cc = new ContaCorrente(novoCliente);
		Conta poupanca = new ContaPoupanca(novoCliente);
		
		cc.depositar(30);
		cc.depositar(100);
		cc.transferir(50, poupanca);
		cc.sacar(50);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
 