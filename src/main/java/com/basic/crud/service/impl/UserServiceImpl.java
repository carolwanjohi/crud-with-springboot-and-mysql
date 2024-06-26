package com.basic.crud.service.impl;

import java.util.List;

import com.basic.crud.model.User;
import com.basic.crud.repository.UserRepository;
import com.basic.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This handles the core business logic, such as
 * - retrieving data from the database
 * - performing necessary calculations
 * - managing data modifications
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    // What does this annotation do?
    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    // How can I paginate this?
    public List<User> getAllEntities() {
        return repository.findAll();
    }

    @Override
    public User getEntityById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public User createEntity(User entity) {
        return repository.save(entity);
    }

    @Override
    public User updateEntity(Long id, User entity) {
        if (repository.existsById(id)) {
            entity.setId(id);
            return repository.save(entity);
        }
        return null;
    }

    @Override
    public void deleteEntity(Long id) {
        repository.deleteById(id);
    }
}
