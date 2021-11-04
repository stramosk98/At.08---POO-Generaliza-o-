package pessoa;

public class PessoaMain {

		
		public static void main(String[] args) {
			
			Pessoa p = new Pessoa("Epslon", "Rio de Tras");
			System.out.println(p);

			
			PessoaFisica pf = new PessoaFisica("Arara", "RJ");
			System.out.println(pf);
			
			Pessoa pj = new PessoaJuridica("Jorge", "Rio de Janeiro");
			System.out.println(pj);

		}

	}