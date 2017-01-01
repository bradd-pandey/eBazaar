package waa.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import waa.project.domain.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, Login> {

}
