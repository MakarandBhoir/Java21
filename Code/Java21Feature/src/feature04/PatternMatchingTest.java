package feature04;

public class PatternMatchingTest {

	public static void main(String[] args) {
//		testSwitchExpression1();
//		testSwitchExpression2(100.5);
//		testSwitchExpression3();
//		testSwitchExpression4();
//		testSwitchExpression5();
		testInstanceOfOperator();
	}

	private static void testSwitchExpression1() {
		int day = 1;
		switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
		}
		// lambda expression in switch
		switch(day) {
			case 1 -> System.out.println("Monday");
			case 2 -> System.out.println("Tuesday");
		}
	}

	private static void testSwitchExpression2(Object obj) {
		//Object obj = "Hello";
		
		switch(obj) {
			case String str -> System.out.println("String type = "+str);
			case Integer i -> System.out.println("Integer type = "+i);
			default -> System.out.println("Unknown type");
		}
	}

	private static void testSwitchExpression3() {
		Object obj = 10;
		String message = switch(obj) {
			case String str -> {
								System.out.println();
								yield "String type = "+str;
						}
			case Integer i -> "Integer type = "+i;
			default -> "Unknown type";
		};
		System.out.println(message);
	}
	
	private static void testSwitchExpression4(){
		Integer obj = -10;
		switch(obj) {
			case Integer i when i > 0 -> System.out.println("Positive Integer = "+i);
			case Integer i when i < 0 -> System.out.println("Negative Integer = "+i);
			case Integer i when i == 0 -> System.out.println("Zero Integer = "+i);
			case null -> System.out.println("Null Integer");
			default -> System.out.println("Unknown type");
		}
	}
	private static void testSwitchExpression5(){
		Integer obj = 0;
		switch(obj) {
			case Integer i when i > 0:
				System.out.println("Positive Integer = "+i);
				break;
			case Integer i when i < 0:
				System.out.println("Negative Integer = "+i);
			    break;
			case Integer i when i == 0:
				System.out.println("Zero Integer = "+i);
			    break;
			case null:
				System.out.println("Null Integer");
				break;
			default:
				System.out.println("Unknown type");
		}
	}
	
	private static void testInstanceOfOperator() {
		Object obj = "Hello";
		if (obj instanceof String) {
			String str = (String) obj;
			System.out.println("String type = "+str);
		} else if (obj instanceof Integer) {
			Integer i = (Integer) obj;
			System.out.println("Integer type = "+i);
		}
		
		if(obj instanceof String str) {
            System.out.println("String type = "+str);
        } else if(obj instanceof Integer i) {
            System.out.println("Integer type = "+i);
        }
	}
}





