package waa.project.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import waa.project.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{
	
	@Query("select u from USER u where u.firstName = :firstName")
	User findUserByFirstName(@Param("firstName")String firstName);

}
