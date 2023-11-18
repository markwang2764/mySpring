package demo.reflect;

/**
 * @program: mySpringFramework
 * @description:
 * @author: Mr.markWang 2764
 * @create: 2023-11-17 18:03
 **/
public class ReflectTarget {
    public static void main(String[] args) throws ClassNotFoundException {
        ReflectTarget reflectTarget = new ReflectTarget();
        Class reflectTargetClass1 = reflectTarget.getClass();
        System.out.println(reflectTargetClass1.getName());
        Class reflectTargetClass2 = ReflectTarget.class;
        System.out.println(reflectTargetClass2.getName());
//        判断不同方式获取class 对象是否是同一个
        System.out.println(reflectTargetClass2 == reflectTargetClass1);
        Class reflectTargetClass3 = Class.forName("demo.reflect.ReflectTarget");
        System.out.println("3rd" + reflectTargetClass3.getName());
        System.out.println(reflectTargetClass2 == reflectTargetClass3);
    }
}
