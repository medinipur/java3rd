package collectionList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeDetails {


	public static void main(String[] args) {
		Map<String, List<String>>_objEmployeeMap =new HashMap<>();
		List<String>_objEmployeeList =new ArrayList<>();
		
		_objEmployeeList =Arrays.asList("name","location");
		_objEmployeeMap.put("id",_objEmployeeList);
		
		
		for(Map.Entry<String, List<String>> entry:_objEmployeeMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}

	}

}
