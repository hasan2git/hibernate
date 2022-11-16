package com.javasetup.tutorials.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.javasetup.tutorials.hibernate.entities.Student;
import com.javasetup.tutorials.hibernate.entities.StudentName;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       StudentName name=new StudentName();
       name.setFname("Hasanath");
       name.setLname("Hossain");
       name.setSname("Molla");
       Student st=new Student();
       st.setId(1010);
       st.setName(name);
       st.setDressColor("Blue");
       st.setAge(22);
       System.out.println("Inside....Hibenate app main");
       System.out.println("Inside....new message");
       System.out.println("Inside....Added another message");
       //Configuration config=new Configuration().configure().addAnnotatedClass(Student.class);
//       Configuration configuration = new Configuration();
//       configuration.addAnnotatedClass(Student.class);
       
       ServiceRegistry sr=new StandardServiceRegistryBuilder().configure().build();
       MetadataSources metaS=new MetadataSources(sr);
       Metadata meta=metaS.getMetadataBuilder().build();
       
       SessionFactory sf=meta.getSessionFactoryBuilder().build();
       Session session=sf.openSession();
       
       Transaction tx=session.beginTransaction();
       
       session.save(st); 
       
       Student s=session.get(Student.class, 1010);
       System.out.println(s);
       
       tx.commit();
    }
}
