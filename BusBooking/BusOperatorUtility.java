import java.util.ArrayList;

public class BusOperatorUtility 
{
     
    ArrayList<BusOperator> busoperator=new ArrayList<>();
    BusOperator currentOperator=null;
	
    public void registerOperator() 
	{
        System.out.println("operator registered successfully !");
    }
	
    public void operatorLogin(String operatorId, String operatorName) 
	{
        boolean found=false;
	
        for (BusOperator bs:busoperator) 
		{
            if (bs.getOperatorId().equals(operatorId) && bs.getOperatorName().equals(operatorName))
            {
                currentOperator=bs;
                System.out.println("");	
                System.out.println("login successful! Welcome to " + bs.getOperatorName());
                found=true;
                break;
            }
        }
	 
        if (!found) 
		{
            throw new IllegalArgumentException("Invalid operator id, name, password, or phone number!");
        }
    }
	
	public void addOperator(String operatorid1,String operatorname1,String operatorpassword1,String operatornum1)
	{
		System.out.println("operators added successfully !");
	}
	
	public boolean removeOperator(String operatorId) 
	{
        for (int i=0;i<busoperator.size();i++) 
	    {
            if (busoperator.get(i).getOperatorId().equals(operatorId)) 
		    {
                busoperator.remove(i);
                System.out.println("operator removed successfully! ID: " + operatorId);
                return true;
            }
        }
                System.out.println("Operator ID not found: " + operatorId);
                return false;
    }
	
	public void viewOperators() 
	{
        if (busoperator.isEmpty()) 
	    {
            System.out.println("no operators found.");
            return;
        }
    
            System.out.println("----- bus operators list -----");
            for (BusOperator bs : busoperator) 
	        {
                System.out.println("ID       : " + bs.getOperatorId());
                System.out.println("NAME     : " + bs.getOperatorName());
                System.out.println("PASSWORD : " + bs.getOperatorPassword());
                System.out.println("PHONE    : " + bs.getOperatorPhoneNum());
                System.out.println("-------------------------------");
            }
    }

}
