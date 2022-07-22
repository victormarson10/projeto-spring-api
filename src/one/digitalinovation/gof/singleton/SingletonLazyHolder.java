package one.digitalinovation.gof.singleton;

/**
 * Singleton "apressado".
 * @author victor
 *
 */

public class SingletonLazyHolder {
	
	private static class InstanceHolder {
	public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
