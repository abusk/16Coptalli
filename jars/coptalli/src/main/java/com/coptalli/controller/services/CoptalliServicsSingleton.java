package com.coptalli.services;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by abu on 30/4/17.
 */
public class CoptalliServicsSingleton extends Application{
    private Set<Object> singletons = new HashSet<>();

    public CoptalliServicsSingleton(){
        singletons.add(new CoptaliUserServices());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
