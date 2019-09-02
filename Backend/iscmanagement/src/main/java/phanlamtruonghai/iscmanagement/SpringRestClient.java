package phanlamtruonghai.iscmanagement;

//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//
//import phanlamtruonghai.iscmanagement.SpringRestClient;
//import phanlamtruonghai.iscmanagement.model.Student;

public class SpringRestClient {

//	private static final String GET_STUDENTS_ENDPOINT_URL = "http://localhost:8080/api/v1/students";
//	private static final String GET_STUDENT_ENDPOINT_URL = "http://localhost:8080/api/v1/students/{id}";
//	private static final String CREATE_STUDENT_ENDPOINT_URL = "http://localhost:8080/api/v1/students";
//	private static final String UPDATE_STUDENT_ENDPOINT_URL = "http://localhost:8080/api/v1/students/{id}";
//	private static final String DELETE_STUDENT_ENDPOINT_URL = "http://localhost:8080/api/v1/students/{id}";
//	private static RestTemplate restTemplate = new RestTemplate();
//
//	public static void main(String[] args) {
//		SpringRestClient springRestClient = new SpringRestClient();
//		
//		// Step1: first create a new student
//		springRestClient.createStudent();
//		
//		// Step 2: get new created student from step1
//		springRestClient.getStudentById();
//		
//		// Step3: get all students
//		springRestClient.getStudents();
//		
//		// Step4: Update student with id = 1
//		springRestClient.updateStudent();
//		
//		// Step5: Delete student with id = 1
//		springRestClient.deleteStudent();
//	}
//
//	private void getStudents() {
//
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
//
//		ResponseEntity<String> result = restTemplate.exchange(GET_STUDENTS_ENDPOINT_URL, HttpMethod.GET, entity,
//				String.class);
//
//		System.out.println(result);
//	}
//
//	private void getStudentById() {
//
//		Map<String, String> params = new HashMap<String, String>();
//		params.put("id", "1");
//
//		RestTemplate restTemplate = new RestTemplate();
//		Student result = restTemplate.getForObject(GET_STUDENT_ENDPOINT_URL, Student.class, params);
//
//		System.out.println(result);
//	}
//
//	private void createStudent() {
//
//		Student newStudent = new Student("admin", "admin", "admin@gmail.com", 0, null, null);
//
//		RestTemplate restTemplate = new RestTemplate();
//		Student result = restTemplate.postForObject(CREATE_STUDENT_ENDPOINT_URL, newStudent, Student.class);
//
//		System.out.println(result);
//	}
//
//	private void updateStudent() {
//		Map<String, String> params = new HashMap<String, String>();
//		params.put("id", "1");
//		Student updatedStudent = new Student("admin123", "admin123", "admin123@gmail.com", 0, null, null);
//		RestTemplate restTemplate = new RestTemplate();
//		restTemplate.put(UPDATE_STUDENT_ENDPOINT_URL, updatedStudent, params);
//	}
//
//	private void deleteStudent() {
//		Map<String, String> params = new HashMap<String, String>();
//		params.put("id", "1");
//		RestTemplate restTemplate = new RestTemplate();
//		restTemplate.delete(DELETE_STUDENT_ENDPOINT_URL, params);
//	}
}