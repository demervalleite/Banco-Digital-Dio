
public abstract class Conta implements iConta {
	
	private static final int AGENCIA_PADRAO = 1;
	
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected double saldoTotal;
	protected Cliente cliente;

	private int contaPoupanca;

	private int contaCorrente;

	

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
  
   
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public int getSaldo() {
		return (int) saldo;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
		
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	public double somarContas(double saldoTotal) {
		saldoTotal = (contaCorrente + contaPoupanca);
		return saldoTotal;
		
		
	}
	
	protected void imprimirInfoComuns() {
		
		System.out.println(String.format("Titular : %s",this.cliente.getNome()));
		System.out.println(String.format("Agencia : %d",this.agencia));
		System.out.println(String.format("Numero : %d",this.numero));
		System.out.println(String.format("Saldo : %.2f",this.saldo));
		System.out.println(String.format("Saldo Total : %.2f",this.saldoTotal));
		System.out.println("***************************************");
	}



	public void somarContas(double contaCorrente, double contaPoupanca) {
		
		
	}
	
	   


}
