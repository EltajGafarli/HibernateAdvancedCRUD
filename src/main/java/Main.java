import entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

    private static final SessionFactory sessionFactory = new Configuration()
            .addProperties(DBProperties.getProperties())
            .addAnnotatedClass(Student.class)
            .addAnnotatedClass(StudentDetails.class)
            .addAnnotatedClass(Instructor.class)
            .addAnnotatedClass(InstructorDetails.class)
            .addAnnotatedClass(Courses.class)
            .addAnnotatedClass(Reviews.class)
            .buildSessionFactory();



    public static void main(String[] args) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            session.getTransaction().commit();
        }finally {
//            session.close();
            sessionFactory.close();
        }
    }
}
