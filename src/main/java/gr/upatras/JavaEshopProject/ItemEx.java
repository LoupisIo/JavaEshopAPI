package gr.upatras.JavaEshopProject;

class ItemEx extends Exception {
    public String ExceptionMessage()
    {
        return "This Item already exists";
    }
}