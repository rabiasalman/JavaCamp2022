package oop1;

public class Main {

	public static void main(String[] args) {
		 
		String mesaj="Vade oran�";
		
		//Product s�n�f�ndan bir nesne olu�turuldu
		//Field de�er atand�
		//set value
		Product product1=new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("bilmemne.jpg");
	
         
	
		
		Product product2=new Product();
		product2.setName("Delonghi Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("bilmemne.jpg");
		
		
		Product product3=new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("bilmemne.jpg");
	
		
		Product[] products= {product1,product2,product3};
		System.out.println("<ul>");
		for(Product product:products) {
			System.out.println("<li>"+ product.getName()+"</li>");
			
		}
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.setId(1);
        individualCustomer.setPhone("05222222222222");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demiro�");
		
        
        CorporateCustomer corporateCustomer=new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("0511111111");
        corporateCustomer.setTaxNumber("1111111111");
        corporateCustomer.setCustomerNumber("54321");
        
        
        Customer[] customers= {individualCustomer,corporateCustomer};
        
        
        
        
		
		
		

	}

}
