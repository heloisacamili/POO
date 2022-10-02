package avaliacaoPOO;

public class calca {
	public static int cod = 1;

	private int codigo;
	private String tecido, genero, tipo;
	private double  custo;
	
	public calca(String tecido, String genero, String tipo, double custo) {
		this.tecido = tecido;
		this.genero = genero;
		this.tipo = tipo;
		this.custo = custo;
		codigo = cod;
		cod++;
	}
	
	public calca() {
		codigo = cod;
		cod++;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getTecido() {
		return tecido;
	}
	
	public void setTecido(String tecido) {
		this.tecido = tecido;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
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
	
	public String getMostrarInformacoes() {
		return "\nCódigo: " + codigo
				+"\nTecido: " + tecido
				+"\nGênero: " + genero
				+"\nTipo: " + tipo
				+"\nCusto: R$" + custo;
		
	}
}
