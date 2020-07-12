package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arraylist ne list ko implement kiya 
		//we can take list interface for all classs in which List is getting implemented
		List<String> list =new ArrayList<>();
		list.add("Puja");
		list.add("Aklesh");
		list.add("Nitu");
		list.add("Puja");
		for(String s:list)
		{
			System.out.println(s);
		}

	
	}

}
