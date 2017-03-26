package com.punyabagus.research.jersey.Logic;

import com.punyabagus.research.jersey.DAO.BasicDAO;

import javax.inject.Inject;

/**
 * Created by Bagus Prasojo on 3/18/2017.
 */
public class BasicLogic {
    public BasicDAO basicDAO;

    @Inject
    public BasicLogic(BasicDAO basicDAO) {
        this.basicDAO = basicDAO;
    }

    public String getString() {
        return basicDAO.getString();
    }
}
