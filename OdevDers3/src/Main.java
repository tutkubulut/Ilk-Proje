
public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setAge(35);
		instructor.setVerilenEgitim("Java");
		
		Student student = new Student();
		student.setFirstName("Tutku");
		student.setLastName("Bulut");
		student.setAge(24);
		student.setStudentId(1);
		student.setAlinanEgitim("Java");
		
		StudentManager studentManager = new StudentManager();
		studentManager.dersEkle(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.dersAc(instructor);

	}

}
