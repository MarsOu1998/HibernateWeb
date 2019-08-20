package TEST;

import PO.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class Query4 {
    public static void main(String[] args) {
        Session session=util.HibernateSessionFactory.getSession();
        Criteria criteria=session.createCriteria(Student.class);
        criteria.add(Restrictions.le("age",18));
        criteria.setFirstResult(1);//从第一条开始显示
        criteria.setMaxResults(3);//显示3条记录

        List list=criteria.list();

        for (int i = 0; i < list.size(); i++) {
            Student student=(Student)list.get(i);
            System.out.println(student.getName()+" "+student.getSex());
        }

        util.HibernateSessionFactory.closeSession();
    }
}
