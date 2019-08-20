package TEST;

import PO.Student;
import org.hibernate.Session;

import org.hibernate.query.Query;

import java.util.List;

public class Query2 {
    public static void main(String[] args) {
        Session session=util.HibernateSessionFactory.getSession();
        String sql="from Student where age<18";
        Query query=session.createQuery(sql);
        List list=query.list();
        for (int i = 0; i <list.size() ; i++) {
            Student student=(Student)list.get(i);
            System.out.println(student.getName()+" "+student.getSex());
        }
        util.HibernateSessionFactory.closeSession();
    }
}
