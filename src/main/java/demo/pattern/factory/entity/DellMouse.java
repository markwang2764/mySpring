package demo.pattern.factory.entity;

/**
 * @program: mySpringFramework
 * @description:
 * @author: Mr.markWang 2764
 * @create: 2023-11-17 13:34
 **/
public class DellMouse implements Mouse{

    @Override
    public void sayHi() {
        System.out.println("我是戴尔鼠标");
    }
}
