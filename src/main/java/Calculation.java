import java.util.*;

public class Calculation {
private Addvalue addvalue;
	
	
	public Calculation(Addvalue addvalue){
		this.addvalue = addvalue;
	}

	public Float convert(Map<String, Float> map) {
		String kay = addvalue.getVal1().toUpperCase()+(",")+(addvalue.getVal2().toUpperCase());
		kay=kay.toUpperCase();
		Float i = (Float) map.get(kay);
        Float res = null;

        if(i!= null) {
            res = i* Float.valueOf(addvalue.getSum());
		}
        return res;
    }
}
