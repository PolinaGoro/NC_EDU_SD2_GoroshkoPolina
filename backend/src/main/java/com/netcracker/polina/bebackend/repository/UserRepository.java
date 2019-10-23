package com.netcracker.polina.bebackend.repository;

import com.netcracker.polina.bebackend.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class UserRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public List<User> getAll() {
        Session session = sessionFactory.openSession();
        CriteriaQuery<User> criteriaQuery = session.getCriteriaBuilder()
                .createQuery(User.class);
        return session.createQuery(criteriaQuery).list();
    }
}

