@GetMapping
public List<StudentResponse> getAllStudents(){

studentRepository.findAll()
.stream()
.map(
	student -> {
		StudentResponse response = new StudentResponse();
		response.setId(student.getId());
		response.setFirstName(student.getFirstName());
		response.setLastName(student.getLastName());
		response.setCreatedDate(student.getCreatedDate());
		response.setModifiedDate(student.getModifiedDate());
	
		return response;
	}
).toList();

}