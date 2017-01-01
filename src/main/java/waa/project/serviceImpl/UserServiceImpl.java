package waa.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import waa.project.domain.User;
import waa.project.repository.UserRepository;
import waa.project.service.UserService;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

	

	@Override
	public User getUserByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return userRepository.findUserByFirstName(firstName);
	}

}
