package one.digitalinovation.gof.singleton;

/**
 * Singleton "apressado".
 * @author victor
 *
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
