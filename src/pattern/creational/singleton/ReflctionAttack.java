package pattern.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflctionAttack {
	public static void main(final String[] args) throws Exception {
        
		Constructor<BillPughSingleton> constructor = BillPughSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        BillPughSingleton obj = constructor.newInstance();
        System.out.println(obj);
        obj.display();
//        constructor.setAccessible(false);
    }   

}
