package ru.javawebinar.topjava.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.javawebinar.topjava.model.UserMeal;

@Transactional (readOnly = true)
public interface ProxyUserMealRepository extends JpaRepository<UserMeal, Integer> {

    @Override
    @Transactional
    UserMeal save(UserMeal userMeal);

    @Transactional
    @Modifying
    @Query("DELETE FROM UserMeal m WHERE m.id=:id AND m.user.id=:userId")
    int delete(@Param("id") int id, @Param("userId") int userId);

}
