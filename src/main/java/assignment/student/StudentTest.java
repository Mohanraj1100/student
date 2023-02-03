package assignment.student;
import java.util.*;
import java.util.logging.*;
import java.util.Comparator;

public class StudentTest {

	public static void main(String[] args) {
		
		Logger log = Logger.getLogger("hi");
		int i = 0;
		Student ob1 = new Student("mohan",18,9.18);
		Student ob2 = new Student("kawin",19,8.06);
		Student ob3 = new Student("gopi",17,7.99);
		Student ob4 = new Student("kl",17,10.76);
		
		ArrayList <Student>list  =  new ArrayList<Student>();
		list.add(ob1);
		list.add(ob2);
		list.add(ob3);
		list.add(ob4);
		while(i<list.size()) {
			log.info(list.get(i).getName() + list.get(i).getAge() + list.get(i).getGpa() );
			i++;
		}
		log.info("List After GPA sorted ");
		
		i=0;
		Collections.sort(list, new Comparator<Student>()
				{
					public int compare(Student o1, Student o2) {
						if(o1.getGpa()<o2.getGpa())
						{
							return 1;
						}
						else if(o2.getGpa()== o1.getGpa())
						{
							return 0;
						}
						else {
							return -1;
						}
					}
			
				});
		while(i<list.size()) {
			log.info(list.get(i).getName() + list.get(i).getAge() + list.get(i).getGpa() );
			i++;
		}
		
	}

}
