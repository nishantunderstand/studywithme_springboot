@Entity
@Table(name="student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Student{

@Id
@GeneratedValue(strategy="GenerationType.IDENTITY")
@Column(name="student_id")
private Long id;


@Column(name="fnmae", nullable=false,unique=true,length=100)
private String fname;

@Column(name="lnmae", nullable=false,unique=true)
private String lname;

@Column(name="created_at",nullable=false)
private LocalDateTime created;

@Column(name="updated_at",nullable=false)
private LocalDateTime modified

}