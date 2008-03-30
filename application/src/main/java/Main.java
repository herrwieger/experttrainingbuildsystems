import de.softwareexperts.HelloWorld;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public Object run() {
		HelloWorld helloWorld = new HelloWorld();
		return helloWorld.toString();
	}

}
