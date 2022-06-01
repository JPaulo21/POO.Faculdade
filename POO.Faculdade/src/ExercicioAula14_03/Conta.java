package ExercicioAula14_03;

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numConta;
	private int titularConta;
	private Cliente cliente;
	

	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getTitularConta() {
		return titularConta;
	}
	public void setTitularConta(int titularConta) {
		this.titularConta = titularConta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	@Override
	public String toString() {
		return "Conta\nSaldo: R$" + saldo + "\nAgência: "
				+ agencia + "\nNúmero Conta: " + numConta + "\nTitular da Conta: " + titularConta +"\n" + cliente;
	}

	
	

}
