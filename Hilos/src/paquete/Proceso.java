package paquete;

public class Proceso extends Thread {
	
	public Proceso(String msg) {
		super(msg);
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.println(this.getName() + " - Iteración: " + i);
		}
	}
}
