package ExercicioAula14_03;

public class Main {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		Cliente cliente = new Cliente();
		
		cliente.setNome("João Paulo");
		cliente.setCpf("132.809.620-30");
		cliente.setProfissao("Dev. Java Jr.");
		
		System.out.println(cliente+"\n");	
		
		conta.setCliente(cliente);
		conta.setSaldo(0);
		conta.setAgencia(0001);
		conta.setNumConta(4512349);
		conta.setTitularConta(1);
		
		System.out.println(conta);
		  
	}
	
}
