import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class jobsalaries
{
	public String employee;
	public int salary;
    
	public jobsalaries(String employee, int salary) {
		this.employee = employee;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return employee + "=" + salary;
	}

	public String  getemployee() {
		return employee;
	}

	public int getsalary() {
		return salary;
	}
	
	public static void main(String[] args)
	{
		// input list of Objects
		List<jobsalaries> js = new ArrayList<jobsalaries>();
    
		js.add(new jobsalaries("Software_Engineer", 80000));
		js.add(new jobsalaries("Business_Analyst", 120000));
		js.add(new jobsalaries("HR", 150000));
        
		Map<String, Integer> map = new HashMap<>();
                                               
		// construct key-value pairs from employee and salary fields of Job
		for (jobsalaries obj : js) {
			map.put(obj.getemployee(), obj.getsalary());
		}

		System.out.println("List : " + js);
		System.out.println("Map : " + map);
	}
	
}
