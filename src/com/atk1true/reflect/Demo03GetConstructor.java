package com.atk1true.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/**
 * Reflect的各种方法使用
 * getConstructors，获取所有public构造方法
 * -----------------------------------
 * 类名.class 获取类
 * -----------------------------------
 * getConstructor(Class<?>... parameterTypes)->获取指定的public的构造
 * parameterTypes:可变参数,可以传递0个或者多个参数
 * a.如果获取的是空参构造:参数不用写
 * b.如果获取的是有参构造:参数写参数类型的class对象
 * -----------------------------------
 * Method[] getMethods() -> 获取所有public的方法,包括父类中的public方法
 * -----------------------------------
 * 1.Class类中的方法:
 *   Method getMethod(String name, Class<?>... parameterTypes) 获取指定的public的成员方法
 *                    name:传递方法名
 *                    parameterTypes:方法参数类型的class对象
 * -----------------------------------
 * 2.调用方法:Method对象中的方法:
 *   Object invoke(Object obj, Object... args)  -> 执行方法
 *                 obj:根据构造new出来的对象
 *                 args:方法实参 -> 如果有参数,直接传递实参;否则不用传
 *                 返回值:Object -> 接收被执行方法的返回值,如果方法没有返回值,不用接收了
 * -----------------------------------
 * 1.Method[] getDeclaredMethods()   -> 获取所有的成员方法,包括private 的
 * 2.Method getDeclaredMethod(String name, 类<?>... parameterTypes)-> 获取执行成员方法,包括private
 *                        name:传递方法名
 *                        parameterTypes:方法参数类型的class对象
 * 3.解除私有权限:void setAccessible(boolean flag)
 * ---------------
 * Class类中的方法:
 * 1.Field[] getFields() -> 获取所有public的属性
 * 2.Field[] getDeclaredFields()  -> 获取所有属性,包括priavte的
 * ---------------
 * Class类中的方法:
 * ---------------
 * 1.Field getField(String name) -> 获取指定public的属性
 * 2.Field getDeclaredField(String name)  -> 获取指定属性,包括priavte的
 * ---------------
 * 3.Field类中的方法:
 *   void set(Object obj,Object value) -> 为属性赋值,相当于javabean中的set方法
 *            obj:对象
 *            value:赋予的值
 * ---------------
 *   Object get(Object obj) -> 获取属性值
 *          obj:对象
 */
public class Demo03GetConstructor {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("constructor = " + constructor);
        }
        Constructor<Person> constructor = personClass.getConstructor();
        System.out.println("constructor = " + constructor);
        Person person = constructor.newInstance();
        System.out.println("person = " + person);
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();//获取所有构造方法，包括私有构造方法
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("declaredConstructor = " + declaredConstructor);
        }
    }
}
