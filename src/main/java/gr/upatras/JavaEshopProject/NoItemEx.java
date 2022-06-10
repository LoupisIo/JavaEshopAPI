package gr.upatras.JavaEshopProject;

public class NoItemEx extends Exception {
    public String ExceptionMessage()
    {
        return "This Item does not exists";
    }
}