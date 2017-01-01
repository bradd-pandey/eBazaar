package waa.project.service;

import org.springframework.stereotype.Service;

import waa.project.domain.Login;
import waa.project.domain.User;
@Service
public interface LoginService {
	

	public void save(Login login);

}
