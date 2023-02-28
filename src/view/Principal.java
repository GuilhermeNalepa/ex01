package view;

import controller.MultiplicaController;

public class Principal {

	public static void main(String[] args) {
		
		MultiplicaController mc = new MultiplicaController();
		
		int n1 = 3;
		int n2 = 4;
		
		int multiplica = mc.multiplica(n1, n2);
		System.out.println(multiplica);
		
	}
	
}
