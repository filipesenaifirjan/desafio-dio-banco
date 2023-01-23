
public class Main {
	
	public static void main(String[] args) {
		Cliente filipe = new Cliente();
		filipe.setNome("Filipe");
		
		
		Conta cc = new ContaCorrente(filipe);
		cc.depositar(344);
		
		Conta poupanca = new ContaPoupanca(filipe);
		
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
