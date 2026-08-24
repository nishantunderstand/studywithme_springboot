
Whynot implemnts
@Reposistory
public interface StudentReposistory extends JpaReposistory<Student,Long>{

    Optional<Student> findByEmail(String email);
    boolean existsByEmail(String email);

}