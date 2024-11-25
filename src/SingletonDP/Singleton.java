package SingletonDP;

public class Singleton {

	private static Singleton uniqueintance;
	
	private Singleton() {
		
	}
	public static synchronized Singleton getInstance() {
		if(uniqueintance==null) {
			synchronized(Singleton.class) {
				if(uniqueintance==null) {
					uniqueintance=new Singleton();

				}
			}
		}
		
		return uniqueintance;
	}
}
