
public class movimentoCodarMain {

	public static void main(String[] args) {
		
		//CRIANDO OBJETO DO TIPO APREDIZCODAR
		AprendizCodar ap = new AprendizCodar();
		ap.setNome("Alison");
		ap.setEmail("Alisonpyter@hotmail.com");
		ap.setEntregaDesafioString("entrege");
				
		System.out.println(ap.getNome());
		System.out.println(ap.getEmail());
		System.out.println(ap.getEntregaDesafioString());
		System.out.println();
		
		
		
		//CRIANDO OBJETO DO TIPO MENTORESCODAR
		MentoresCodar mentoresCodar = new MentoresCodar();
		mentoresCodar.setNome("Vinicios Ueda");
		mentoresCodar.setCpf("33355577712");
		mentoresCodar.setFuncao("Mentor");
		mentoresCodar.setTiraDuvidas("sim");
		
		
		System.out.println(mentoresCodar.getNome());
		System.out.println(mentoresCodar.getCpf());
		System.out.println(mentoresCodar.getFuncao());
		System.out.println(mentoresCodar.getTiraDuvidas());
		System.out.println();
		
		
		
		//CRIANDO OBJETO DO TIPO ORGANIZADOR
		Organizadores organizadores = new Organizadores();
		organizadores.setNome("Jessica Cestaro");
		organizadores.setCpf("9999999999");
		organizadores.setFuncao("organizador");
		
				
				
		System.out.println(organizadores.getNome());
		System.out.println(organizadores.getCpf());
		System.out.println(organizadores.getFuncao());
		System.out.println();
		
		
		
		//CRIANDO OBJETO DO TIPO DESAFIO
		Desafio desafio = new Desafio("java", 1);
		desafio.setDesafio("java");
		desafio.setEntrega(1);
		desafio.setSolucao(false);
		
		
		System.out.println(desafio.getDesafio());
		System.out.println(desafio.getEntrega());
		System.out.println(desafio.isSolucao());
		
	
		
				
	}

}
