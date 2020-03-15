package complexPojo_03;

public class Children {
	
	private String name;
	private Children[] children;
	
	public String getName() {
		return name;
	}

	public Children[] getChildren() {
		return children;
	}

	public Children(String name, Children[] children) {
		
		this.name = name;
		this.children = children;
	}
	
	public Children() {
		
	}
	
	
	
	

}
