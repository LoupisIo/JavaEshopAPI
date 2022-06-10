package gr.upatras.JavaEshopProject;

public class NoBuyerEx extends Exception{
    
	public String exceptionMessage()
    {
        return "This Buyer does not exists";
    }
}
