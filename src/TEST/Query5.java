package TEST;

import PO.Student;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import java.util.List;

public class Query5 {

    public static void main(String[] args) {
        Session session=util.HibernateSessionFactory.getSession();

        SQLQuery sqlQuery=session.createSQLQuery("select * from user");
        sqlQuery.addEntity(Student.class);
        List list=sqlQuery.list();
        for (int i = 0; i < list.size(); i++) {
            Student student=(Student)list.get(i);
            System.out.println(student.getAccount());
        }
        util.HibernateSessionFactory.closeSession();
    }
}
