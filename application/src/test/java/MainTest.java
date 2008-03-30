import junit.framework.TestCase;


public class MainTest extends TestCase {
	public void testMain() {
		Main main = new Main();
		assertNotNull(main.run());
	}

}
