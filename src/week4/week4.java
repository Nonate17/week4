package week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class week4 {


	public static void main(String[] args) {
List<String> employeeNames = new ArrayList<>();
employeeNames.add("Nick");
employeeNames.add("Alec");
employeeNames.add("Karson");
employeeNames.add("Bryan");
employeeNames.add("Konner");

StringBuilder namesBuilder = new StringBuilder();
for (int i = 0; i < employeeNames.size(); i++) {
	if (i<= employeeNames.size()){
		namesBuilder.append(i +" ");
	}
}
System.out.println(namesBuilder.toString());


Set<Integer> ids = new HashSet<>();
ids.add(17);
ids.add(7);
ids.add(22);
ids.add(84);
ids.add(21);

StringBuilder idsBuilder = new StringBuilder();
for (int i = 0; i < ids.size(); i++) {
	if (i <= ids.size()) {
		idsBuilder.append(i + "-");
	}
}



Map<Integer, String> employeeMap = new HashMap<>();

for (Integer id : ids) {
employeeMap.put(id, null);
for (String name : employeeNames) {
employeeMap.put(id, name);
}


}


System.out.println(employeeMap);

System.out.println(idsBuilder.toString());



	}

}
