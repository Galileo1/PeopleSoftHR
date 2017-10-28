import java.util.HashSet;
import java.util.Set;

public class Dup {

	public static void main(String[] args) {
		String [] name = new String[] {"d","e", "e", "p", "a","k"};
		findDup(name);

	}

	private static void findDup(String[] name) {
		// TODO Auto-generated method stub
		Set<String> dup = new HashSet<String>();
		for (int i=0; i < dup.size(); i++){
			if (dup.add(name[i])){
				
				System.out.println("Non Duplicate Element : " + name[i]);
			} else {
				
				System.out.println("Duplicate Element : " + name[i]);
			}
			
		}
		
	}

}
