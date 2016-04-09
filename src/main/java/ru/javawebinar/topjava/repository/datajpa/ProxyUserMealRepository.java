package ru.javawebinar.topjava.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional (readOnly = true)
public interface ProxyUserMealRepository extends JpaRepository {
}
