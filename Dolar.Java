package AtividadePratica;

public class Dolar extends Moeda {
	
	public Dolar(double valor){
	       this.valor = valor;
}
	
	@Override
	public void info() {
		System.out.println("Dólar - "+ valor);
	}
	
	//Convertendo para real
	@Override
	public double converter() {
		return this.valor * 4.8;
	}
	
	//Comparação entre objetos
	@Override
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Dolar objetoDeDolar = (Dolar) objeto;
		
		if(this.valor != objetoDeDolar.valor) {
			return false;
		}
		
		return true;
	}
}
