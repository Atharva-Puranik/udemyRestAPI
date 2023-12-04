package com.atharvapuranik.udemyrestapi.Course;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaTemplate {

    @PersistenceContext
    private EntityManager entityManager;

    public void insertUsingJpa(Course course){
        entityManager.merge(course);
    }

    public void deleteUsingJpa(int id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

    public Course getUsingJpa(int id){
        return entityManager.find(Course.class, id);
    }
}
