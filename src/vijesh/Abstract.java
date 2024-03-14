package vijesh;


abstract class Addition{
			
abstract void add();
			
public void sub()
{
 System.out.println("Subraction");
}
}

abstract class ImplementedMethod extends Addition{
	
abstract void division();

public void multipy()
{
	System.out.println("Multiplication");
}
}

class Abstract extends ImplementedMethod{
	public void add(){
	System.out.println("Addition");
	}
	public void division() {
		System.out.println("division");
	}
			public static void main(String[] args) {
				Abstract obj=new Abstract();
				obj.add();
				obj.sub();
				obj.multipy();
				obj.division();

			}

		}
	


