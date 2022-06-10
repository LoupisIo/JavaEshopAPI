/**
 * 
 */
package gr.upatras.JavaEshopProject;
import java.util.*;

/**
 * @author loupis.io
 *
 */
public class ShoppingCart {
	
	public static ArrayList<ItemOrdered> orderList = new ArrayList<ItemOrdered>();
	public static ArrayList<Item> itemsList = new ArrayList<Item>();
	Buyer buyer;
	
	
	
	public ShoppingCart(Buyer buyer) {
        this.buyer=buyer;
    }
	
	public boolean cartIsEmpty() {
		 
	        if(orderList.isEmpty()){
	            return true;
	        }else{
	            return false;
	        }
	        
	}
	
	public void addItemOrdered(Item item, int quantity) {
		
		for(Item x :itemsList) {
			if(x.getId()==item.getId()) {
				//Check if there is enough stock
				if(quantity>x.getStock()) {
					System.out.println("There is not enough stock for this product. Please try lowering the quantity of choose a difrent product");
					return;
				}else{
				//Check if the item already exists in the ShoppingCart
					for(ItemOrdered order:orderList) {
						if(order.getItem().getId()==item.getId()) {
							order.setQuantity(order.getQuantity()+quantity);
							
							System.out.println("Your Shopping cart has been updated");
							return;
						}
					}
					//Add the item in the shopping Cart.
					ItemOrdered newOrder = new ItemOrdered(item,quantity);
					orderList.add(newOrder);
					
					System.out.println("Your Shopping cart has been updated");
					return;
				}	
			}
		}
	}
	
	
	
	public void removeItemOrdered(int iOrd){
        
        
    }
	
	public void changeItemOrderedQuantity(int id, int quantity){
		
		final ItemOrdered order = orderList.get(id -1); 
			//Find the item in the orderList
			
				//Check for available Stock
				int change = order.getQuantity() - quantity;
					//find the item in the list
				for(Item x:itemsList) {
					
					if(x.getId()==order.getItem().getId()) {
						//Check if the user wants more or not
						if (change<0) {
						//Check if there is enough stock
							if(x.getStock()<(-change)) {
								System.out.println("There is not enough stock for this product. Please try lowering the quantity of choose a difrent product");
								return;
							}
						}
						
						
						order.setQuantity(quantity);
						return;
					}
				}
					
			
		
	}

	

	public void clearCart(){
		//Clears the shopping Cart
        orderList.clear();
    }

	public void checkOut() {
		System.out.println("Do you wish to procced to checkout?  Y/N");
		final Scanner scanner = new Scanner(System.in);
		final String answer = scanner.nextLine();
				if (answer=="N") {
			return ;
		}else if(answer=="Y") {
			buyer.setBonus(0 * 0.1);
			clearCart();
			return;
			
		}else {
			checkOut();
		}
		
		
	}
	
    public  double calculateNet(){
        //Calculates the final cost
        double totalCost =0+calculateCourierCost();
        return totalCost;
    }
    
    
    
    
    public  double calculateCourierCost(){
        //Calculates the shipping Cost
        double totalPrice= 0;
        
        totalPrice=totalPrice*0.05;
        if(buyer.getBuyerCategory()== "GOLD"){
            totalPrice=0;
        }else if(buyer.getBuyerCategory()=="SILVER"){
            totalPrice=totalPrice/2;
        }else {
            if (totalPrice<3){

                totalPrice=3;
            }
        }
        return totalPrice;
    }
}
