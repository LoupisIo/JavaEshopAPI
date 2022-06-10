package gr.upatras.JavaEshopProject;

import java.util.*;

/**
 * @author loupis.io
 *
 */
public class User {
	public String name;
	public String password;
	public String email;
	
	//Constructor
	public User(String name, String email){
		this.name=name;
        this.email=email;
    }
	
	
	//Setters and getters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
