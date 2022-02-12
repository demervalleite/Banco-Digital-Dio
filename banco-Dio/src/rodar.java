
public class rodar {
	
	public static void main(String[] args) {
		
		Cliente cliente  = new  Cliente();
		cliente.setNome("demerval");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("wesley");
		
		Cliente cliente3 = new Cliente();
		cliente2.setNome("janayna");
		
		
		
		
		Conta cc = new contaCorrente(cliente);
		//cc.depositar(100);
		Conta cp = new contaPoupanca(cliente);
		//cc.transferir(100, cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		Conta cc2 = new contaCorrente(cliente2);
		Conta cp2 = new contaPoupanca(cliente2);
		cc2.imprimirExtrato();
		cp2.imprimirExtrato();
		
		Conta cc3 = new contaCorrente(cliente2);
		Conta cp3 = new contaPoupanca(cliente2);
		cc3.imprimirExtrato();
		cp3.imprimirExtrato();
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

	

	

}
