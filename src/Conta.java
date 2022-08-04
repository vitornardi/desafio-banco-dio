
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente novoCliente;
	
	private int count = 0;
	
	public Conta(Cliente novoCliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.novoCliente = novoCliente;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	protected void imprimirMovimentacao() {
		System.out.println(String.format("Titular: %s", this.novoCliente.getNome()));
		System.out.print(String.format("Numero: %d - ", this.numero));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Saldo: %.2f", this.saldo));		
	}


}
