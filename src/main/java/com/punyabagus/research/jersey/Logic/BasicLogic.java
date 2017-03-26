package com.punyabagus.research.jersey.Logic;

import com.punyabagus.research.Documents.Document;
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
        Document.Builder document = Document.newBuilder();
        return basicDAO.getString();
    }
}
