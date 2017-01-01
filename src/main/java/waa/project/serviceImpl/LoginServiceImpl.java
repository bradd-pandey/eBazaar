package waa.project.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waa.project.domain.Login;
import waa.project.repository.LoginRepository;
import waa.project.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	LoginRepository loginRepository;

	@Override
	public void save(Login login) {
		// TODO Auto-generated method stub
		loginRepository.save(login);
		
	}

}
