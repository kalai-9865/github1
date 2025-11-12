public class BusOperator
{
	private String operatorId;
	private String operatorName;
	private String operatorPassword;
	private String phoneNumber;
	
    public BusOperator(String operatorId,String operatorName,String operatorPassword,String phoneNumber)
	{
		this.operatorId=operatorId;
		this.operatorName=operatorName;
		this.operatorPassword=operatorPassword;
		this.phoneNumber=phoneNumber;
	}
	
	public void setOperatorId(String operatorId)
	{
		this.operatorId=operatorId;
	}
	public void setOperatorName(String operatorName)
	{
		this.operatorName=operatorName;
	}
	public void setOperatorPassword(String operatorPassword)
	{
		this.operatorPassword=operatorPassword;
	}	
	public void setOperatorPhoneNum(String phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}
	
	public String getOperatorId()
	{
		return operatorId;
	}
	public String getOperatorName()
	{
		return operatorName;
	}
	public String getOperatorPassword()
	{
		return operatorPassword;
	}	
	public String getOperatorPhoneNum()
	{
		return phoneNumber;
	}
	
}