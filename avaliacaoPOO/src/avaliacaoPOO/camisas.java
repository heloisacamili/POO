package avaliacaoPOO;

public class camisas {
	public static int cod = 1;

	private int codigo;
	private String cor, tipo;
	private double custo;
	private boolean estampa;
	
	public camisas(String tipo, String cor, double custo, boolean estampa) {
		this.tipo = tipo;
		this.cor = cor;
		this.custo = custo;
		this.estampa = estampa;
		codigo = cod;
		cod++;
	}
	
	public camisas() {
		codigo = cod;
		cod++;
	}
		
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getCusto() {
		return custo;
	}
	
	public void setCusto(double custo) {
		this.custo = custo;
	}
	
	public boolean isEstampa() {
		return estampa;
	}
	
	public void setEstampa(boolean estampa) {
		this.estampa = estampa;
	}
	
	public String getMostrarInformacoes() {
		return "\nCódigo: " + codigo
				+"\nTipo: " + tipo
				+"\nCor: " + cor
				+"\nCusto: R$" + custo
				+"\nEstampa: " + estampa;
	}
}
