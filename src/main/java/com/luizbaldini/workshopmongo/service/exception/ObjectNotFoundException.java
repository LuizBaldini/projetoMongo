package com.luizbaldini.workshopmongo.service.exception;

import java.sql.SQLException;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
