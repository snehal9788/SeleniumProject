import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		Student amol = new Student(75.5f, "Amol", 5.3f);
		Student satish = new Student(93.5f, "Satish", 4.5f);
		Student rajesh = new Student(50f, "Rajesh", 3f);
//Elements should be homogenous as well as
		t.add(amol);
		t.add(satish);
		t.add(rajesh);
		System.out.println(t);
		 Iterator<Student> itr=t.iterator()
				 while(itr.hasNext()) {
					 System.out.println(itr.next().name);
				 }
	}
}
