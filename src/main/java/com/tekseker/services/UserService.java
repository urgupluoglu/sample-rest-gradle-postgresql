package com.tekseker.services;

import com.tekseker.models.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class UserService {

    @PersistenceContext
    EntityManager em;

    public List<User> getAll() {
        TypedQuery<User> query = em.createQuery("select u from users u", User.class);
        return query.getResultList();
    }
}
