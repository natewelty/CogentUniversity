import java.util.Comparator;
import java.util.TreeSet;

public class Hello8 {
	public static void main(String[] args) {
		TreeSet<Employee> treeSet = new TreeSet<>(new EmpComparatorId());
		treeSet.add(new Employee(21,"James",19));
		treeSet.add(new Employee(3,"Jingleheimer",41));
		treeSet.add(new Employee(25,"Joeseph",32));
		treeSet.add(new Employee(1,"John",22));
		treeSet.add(new Employee(31,"Jack",37));
		treeSet.add(new Employee(2,"Jacob",25));
		treeSet.add(new Employee(7,"Schmidt",75));
		
		
		System.out.println("By Id:");
		treeSet.stream().forEach(s->System.out.println(s));
		
		TreeSet<Employee> treeSetAge = new TreeSet<>(new EmpComparatorAge());
		treeSetAge.addAll(treeSet);
		System.out.println("By Age:");
		treeSetAge.stream().forEach(s->System.out.println(s));
		
		
		System.out.println("By Id again:");
		treeSetAge.stream().sorted(new EmpComparatorId()).forEach(s->System.out.println(s));
	}
	
}

class Employee {
	private final int id;
	private final String name;
	private final int age;
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}

class EmpComparatorId implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getId()>o2.getId()) {
			return 1;
		}
		else if(o1.getId()==o2.getId()) {
			return 0;
		}
		else return -1;
		
	}
	
}

class EmpComparatorAge implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getAge()>o2.getAge()) {
			return 1;
		}
		else if(o1.getAge()==o2.getAge()) {
			return 0;
		}
		else return -1;
		
	}
}