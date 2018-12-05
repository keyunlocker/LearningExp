import javalearning.ScopeOfVariable;

/**
 * when inheritance then when object of subclass is made then the constructor of supper class is called automatically
 * @author key
 *
 */
public class TrySubclassProtected extends ScopeOfVariable{
	int con=2;
	public static void main(String args[]) {
		TrySubclassProtected trySubclassProtected= new TrySubclassProtected();
		ScopeOfVariable sc= new TrySubclassProtected();
		System.out.println(sc.con);
		System.out.println(((TrySubclassProtected)sc).con);//have child object in the parent reference but also able to access child con using type cast
		//System.out.println(trySubclassProtected.f);//throwing compile time error
		//as default can not be accessed in the subclass in different package
		System.out.println(trySubclassProtected.d);
		System.out.println(trySubclassProtected.e);
		//System.out.println(trySubclassProtected.c);//since it is private
		int a=118;
		int b=15;
		int c=a&b;
		System.out.println(c);
		
	}
	
}
