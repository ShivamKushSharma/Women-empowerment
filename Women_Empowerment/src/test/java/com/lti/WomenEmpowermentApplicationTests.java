package com.lti;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.dao.NgoRepository;
import com.lti.dao.RegisRepository;
import com.lti.dao.TcRepository;
import com.lti.dao.UserRepository;
import com.lti.entity.Ngo;
import com.lti.entity.Registration;
import com.lti.entity.Training_course;
import com.lti.entity.User;
import com.lti.service.NgoService;
import com.lti.service.TrainingCourseService;
import com.lti.service.UserRegistrationService;
import com.lti.service.UserService;

@SpringBootTest
class WomenEmpowermentApplicationTests {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private NgoRepository ngoRepo;
	
	@Autowired
	private RegisRepository regRepo;
	
	@Autowired
	private TcRepository tcRepo;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private NgoService ngoService;
	
	@Autowired
	private UserRegistrationService userRegistrationService;
	
	@Autowired
	private TrainingCourseService trainingCourseService;
	
	
	
    private Collection<User> user_List = new ArrayList<User>();
	
	private Collection<Ngo> ngo_List = new ArrayList<Ngo>();
	
	private Collection<Training_course> tc_List = new ArrayList<Training_course>();
	
	@Test
	public void testUserService() {
		
		User user = new User();
		user.setU_id(1);
		user.setPassword("wordpass");
		Assertions.assertTrue(userService.createUser(user) instanceof User);
		
	}
	
	@Test
	void testAddUser() {
		
		User user = new User();
		user.setU_id(1);
		user.setPassword("zaq1xsw2");
		user.setName("Bhumi");
		user.setUsername("bhumi16");
		user.setDob("16Oct2000");
		user.setMobileNo("9999999999");
		userRepo.save(user);
		Assertions.assertNotNull(userRepo.findById(1).get());
		
	}
	
	@Test
	public void testReadAllUser() {
		List<User> user_List = userRepo.findAll();
		Assertions.assertTrue(user_List.size() > 0);
	}
	
	
	/*@Test
	public void testSingleUser() {
		User user = userRepo.findById(1).get();
		Assertions.assertEquals("welcome123", user.getPassword());
	}*/
	
	
	@Test
	public void testUpdateUser() {
		User user = userRepo.findById(1).get();
		user.setPassword("iamgdz");
		userRepo.save(user);
		Assertions.assertNotEquals("welcome123", userRepo.findById(1).get().getPassword());
	}
	
	
	@Test
	public void testNgoService() {
		
		Ngo ngo=new Ngo();
		ngo.setNgo_id(1);
		ngo.setNgo_name("MahilaVikasAghadi");
		ngo.setOrgType("Non-Profit");
		ngo.setNgo_address("BagalWaliGali");
		ngo.setNgo_phone(236541);
		ngo.setIncharge("Palekar");
		Assertions.assertTrue(ngoService.createNgo(ngo) instanceof Ngo);
		
		
		
	}
	
	@Test
	void testAddNgo() {
		
		Ngo ngo=new Ngo();
		ngo.setNgo_id(1);
		ngoRepo.save(ngo);
		Assertions.assertNotNull(ngoRepo.findById(1).get());
		
	}
	
	
	@Test
	public void testReadAllNgo() {
		List<Ngo> ngo_List = ngoRepo.findAll();
		Assertions.assertTrue(ngo_List.size() > 0);
	}
	
	
	@Test
	public void testUpdateNgo() {
		Ngo ngo = ngoRepo.findById(1).get();
		ngo.setNgo_name("MahilaVikas");
		ngoRepo.save(ngo);
		Assertions.assertNotEquals("welcome123", ngoRepo.findById(1).get().getNgo_name());
	}
	
	
	/*@Test
	public void testoneToManyTrainingCourse() {
		
		Ngo ngo = ngoRepo.findById(1).get();
		Collection<Training_course> tc_List = ngo.getTlist();
		Assertions.assertTrue(tc_List.size() > 1);
		
	}*/

	
	
	
	@Test
	public void testRegistrationService() {
		
		Registration registration =new Registration();
		registration.setR_id(1);
		registration.setName("Shane");
		registration.setEmail("imshane@gmail.com");
		registration.setAddress("Passmehi");
		registration.setDesignation("GET");
		registration.setFamily_income(45000);
		registration.setNo_of_member(4);
		registration.setNo_of_children(0);
		registration.setCourse("Java");
		registration.setCriteria("Age more than 16");
		registration.setAadhar_no("124587896523");
		registration.setPan_no("GHHUS4589K");
		Assertions.assertTrue(userRegistrationService.createRegistration(registration) instanceof Registration);
		
	}
	

	/*@Test
	void testAddRegistration() {
		
		Registration registration=new Registration();
		registration.setR_id(1);
		registration.setName("Newuser");
		registration.setEmail("imshane@gmail.com");
		registration.setAddress("Passmehi");
		registration.setDesignation("GET");
		registration.setFamily_income(45000);
		registration.setNo_of_member(4);
		registration.setNo_of_children(0);
		registration.setCourse("Java");
		registration.setCriteria("Age more than 16");
		registration.setAadhar_no("124587896523");
		registration.setPan_no("GHHUS4589K");
		regRepo.save(registration);
		Assertions.assertNotNull(regRepo.findById(1).get());
		
	}*/
	
	@Test
	public void testReadAllRegistration() {
		List<Registration> registration_List = regRepo.findAll();
		Assertions.assertTrue(registration_List.size() > 0);
	}
	
	/*@Test
	public void testUpdateRegistration() {
		Registration registration = new Registration();
		registration.setR_id(1);
		regRepo.save(registration);
		Assertions.assertNotEquals("welcome123", regRepo.findById(1).get().getR_id());
	}*/
	
	/*@Test
	public void testDeleteRegistration() {
		Registration registration = regRepo.findById(1).get();
		registration.setR_id(1);
		regRepo.delete(registration);
		Assertions.assertNotEquals("", regRepo.findById(1).get().getR_id());
		
	}*/
	
	
	@Test
	public void testTrainingCourseService() {
		Training_course training_course=new Training_course();
		training_course.setT_id(1);
		training_course.setCourse_name("Handloom");
		training_course.setNgo_name("MahilaVikashAghadii");
		training_course.setLocation("Pune");
		training_course.setDuration(29);
		training_course.setStart_date("01Sept2023");
		Assertions.assertTrue(trainingCourseService.createcourse(training_course) instanceof Training_course);
		
	}
	
	/*@Test
	void testaddTrainingCourse() {
		
		Training_course training_course=new Training_course();
		training_course.setT_id(2);
		training_course.setCourse_name("Python");
		training_course.setNgo_name("MahilaKiSeva");
		training_course.setLocation("Mumbai");
		training_course.setDuration(39);
		training_course.setStart_date("01May2023");
		tcRepo.save(training_course);
		Assertions.assertNotNull(tcRepo.findById(1).get());
		
	}*/
	
	
	@Test
	void testReadAllTraining_Course() {
		
		List<Training_course> tc_List = tcRepo.findAll();
		Assertions.assertTrue(tc_List.size() > 0);
	}
	
	
	/*@Test
	void testupdateTrainingCourse() {
		
		Training_course training_course=tcRepo.findById(1).get();
		training_course.setT_id(2);
		training_course.setCourse_name("Python");
		training_course.setNgo_name("MahilaKiSeva");
		training_course.setLocation("Mumbai");
		training_course.setDuration(39);
		training_course.setStart_date("01May2023");
		tcRepo.save(training_course);
		Assertions.assertNotEquals("welcome123", tcRepo.findById(1).get().getT_id());
		
	}*/
	
	/*@Test
	void testdeleteTrainingCourse() {
		
		Training_course training_course=tcRepo.findById(1).get();
		training_course.setT_id(1);
		tcRepo.delete(training_course);
		Assertions.assertNotEquals("", tcRepo.findById(1).get().getT_id());
		
	}*/

	
	
	
	
	
}
