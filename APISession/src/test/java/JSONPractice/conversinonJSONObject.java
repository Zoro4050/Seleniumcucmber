package JSONPractice;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.testng.annotations.Test;

public class conversinonJSONObject {

	@Test
	public void MapToJSONObjectConversion() {
		Map ref = new HashMap();
		ref.put("Name", "Saurabh");
		ref.put("ID", "1376");
		ref.put("Company", "Google");
		ref.put("Mobile", "1234567890");
		System.out.println("MAP:" + ref);
		// convert map to JSON object
		String jsonString = JSONValue.toJSONString(ref);
		System.out.println("JSONObject:" + jsonString);
	}

	@Test
	public void stringToJSONObject() {

		String str = "{\"Company\":\"Google\",\"ID\":\"1376\",\"Mobile\":\"1234567890\",\"Name\":\"Saurabh\"}";

		Object obj = JSONValue.parse(str);
		JSONObject jObj = (JSONObject) obj;

//		Object n = jObj.get("Name");
//		String name = n.toString();
//		System.out.println(name);
		// OR
		String name = (String) jObj.get("Name");
		System.out.println(name);

	}
}
