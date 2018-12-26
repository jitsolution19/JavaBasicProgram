package hashMap;

import java.util.HashMap;

public class SetData {

	public static void main(String[] args) {
		HashMap<String, String> Entry =new HashMap<>();
		Entry.put("Name","Jitendra");
		Entry.put("Name","Akansha");
		Entry.put("Name","Golu");
		Entry.put("Age","23");
		System.out.println(Entry.get("Name"));
	}

}
