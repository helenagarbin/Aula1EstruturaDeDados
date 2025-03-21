
public class Lista {
	private Nodo inicio;

	public Lista() {
		this.setInicio(null);
	}

	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public void insereFinal(int valor) {
		Nodo novo = new Nodo();
		novo.setValor(valor);
		novo.setProx(null);
		
		if(this.inicio == null)
			this.inicio = novo;
		else {
			Nodo aux = this.inicio;
			while(aux.getProx() != null) {
				aux = aux.getProx();
			}			
			aux.setProx(novo);
		}	
	}

	public void imprimeValores() {
		Nodo aux = this.inicio;
		
		while(aux != null) {
			System.out.println("Valor: "+aux.getValor());
			aux = aux.getProx();
		}
		
	}
	
}



