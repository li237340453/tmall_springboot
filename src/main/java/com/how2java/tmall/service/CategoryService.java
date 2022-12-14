package com.how2java.tmall.service;

import com.how2java.tmall.dao.CategoryDAO;
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.util.Page4Navigator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {


    private Logger logger = Logger.getLogger(CategoryService.class);
    @Autowired
    CategoryDAO categoryDAO;


    public Page4Navigator<Category> list(int start, int size, int navigatePages) {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        PageRequest pageable = PageRequest.of(start, size, sort);
        Page pageFromJPA = categoryDAO.findAll(pageable);

        return new Page4Navigator<>(pageFromJPA, navigatePages);
    }

    public List<Category> list() {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        return categoryDAO.findAll(sort);
    }

    public void add(Category bean) {
        categoryDAO.save(bean);
    }

    public void delete(int id) {
        categoryDAO.deleteById(id);
    }

    public Category get(int id) {
        Category c = categoryDAO.getReferenceById(id);
        return c;
    }

    public void update(Category bean) {
        categoryDAO.save(bean);
    }
}
