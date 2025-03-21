
public class Nodo {
	private int valor;
	private Nodo prox;

	public Nodo() {
		this.setValor(0);
		this.setProx(null);
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Nodo getProx() {
		return prox;
	}

	public void setProx(Nodo prox) {
		this.prox = prox;
	}
	
	

}
