package JSONPractice;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class jsonDataTypes {

	// JSON Object
	@Test
	public void jsonString() {
		JSONObject obj1 = new JSONObject();
		obj1.put("name", "saurabh");
		obj1.put("ID", 1637);

		// create simple Array
		String[] arr = { "java", "selenium" };

		// Add simple array to JASON Array
		JSONArray jarray = new JSONArray();
		for (String skill : arr) {
			jarray.add(skill);
		}
		// ADD JSONarray to JSONobj
		obj1.put("skills", jarray);

		System.out.println("JSON Object" + obj1);
	}

	@Test
	public void jsonstring2() {
		JSONObject obj3 = new JSONObject();
		obj3.put("Name", "Sam");
		obj3.put("ID", 124);

		String[] arr = { "Java", "paython" };
		JSONArray jarr = new JSONArray();
		for (String skills : arr) {
			jarr.add(skills);
		}
		obj3.put("Skill", jarr);
		System.out.println(obj3.toJSONString());
	}

	// JSON Array of objects
	@Test
	public void jsonObjectArray() {
		// create JSON object
		JSONObject obj2 = new JSONObject();
		obj2.put("name", "saurabh");
		obj2.put("ID", 1637);

		JSONObject obj3 = new JSONObject();
		obj3.put("name", "Akash");
		obj3.put("ID", 1636);

		// create JSONArray
		JSONArray jarr = new JSONArray();
		jarr.add(obj2);
		jarr.add(obj3);

		System.out.println("JSON Array of objects:" + jarr.get(0));
		System.out.println("JSON Array of objects:" + jarr);
	}

}
