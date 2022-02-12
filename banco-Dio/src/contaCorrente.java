
public class contaCorrente extends Conta {

	public contaCorrente(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" ***** Imprimir extrato conta corrente ******** ");
		super.imprimirInfoComuns();
	}

	
	
	

}
