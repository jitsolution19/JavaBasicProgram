package hashMap;

import java.util.HashMap;

public class SetData {

	public static void main(String[] args) {
		HashMap<String, String> Entry =new HashMap<>();
		Entry.put("Name","Jitendra");
		Entry.put("Name","Akansha");
		Entry.put("Name","Golu");
		System.out.println(Entry.get("Name"));
	}

}
