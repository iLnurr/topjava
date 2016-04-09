package ru.javawebinar.topjava.repository.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.javawebinar.topjava.model.User;
import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.repository.UserMealRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;
import java.util.List;

/**
 * GKislin
 * 27.03.2015.
 */
@Repository
public class DataJpaUserMealRepositoryImpl implements UserMealRepository{

    @Autowired
    ProxyUserMealRepository proxy;

    @PersistenceContext
    private EntityManager em;

    @Override
    public UserMeal save(UserMeal userMeal, int userId) {
        User ref = em.getReference(User.class, userId);
        userMeal.setUser(ref);
        return proxy.save(userMeal);
    }

    @Override
    public boolean delete(int id, int userId) {
        return false;
    }

    @Override
    public UserMeal get(int id, int userId) {
        return null;
    }

    @Override
    public List<UserMeal> getAll(int userId) {
        return null;
    }

    @Override
    public List<UserMeal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId) {
        return null;
    }
}
