package waa.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import waa.project.domain.Category;
import waa.project.repository.CategoryRepository;
import waa.project.service.CategoryService;
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> getAllCategory() {
		
		return (List<Category>) categoryRepository.findAll() ;
	}

	

}
