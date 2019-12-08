package arryofobjects;

public class Registration {

	private String email;
    private String userName;
    private String password;
    
    public void setEmail(String email) {
         if(email.contains("gmail")) {
             this.email = email;
         }
         else {
             System.out.println("Please enter a gmail account");
         }
    }
    
    public void setUserName(String userName) {
        if(!userName.isEmpty() && userName.length()>6) {
            this.userName = userName;
        }
        else {
            System.out.println("User name cannot be empty or less than 6 character");
        }
    }
    
    public void setPassword(String password) {
        if(!password.isEmpty() && !password.contains(userName)&&password.length()>6) {
            this.password = password;
        }
        else {
            System.out.println("Password cannot be empty, less than 6 character, or cannot contain user name");
        }
    }
    
    public String getEmail() {
        return email;
    }
    public String userName() {
        return userName;
    }
    public String password() {
        return password;
    } 
    
    
    
}

