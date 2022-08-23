
public class Desafio {

	    private int entrega;
	    private String desafio;
	    private boolean solucao;



	    public Desafio (String desafio, int tempoDeSolucao){
	        this.desafio = desafio;
	        this.entrega = tempoDeSolucao;
	        this.solucao = false;
	    }

	   

	    public int getEntrega() {
			return entrega;
		}



		public void setEntrega(int entrega) {
			this.entrega = entrega;
		}



		public String getDesafio() {
			return desafio;
		}



		public void setDesafio(String desafio) {
			this.desafio = desafio;
		}



		public boolean isSolucao() {
			return solucao;
		}



		public void setSolucao(boolean solucao) {
			this.solucao = solucao;
		}



		public void statusDesafio(Desafio desafio, int prazo){
	        if(this.entrega >= prazo){
	           this.solucao = true;
	            System.out.println("O desafio entregue PARABENS");
	        } else {
	            this.solucao = false;
	            System.out.println("O desafio não foi ENTREGUE.");
	        }
	    }

	}
	


