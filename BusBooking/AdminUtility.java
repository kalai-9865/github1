import java.util.ArrayList;

public class AdminUtility
{
  ArrayList<Admins>adminss=new ArrayList<>();
  Admins currentAdmin=null;
  
    public void registerAdmin()
    {
	    System.out.println("admin rgister successfully !");
    }
  
    public void adminLogin(String adminid,String adminname,String adminpassword,String adminnum) 
    {
        boolean found=false;
	
    for(Admins a:adminss)
	{
        if(a.getAdminId().equals(adminid)&& a.getAdminName().equals(adminname)&& a.getAdminPassword().equals(adminpassword)&& a.getAdminPhoneNum().equals(adminnum)) 
		{
            currentAdmin=a;
			System.out.println("");	
            System.out.println("login successful! Welcome to " +adminname);
            found=true;
			break;
        }
    }
	 
        if(!found)
            {
                throw new IllegalArgumentException("invalid adminname or password !");
            }
   }
 
 
}
 
 