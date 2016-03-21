package com.afbdev.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.afbdev.model.User;

/**
 * A data access object (DAO) providing persistence and search support for User
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.afbdev.dao.User
 * @author MyEclipse Persistence Tools
 */
public class UserDAOImpl implements UserDAO {
	private static final Logger log = LoggerFactory.getLogger(UserDAOImpl.class);
	private SessionFactory sessionFactory;
	 
    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public void create(User user) {
		log.debug("saving User instance");
		try {
			sessionFactory.getCurrentSession().save(user);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

    @Override
    @Transactional
    public void update(User user) {
		log.debug("saving User instance");
		try {
			sessionFactory.getCurrentSession().update(user);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

    @Override
    @Transactional
	public void delete(User user) {
		log.debug("deleting User instance");
		try {
			sessionFactory.getCurrentSession().delete(user);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

    @Override
    @Transactional
	public User findById(Integer id) {
		log.debug("getting User instance with id: " + id);
		try {
			User instance = (User) sessionFactory.getCurrentSession().get(User.class, id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

    @Override
    @Transactional
    @SuppressWarnings("unchecked")
	public List<User> findByProperty(String propertyName, Object value) {
		log.debug("finding User instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from User as model where model."
					+ propertyName + "= ?";
			Query queryObject = sessionFactory.getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

    @Override
    @Transactional
    @SuppressWarnings("unchecked")
	public List<User> findAll() {
        
		log.debug("finding all User instances");
		try {
			String queryString = "from User";
			Query queryObject = sessionFactory.getCurrentSession().createQuery(queryString);

			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

}