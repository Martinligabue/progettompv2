package progettomp;

public class ContoCorrente {
	private final String name;
	private int id;
	private double saldo;

	public ContoCorrente(String name, double saldo) {
		this.name = name;
		this.saldo = saldo;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getSaldo() {
		return saldo;
	}
}