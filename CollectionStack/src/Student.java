
public class Student implements Comparable {
	float marks;
	String name;
	float height;

	public Student(float marks, String name, float height) {
		super();
		this.marks = marks;
		this.name = name;
		this.height = height;
	}
	public int compareTo(Object o) {
		Student s=(Student)o;
		return this.name.compareTo(s.name);
		
	}
}
