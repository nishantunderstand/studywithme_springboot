@Data

@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class StudentRequestDTO
private String fname;
private String lname;
private int rollNo;
privat double marks;


public class StudentResponseDTO
@NotNull
@Required
private String fname;
@NotNull
private String lname;
@
private int rollNo;
private double marks;
private boolean isAbsent;