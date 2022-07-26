package ex1;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {

    private final String[] employees;
    private final Map<String, String> codeToWorkLocation;

    EmployeeService() {
        employees = new String[]{"101001011", "102001022", "103002011", "104003080", "105002020", "106002080"};
        codeToWorkLocation = new HashMap<>();
        codeToWorkLocation.put("101", "Delhi");
        codeToWorkLocation.put("102", "Mumbai");
        codeToWorkLocation.put("103", "Bangalore");
        codeToWorkLocation.put("104", "Pune");
        codeToWorkLocation.put("105", "London Bridge");
        codeToWorkLocation.put("106", "Ares");

    }

    public String getLocationFromEmployeeCode(String location) {
        if (codeToWorkLocation.containsKey(location)) {
            return codeToWorkLocation.get(location);
        } else {
            return "Unknown location";
        }
    }

    public String[] getEmployeeCodes() {
        String[] codes = new String[employees.length];
        int count = -1;
        for (String empid : employees) {
            codes[++count] = empid.substring(0, 3);
        }
        return codes;
    }


}//end employee service class


