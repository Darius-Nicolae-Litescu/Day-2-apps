package ex1;

public class Main {
    /*
    // Question 1
    //Following is the new requirement from Client
    // Print employee id with their respective job location
    // for example
    // 101 : Delhi
    // 102 : Mumbai
    // and so on
     */
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        String[] employeeCodes = service.getEmployeeCodes();

        for (String employeeId : employeeCodes) {
            System.out.println(employeeId + " : " + service.getLocationFromEmployeeCode(employeeId));
        }
    }

}