package arryofobjects;

public class RegTest {
	 public static void main(String[] args) {
	        
	        Registration r = new Registration();
	        r.setEmail("syntax.gmail");
	        r.setUserName("Syntax101");
	        r.setPassword("123NewUser");
	        
	        String email = r.getEmail();
	        String userName = r.userName();
	        String password = r.password();
	        
	        System.out.println(email+" "+userName+" "+password);
	    }

}
