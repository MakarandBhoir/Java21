package feature01;

import java.lang.Record;
import java.util.Objects;

// 1. Define an instance method, can not define a instance field
// 2. Define a static method and define a static field
// 3. Define a non-canonical record constructor
// 4. We can override getters but we can not override setters
// 5. We can declare getter methods
// 6. We can declare compact constructor

interface CustomerInterface {
	
}


record Address(String city, String state, String country) {
    
}

// canonical record constructor
final record Customer(int customerId, String customerName, String customerEmail) implements CustomerInterface {
	
	//private int instanceX;
	private static int staticX;
	
	int getCustomerId() {
		return customerId;
	}
	
	// compact constructor
	public Customer {
		System.out.println("Customer constructor");
		if (customerId < 0) {
			throw new IllegalArgumentException("Customer Id can not be negative");
		}
	}
	
	// non-canonical record constructor
	public Customer() {
		this(-1, "");
	}
	
	// non-canonical record constructor
	public Customer(int customerId, String customerName) {
		this(customerId, customerName, "");
    }

	@Override
	public int hashCode() {
		return Objects.hash(customerEmail, customerId, customerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(customerEmail, other.customerEmail) && customerId == other.customerId
				&& Objects.equals(customerName, other.customerName);
	}
	
}
