package gr.upatras.JavaEshopProject;
import java.util.*;
/**
 * 
 */

/**
 * @author loupis.io
 *
 */
public class Pen extends Item{
	
	public String colour;
	public double tipSize; /* In mm */
	
	
	public String getDetails() {
        return colour + " " + tipSize;
    }
	
	public Pen(int id, String name, String description, double price, int stock, String colour, Double tipSize) {
		super(id, name, description, price, stock,"Pen");
		this.colour = colour;
		this.tipSize = tipSize;
		
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getTipSize() {
		return tipSize;
	}

	public void setTipSize(double tipSize) {
		this.tipSize = tipSize;
	}
	
	
	
	
}
