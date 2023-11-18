package demo.pattern.factory.entity;

import java.security.Key;

/**
 * @program: mySpringFramework
 * @description:
 * @author: Mr.markWang 2764
 * @create: 2023-11-17 14:08
 **/
public class DellKeyboard implements Keyboard {
    @Override
    public void sayHello() {
        System.out.println("我是戴尔键盘");
    }
}
