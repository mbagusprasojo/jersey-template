package com.punyabagus.research.jersey;

import com.punyabagus.research.jersey.DAO.BasicDAO;
import com.punyabagus.research.jersey.DAO.BasicDAOImplement;
import com.punyabagus.research.jersey.Logic.BasicLogic;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

/**
 * Created by Bagus Prasojo on 3/18/2017.
 */
public class MyApplicationBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(BasicDAOImplement.class).to(BasicDAO.class);
        bind(BasicLogic.class).to(BasicLogic.class);
    }
}
