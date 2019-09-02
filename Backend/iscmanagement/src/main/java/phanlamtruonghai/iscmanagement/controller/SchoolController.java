package phanlamtruonghai.iscmanagement.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import phanlamtruonghai.iscmanagement.exception.ResourceNotFoundException;
import phanlamtruonghai.iscmanagement.model.School;
import phanlamtruonghai.iscmanagement.repository.SchoolRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class SchoolController {
	@Autowired
	private SchoolRepository schoolRepository;

	@GetMapping("/schools")
	public List<School> getAllSchools() {
		return schoolRepository.findAll();
	}

	@GetMapping("/schools/{id}")
	public ResponseEntity<School> getSchoolById(@PathVariable(value = "id") Long schoolId)
			throws ResourceNotFoundException {
		School school = schoolRepository.findById(schoolId)
				.orElseThrow(() -> new ResourceNotFoundException("Student not found for this id :: " + schoolId));
		return ResponseEntity.ok().body(school);
	}

	@PostMapping("/schools")
	public School createSchool(@Valid @RequestBody School school) {
		return schoolRepository.save(school);
	}

	@PutMapping("/schools/{id}")
	public ResponseEntity<School> updateSchool(@PathVariable(value = "id") Long schoolId,
			@Valid @RequestBody School schoolDetails) throws ResourceNotFoundException {
		School school = schoolRepository.findById(schoolId)
				.orElseThrow(() -> new ResourceNotFoundException("School not found for this id :: " + schoolId));

		school.setSchCode(schoolDetails.getSchCode());
		school.setSchName(schoolDetails.getSchName());
		school.setSchAddress(schoolDetails.getSchAddress());
		school.setSchContact(schoolDetails.getSchContact());
		final School updatedSchool = schoolRepository.save(school);
		return ResponseEntity.ok(updatedSchool);
	}

	@DeleteMapping("/schools/{id}")
	public Map<String, Boolean> deleteSchool(@PathVariable(value = "id") Long schoolId)
			throws ResourceNotFoundException {
		School school = schoolRepository.findById(schoolId)
				.orElseThrow(() -> new ResourceNotFoundException("School not found for this id :: " + schoolId));

		schoolRepository.delete(school);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
