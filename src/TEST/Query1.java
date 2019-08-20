package TEST;

import PO.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Query1 {
    public static void main(String[] args) {

        Session session=util.HibernateSessionFactory.getSession();
        Student student=new Student();
        session.load(student,"oushile2");
        System.out.println(student.getName());
        System.out.println(student.getSex());
        util.HibernateSessionFactory.closeSession();

    }
}
