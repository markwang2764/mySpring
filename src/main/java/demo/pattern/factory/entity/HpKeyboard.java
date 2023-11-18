package demo.pattern.factory.entity;

/**
 * @program: mySpringFramework
 * @description:
 * @author: Mr.markWang 2764
 * @create: 2023-11-17 14:08
 **/
public class HpKeyboard implements Keyboard {
    @Override
    public void sayHello() {
        System.out.println("我是hp键盘");
    }
}
