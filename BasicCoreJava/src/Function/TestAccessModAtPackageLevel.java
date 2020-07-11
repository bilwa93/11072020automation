package Function;

public class TestAccessModAtPackageLevel extends AccessModifiers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers obj=new AccessModifiers();
		obj.publicfunction();
		
		//AccessModifiers obj1=new AccessModifiers();
		obj.defaultFunction(); 
		obj.protectedfunction();
	}

}
