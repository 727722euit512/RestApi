
	package com.example.demo.service;

	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.example.demo.model.Student;
	import com.example.demo.repository.StudentRepository;

	@Service
	public class StudentService {
		@Autowired
		StudentRepository repository;
		
		public boolean Addstudent(Student stud) {
			repository.save(stud);
			return true;
		}
		public List<Student> getStudent(){
			return repository.findAll();
		}
		public Optional<Student> getStudentById(int id){
			return repository.findById(id);
		}
		public String updateStudent(Student stud) {
			repository.save(stud);
			return "Updated";
		}
		public boolean deleteStudentById(int id) {
			repository.deleteById(id);
			return true;
		}
		
	}

