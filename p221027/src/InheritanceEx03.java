class ParentThree {
	String name;
	
	public ParentThree() {} // super();
	
	public ParentThree(String name) {
		this.name = name;
	}
}

class ChildThree extends ParentThree {
	
	// default constructor
	public ChildThree() {
		super();
	}
}

public class InheritanceEx03 {
	public static void main(String[] args) {

	}

}
