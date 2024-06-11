package com.globalsoftwaresupport;

import java.lang.reflect.Constructor;

public class ReflctionAttack {
	public static void main(final String[] args) throws Exception {
        
		Constructor<DatabaseConnector> constructor = DatabaseConnector.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        DatabaseConnector dbconConnector = constructor.newInstance();
        System.out.println(dbconConnector);
        dbconConnector.connect();
        constructor.setAccessible(false);
    }   

}
