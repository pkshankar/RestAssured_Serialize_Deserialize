package complexPojo_04;

public class RateLimit {
	
	private int limit;
	private int remaining;
	private int reset;
	
	public RateLimit(int limit, int remaining, int reset) {
		
		this.limit = limit;
		this.remaining = remaining;
		this.reset = reset;
	}
	
	public RateLimit() {
		
	}

	public int getLimit() {
		return limit;
	}

	public int getRemaining() {
		return remaining;
	}

	public int getReset() {
		return reset;
	}
	
	
	
	

}
