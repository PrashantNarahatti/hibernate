package corejava;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
     @SuppressWarnings("deprecation")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//Test test=new Test();
    	 //test.show();
    	 String s="Hello";
		Class c=Class.forName("corejava.Test");
		Class[] parms=new Class[2];
		parms[0]=String.class;
		parms[1]=int.class;
		Test test=(Test)c.newInstance();
		
		Method method=c.getDeclaredMethod("show", parms);
		method.setAccessible(true);
		method.invoke(test,"hello",3);
	}

}
