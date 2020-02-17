
public class Test{
	class T extends Exception{}
	public void run() throws T {}
	public void test() throws Exception {
		run();
	}
}