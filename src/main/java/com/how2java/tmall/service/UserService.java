package com.how2java.tmall.service;

import com.how2java.tmall.dao.UserDao;
import com.how2java.tmall.pojo.User;
import com.how2java.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public Page4Navigator<User> list(int start, int size, int navigatePages) {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        PageRequest pageable = PageRequest.of(start, size, sort);
        Page<User> pageFromJPA = userDao.findAll(pageable);
        return new Page4Navigator<>(pageFromJPA, navigatePages);
    }
}
