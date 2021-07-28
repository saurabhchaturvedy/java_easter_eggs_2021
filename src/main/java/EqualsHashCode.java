import java.util.*;

public class EqualsHashCode {


    public static void main(String[] args) {

        Map<EmployeeKey, Integer> employeeMap = loadEmployeeCache();

        EmployeeKey employeeKey = new EmployeeKey(456,"deepak");

        Integer salary = employeeMap.get(employeeKey);
        System.out.println(salary);

        Set<EmployeeKey> employeeSet = new HashSet<>();
        employeeSet.add(new EmployeeKey(1,"abc"));
        employeeSet.add(new EmployeeKey(2,"def"));
        employeeSet.add(new EmployeeKey(3,"fgh"));
        employeeSet.add(new EmployeeKey(1,"abc"));
        employeeSet.add(new EmployeeKey(5,"lmn"));


        System.out.println(employeeSet);

    }


    static Map<EmployeeKey,Integer> loadEmployeeCache()
    {
        EmployeeKey ek1 = new EmployeeKey(123,"sauarbh");
        EmployeeKey ek2 = new EmployeeKey(456,"deepak");
        EmployeeKey ek3 = new EmployeeKey(789,"mahesh");



        Map<EmployeeKey,Integer> employeeMap = new HashMap<>();
        employeeMap.put(ek1,1000);
        employeeMap.put(ek2,2000);
        employeeMap.put(ek3,5000);

        return employeeMap;
    }
}

class EmployeeKey
{

    int empId;
    String name;

    public EmployeeKey(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeKey that = (EmployeeKey) o;
        return empId == that.empId && Objects.equals(name, that.name);
    }


//    @Override
//    public int hashCode() {
//        return Objects.hash(empId, name);
//    }

    // Not using hashcode , will not let you get values from map based on a key , and set will allow duplicates which is not desired !

    @Override
    public String toString() {
        return "EmployeeKey{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }
}