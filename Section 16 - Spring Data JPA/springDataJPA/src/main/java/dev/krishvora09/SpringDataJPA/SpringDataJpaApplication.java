package dev.krishvora09.SpringDataJPA;

import dev.krishvora09.SpringDataJPA.model.Student;
import dev.krishvora09.SpringDataJPA.repository.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

//        Student s1 = context.getBean(Student.class);
//        Student s2 = context.getBean(Student.class);
//        Student s3 = context.getBean(Student.class);
//
//        s1.setRollNo(101);
//        s1.setName("Krish");
//        s1.setMarks(84);
//
//        s2.setRollNo(102);
//        s2.setName("Mitul");
//        s2.setMarks(91);

//        s3.setRollNo(103);
//        s3.setName("Parth");
//        s3.setMarks(87);
//
//        repo.save(s2);
//        repo.save(s3);

//        System.out.println(repo.findAll());
//        System.out.println(repo.findById(102));

//        Optional<Student> s = repo.findById(104);
//        System.out.println(s.orElse(new Student()));

//        System.out.println(repo.findByName("Krish"));
//        System.out.println(repo.findByMarks(87));
//        System.out.println(repo.findByMarksGreaterThan(85));

        Student s2 = context.getBean(Student.class);

        s2.setRollNo(102);
        s2.setName("Mitul");
        s2.setMarks(94);

//        repo.save(s2);
        repo.delete(s2);
	}

}
