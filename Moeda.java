package AtividadePratica;


//A classe Moeda servirá como classe mãe para as outras moedas
public abstract class Moeda {
//Usando protected pois as classes filhas não acessam esse valor	
	protected double valor;
	
	public abstract void info();
	public abstract double converter();
}
