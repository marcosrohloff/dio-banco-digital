package br.com.dio;

public class AppBanco {
	
	public static void main(String[] args) {
		
        Cliente cliente = new Cliente();
        cliente.setNome("Paola");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(120);
        cc.transferir(80, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
		
	}

}
