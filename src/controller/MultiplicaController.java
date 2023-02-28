package controller;

public class MultiplicaController {
	
	public MultiplicaController() {
		
		super();
		
	}
	
	public int multiplica(int n1, int n2) {
		
		if (n2 == 0) {
			
			return 0;
			
		} else {
			
			n2 = n2 - 1;
			return n1 + multiplica(n1, n2);
			
		}
		
	}

}
