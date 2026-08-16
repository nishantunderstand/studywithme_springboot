



@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
    Optional<Student> findByEmail(Student email);
    boolean existsByEmail(Student email);
}