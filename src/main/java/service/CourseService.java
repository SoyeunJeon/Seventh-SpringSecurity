package service;

import model.Course;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 전소연 on 11/16/2017.
 */
@Configuration
public class CourseService {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void saveCourse(Course course){
        sessionFactory.getCurrentSession().save(course);
    }

    @Transactional
    public Course getCourse(int id){
        Query query = sessionFactory.getCurrentSession().createQuery("from Course where id:id");
        query.setInteger("id", id);

        return (Course) query.uniqueResult();

    }

    @Transactional
    public List<Course> getAllCourses(){
        Query query = sessionFactory.getCurrentSession().createQuery("from Course");
        return query.list();

    }

}
