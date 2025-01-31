package feature05;

public class StringTemplateTest {

	public static void main(String[] args) {
		String result = createJson("Alex", 30);
		System.out.println(result);

	}

	private static String createJson(String name, int age) {
		String json = STR."""
				{
				    "name": \{name},
				    "age": \{age}
				}
				""";
		return json;
	}
}
