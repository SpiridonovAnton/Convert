/**
 * Created by Anton on 24.07.2016.
 */

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
public class TestConvecto2 {
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
        addvalue.setVal1("usd11");
        addvalue.setVal2("uah");
        addvalue.setSum("2");
    }
        @Test
        public void testCal2(){
            Calculation a = new Calculation(addvalue);


            Float res = a.convert(map);
            assertEquals(null, res);
        }
    }





