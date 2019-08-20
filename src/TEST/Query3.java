package TEST;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class Query3 {

    public static void main(String[] args) {
        Session session=util.HibernateSessionFactory.getSession();

        int age=14;
        String sql="select name,sex from Student where age<:age";
        Query query=session.createQuery(sql);
        query.setInteger("age",age);

        List list=query.list();
        for (int i = 0; i < list.size(); i++) {
            Object[] obj=(Object[])list.get(i);
            System.out.println(obj[0]+" "+obj[1]);
        }
        util.HibernateSessionFactory.closeSession();
    }
}
