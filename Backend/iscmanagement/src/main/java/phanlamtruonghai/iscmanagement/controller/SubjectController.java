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
import phanlamtruonghai.iscmanagement.model.Subject;
import phanlamtruonghai.iscmanagement.repository.SubjectRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class SubjectController {
	@Autowired
	private SubjectRepository subjectRepository;

	@GetMapping("/subjects")
	public List<Subject> getAllSubjects() {
		return subjectRepository.findAll();
	}

	@GetMapping("/subjects/{id}")
	public ResponseEntity<Subject> getSubjectById(@PathVariable(value = "id") Long subjectId)
			throws ResourceNotFoundException {
		Subject subject = subjectRepository.findById(subjectId)
				.orElseThrow(() -> new ResourceNotFoundException("Subject not found for this id :: " + subjectId));
		return ResponseEntity.ok().body(subject);
	}

	@PostMapping("/subjects")
	public Subject createSubject(@Valid @RequestBody Subject subject) {
		return subjectRepository.save(subject);
	}

	@PutMapping("/subjects/{id}")
	public ResponseEntity<Subject> updateSubject(@PathVariable(value = "id") Long subjectId,
			@Valid @RequestBody Subject subjectDetails) throws ResourceNotFoundException {
		Subject subject = subjectRepository.findById(subjectId)
				.orElseThrow(() -> new ResourceNotFoundException("Subject not found for this id :: " + subjectId));

        subject.setSubCode(subjectDetails.getSubCode());
		subject.setSubName(subjectDetails.getSubName());
		subject.setSubScorepass(subjectDetails.getSubScorepass());
		subject.setSubTime(subjectDetails.getSubTime());
		final Subject updatedSubject = subjectRepository.save(subject);
		return ResponseEntity.ok(updatedSubject);
	}

	@DeleteMapping("/subjects/{id}")
	public Map<String, Boolean> deleteSubject(@PathVariable(value = "id") Long subjectId)
			throws ResourceNotFoundException {
		Subject subject = subjectRepository.findById(subjectId)
				.orElseThrow(() -> new ResourceNotFoundException("Subject not found for this id :: " + subjectId));

		subjectRepository.delete(subject);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
