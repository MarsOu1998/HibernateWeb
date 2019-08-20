package TEST;

import PO.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update1 {
    public static void main(String[] args) {

        Session session=util.HibernateSessionFactory.getSession();
        Student student=new Student();
        session.load(student,"oushile2");

        student.setSex("男");
        Transaction transaction=session.beginTransaction();
        try{
            session.update(student);
            transaction.commit();

        }catch (Exception e){
           transaction.rollback();
        }finally {
            util.HibernateSessionFactory.closeSession();
        }

    }
}
