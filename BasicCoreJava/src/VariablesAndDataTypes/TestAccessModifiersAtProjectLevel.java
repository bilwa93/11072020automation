package VariablesAndDataTypes;

import Function.AccessModifiers;
import Function.TestAccessModAtPackageLevel;

public class TestAccessModifiersAtProjectLevel extends AccessModifiers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers obj=new AccessModifiers();
		obj.publicfunction();
		
		TestAccessModifiersAtProjectLevel obj2=new TestAccessModifiersAtProjectLevel();
		obj2.protectedfunction();
		
	}

}
