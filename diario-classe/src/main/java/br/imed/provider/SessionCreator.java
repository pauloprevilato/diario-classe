package br.imed.provider;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

@RequestScoped
public class SessionCreator {

//    @Inject
//    private SessionFactory sessionFactory;
//
//    @Produces
//    @RequestScoped
//    public Session getSession() {
//        return sessionFactory.openSession();
//    }
//
//    public void close(@Disposes Session session) {
//        if (session.isOpen()) {
//            session.close();
//        }
//    }
}
