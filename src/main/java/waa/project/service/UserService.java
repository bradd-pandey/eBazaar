package waa.project.service;

import java.util.List;

import waa.project.domain.User;

public interface UserService {
	public void save(User user);
	public List<User> findAll();
	public User findOne(Long id);
	public User getUserByFirstName(String firstName);


}
