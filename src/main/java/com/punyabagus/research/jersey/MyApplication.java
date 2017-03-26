package com.punyabagus.research.jersey;

import com.punyabagus.research.jersey.Services.AuthenticationFilter;
import org.glassfish.jersey.server.ResourceConfig;


/**
 * Created by Bagus Prasojo on 3/18/2017.
 */
public class MyApplication extends ResourceConfig {
    public MyApplication() {
        register(new MyApplicationBinder());
        register(AuthenticationFilter.class);
        packages(true, "com.punyabagus.research.jersey.Services");
    }
}
