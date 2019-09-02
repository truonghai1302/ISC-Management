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
import phanlamtruonghai.iscmanagement.repository.MajorRepository;
import phanlamtruonghai.iscmanagement.model.Major;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class MajorController {
	@Autowired
	private MajorRepository majorRepository;

	@GetMapping("/majors")
	public List<Major> getAllMajors() {
		return majorRepository.findAll();
	}

	@GetMapping("/majors/{id}")
	public ResponseEntity<Major> getMajorById(@PathVariable(value = "id") Long majorId)
			throws ResourceNotFoundException {
		Major Major = majorRepository.findById(majorId)
				.orElseThrow(() -> new ResourceNotFoundException("Major not found for this id :: " + majorId));
		return ResponseEntity.ok().body(Major);
	}

	@PostMapping("/majors")
	public Major createMajor(@Valid @RequestBody Major major) {
		return majorRepository.save(major);
	}

	@PutMapping("/majors/{id}")
	public ResponseEntity<Major> updateMajor(@PathVariable(value = "id") Long majorId,
			@Valid @RequestBody Major majorDetails) throws ResourceNotFoundException {
		Major major = majorRepository.findById(majorId)
				.orElseThrow(() -> new ResourceNotFoundException("Major not found for this id :: " + majorId));

		major.setMjName(majorDetails.getMjName());
		final Major updatedMajor = majorRepository.save(major);
		return ResponseEntity.ok(updatedMajor);
	}

	@DeleteMapping("/majors/{id}")
	public Map<String, Boolean> deleteMajor(@PathVariable(value = "id") Long majorId)
			throws ResourceNotFoundException {
		Major major = majorRepository.findById(majorId)
				.orElseThrow(() -> new ResourceNotFoundException("Major not found for this id :: " + majorId));

		majorRepository.delete(major);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
