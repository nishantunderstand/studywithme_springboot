@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Student{

@Id
@GenertatedValue(strategy=GenerationType.IDENTITY)
@Column(name="student_id")
private Long id;


@Column(name="firstName", nullable=true,unique=true,length=150)
private String fname;

@Column(name="lastName)
private String lname;

}
---
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)