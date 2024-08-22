package vn.devpro.javaweb27.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import net.bytebuddy.implementation.bind.annotation.Super;
import vn.devpro.javaweb27.model.Category;

@Service
public class CategoryService extends BaseService<Category> {
	@Override
	public Class<Category> clazz() {
		return Category.class;
	}
	public List<Category> findAllActive(){
		return super.executeNativeSql("SELECT * FROM tbl_Category WHERE status=1");
	}

	
	@Transactional
	public void deleteCategoryById(int id) {
		super.deleteById(id);
	}
	@Transactional
	public void inactiveCategory(Category category) {
		super.saveOrUpdate(category);
	}
}
