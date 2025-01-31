package feature05;

public class TextBlockTest {
	public static void main(String[] args) {
		String oldJson="{"+
							"\"name\" : \"John\"," +
				            "\"age\" : 30" +	
						"}";
		System.out.println(oldJson);
		
		String json = """
				{
				    "name": "John",
				    "age": 30
				}
				""";
		
		System.out.println(json);
	}
}
