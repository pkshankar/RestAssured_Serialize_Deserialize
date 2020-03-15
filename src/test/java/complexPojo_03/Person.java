package complexPojo_03;

public class Person {
	
	private String name;
	private Children[] children;
	
	public Person(String name, Children[] children) {
		
		this.name = name;
		this.children = children;
	}
	
	public Person() {
		
	}

	public String getName() {
		return name;
	}

	public Children[] getChildren() {
		return children;
	}
	
	
	
	

}
