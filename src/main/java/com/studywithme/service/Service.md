StudentService.java

@Service
@Transaction
@AllArgsConstructor
public class StudentService{
private final StudentRepository studentRepository;


// GET /students/ I will get ALL Students


public List<Student> getAllStudent(){
    List<Student> myStudlist = studentRepository.findAll();
    
}

}