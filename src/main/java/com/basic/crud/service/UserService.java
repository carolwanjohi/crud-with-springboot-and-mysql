package com.basic.crud.service;

import com.basic.crud.model.User;

import java.util.List;

/**
 * This is a bridge between the controller and the actual business logic.
 * It decouples the controller from the actual business logic.
 * <p>
 * Methods defined here are implemented in the Impl layer.
 * This separation of concerns allows for a cleaner and more organised structure.
 */
public interface UserService {
    List<User> getAllEntities();
    User getEntityById(Long id);
    User createEntity(User entity);
    User updateEntity(Long id, User entity);
    void deleteEntity(Long id);
}
