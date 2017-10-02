import java.util.Scanner;
public class ClassifyMessage {
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		String catString, payload;
		double latitude, longitude, south, north, west, east;
		boolean isInRange=true;
		MessageCategory category;
		
		south = 39.882343;
		north = 40.231315;
		west = -105.743511;
		east = -104.907864;
		
		System.out.println("Please enter a formatted message:");
		catString = Keyboard.next(); 
		latitude = Keyboard.nextDouble();
		longitude = Keyboard.nextDouble();
		payload = Keyboard.nextLine();
		
		if(catString == "fire"){
			category=MessageCategory.ALERT;
		}
		else{
			if(catString == "smoke"){
				category=MessageCategory.ALERT;
			}
			else{
				if(catString == "need"){
					category=MessageCategory.NEED;	
				}
					else{
						if(catString == "offer"){
						category=MessageCategory.OFFER;
						}
							else{
								if(catString == "structure"){
									category=MessageCategory.INFO;
								}
									else{
										if(catString == "road"){
											category=MessageCategory.INFO;
										}
											else{
												if(catString == "evac"){
													category=MessageCategory.INFO;
												}
												else{
													if(catString == "photo"){
														category=MessageCategory.INFO;
													}
													else{
														category=MessageCategory.UNKNOWN;
													}
												}
											}
									}
							}
					}
				}
				
			}
		
	if(latitude>=south){
		if(latitude<=north){
			if(longitude>=west){
				if(longitude<=east){
					isInRange=true;
				} 
				
			}
		}
		else{
			isInRange=false;
		}
	}
	
	System.out.println("Category:\t"+category);
	System.out.println("raw cat:\t"+catString);
	System.out.println("message:\t"+payload);
	System.out.println("latitude:\t"+latitude);
	System.out.println("longitude:\t"+longitude);
	System.out.println("Is In Range:\t"+isInRange);
	
	
	
	}
			
			
					
		
		
		
		
		

	

}
