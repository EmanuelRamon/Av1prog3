/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.intercepts;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import controllers.AuthController;
import javax.inject.Inject;
import web.annotations.Auth;
import web.components.AuthSession;

/**
 *
 * @author Lucas
 */
@Intercepts
public class AuthIntercepts implements Interceptor {
    
    @Inject
    private Result result;
    
    @Inject
    private AuthSession authSession;

    @Override
    public void intercept(InterceptorStack is, ControllerMethod cm, Object o) throws InterceptionException {
        if(authSession.getUser() == null){
            result.redirectTo(AuthController.class).login();
        }        
        is.next(cm, o);
    }

    @Override
    public boolean accepts(ControllerMethod cm) {
        return cm.containsAnnotation(Auth.class) || 
                cm.getController().getType().isAnnotationPresent(Auth.class);
    }
    
}
