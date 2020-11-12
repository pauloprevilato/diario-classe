package br.imed.interceptor;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;

public class TransactionInterceptor implements Interceptor {

	private SessionFactory sessionFactory;
	
	@Override
	public void intercept(InterceptorStack stack, ControllerMethod method,
			Object controllerInstance) throws InterceptionException {
		
//		Transaction transaction = sessionFactory.getCurrentSession().getTransaction();
//		if (transaction.isActive())
//			return invocation.proceed();
//
//		try {
//			transaction.begin();
//			Object returnValue = invocation.proceed();
//			transaction.commit();
//			return returnValue;
//		} catch (Throwable e) {
//			transaction.rollback();
//			throw e;
//		}
		
	}

	@Override
	public boolean accepts(ControllerMethod method) {
		// TODO Auto-generated method stub
		return false;
	}  
  
}  