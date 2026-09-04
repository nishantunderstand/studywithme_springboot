StudentEntity.java


@Entity
@Table(name="students")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Student{

@Id 
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

@Column(name="fullName")
private String name;

@Column(name="first_name" , nullable = true, unique= true)
private String fname;


private LocalDateTime createdDate;
private LocalDateTime modifiedDate;
}