package ex2;

import java.util.HashMap;
import java.util.Map;

public class EmailFilters {
    String[] emails = {

            "ramesh@gmail.com",
            "rakesh@outlook.com",
            "lokesh@linkedin.com",
            "mahesh@gmail.com",
            "ganesh@gmail.com",
            "rajesh@outlook.com"
    };

    public static void main(String[] args) {
        EmailFilters application = new EmailFilters();
        Map<String, Integer> domainToUserCount = new HashMap<>();

        for (String email: application.emails) {
            String domain = email.split("@")[1];
            if(domainToUserCount.containsKey(domain)){
                domainToUserCount.put(domain, domainToUserCount.get(domain) + 1);
            } else{
                domainToUserCount.put(domain, 1);
            }
        }

        for (Map.Entry<String, Integer> entry: domainToUserCount.entrySet()) {
            System.out.println(entry.getKey() + " has " + entry.getValue() + " users");
        }
    }

}
