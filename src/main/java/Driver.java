import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Hasil Count:" + counter.getCount());
		
		counter.increment(2);
		
		System.out.println("Hasil Count:" + counter.getCount());
		
		counter.decrement(10);
		
		System.out.println("Hasil Count:" + counter.getCount());
	}

}
