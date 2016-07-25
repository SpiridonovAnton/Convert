	import static org.junit.Assert.assertEquals;

	import java.util.HashMap;
	import java.util.Map;

	import org.junit.Before;
	import org.junit.Test;

	public class TestConvecto {
		private Addvalue addvalue;
		private Map<String, Float> map;

		@Before
		public void beforeStart() {
			createMockAddValue();
			map = new HashMap<String, Float>();
			map.put("USD,UAH", 5.0f);
			map.put("Eur,UAH", 10.0f);
			
		}
		private void createMockAddValue() {
			addvalue = new Addvalue();
			addvalue.setVal1("usd");
			addvalue.setVal2("uah");
			addvalue.setSum("2");
		}
		
		@Test
		public void testCal() {
			Calculation a = new Calculation(addvalue);
			
			
	     Float res = a.convert(map);
	     assertEquals(Float.valueOf(10), res);
				
			
		}
		
		


	}






