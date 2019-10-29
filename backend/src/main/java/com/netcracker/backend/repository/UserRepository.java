package com.netcracker.backend.repository;

import com.netcracker.backend.entity.UserProfile;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<UserProfile> getAll() {
        CriteriaQuery<UserProfile> criteria = entityManager.getCriteriaBuilder().createQuery(UserProfile.class);
        TypedQuery<UserProfile> query = entityManager.createQuery(criteria);
        return query.getResultList();
    }

    public void insert(UserProfile user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }
}

