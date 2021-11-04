package simples;


public class ContaMain {

	public static void main(String[] args) {
		// Teste Conta
		/*
		Conta c = new Conta("Banco do Brasil",123,321,0);
		if (c.deposito(1000))
			System.out.println("Depósito OK");
		System.out.println(c.deposito(-100));
		System.out.println(c.saque(100));
		System.out.println(c.saque(901));
		System.out.println(c);
		*/
		// Teste Conta Simples
		
		/*ContaSimples cs = new ContaSimples("Caixa", 456, 654, 100);
		System.out.println(cs.depositoPoupanca(-40000));
		System.out.println(cs.saquePoupanca(-40000));
		//System.out.println(cs.saquePoupanca(30000));
		System.out.println(cs);
		*/
		
		// Teste Conta Especial
		
		ContaEspecial ce = new ContaEspecial("Caixa", 456, 654, 100);

		System.out.println(ce);
	
		

	}

}