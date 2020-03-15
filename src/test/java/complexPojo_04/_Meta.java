package complexPojo_04;

public class _Meta {

	private boolean success;
	private int code;
	private String message;
	private int totalCount;
	private int pageCount;
	private int currentPage;
	private int perPage;
	private RateLimit rateLimit;

	public _Meta(boolean success, int code, String message, int totalCount, int pageCount, int currentPage, int perPage,
			RateLimit rateLimit) {

		this.success = success;
		this.code = code;
		this.message = message;
		this.totalCount = totalCount;
		this.pageCount = pageCount;
		this.currentPage = currentPage;
		this.perPage = perPage;
		this.rateLimit = rateLimit;
	}

	public _Meta() {

	}

	public boolean isSuccess() {
		return success;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getPerPage() {
		return perPage;
	}

	public RateLimit getRateLimit() {
		return rateLimit;
	}

}
