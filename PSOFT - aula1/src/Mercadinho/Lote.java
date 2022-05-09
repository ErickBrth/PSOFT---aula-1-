package Mercadinho;

public class Lote {
	String id;
	Produto produto;
	int quantidade;

	public Lote(Produto p, int qtd) {
		produto = p;
		quantidade = qtd;
	}

	@Override
	public String toString() {
		return "Lote [id=" + id + ", produto=" + produto + ", quantidade=" + quantidade + "]";
	}
	
	
}
