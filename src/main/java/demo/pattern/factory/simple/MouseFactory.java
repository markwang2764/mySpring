package demo.pattern.factory.simple;

import demo.pattern.factory.entity.DellMouse;
import demo.pattern.factory.entity.HpMouse;
import demo.pattern.factory.entity.Mouse;

/**
 * @program: mySpringFramework
 * @description:
 * 简单工厂模式
 * 优点：可以对创建的对象进行加工，对客户隐藏相关细节
 * 缺点： 因创建逻辑复杂或创建对象过多而造成代码臃肿
 * 缺点： 新增、删除子类均会违反开闭原则
 * 开闭原则
 * 一个软件实体，应该对开展开放，对修改关闭
 * 应该通过扩展来实现变化，而不是通过修改已有的代码来实现变化
 * @author: Mr.markWang 2764
 * @create: 2023-11-17 13:36
 **/
public class MouseFactory {
    public static Mouse createMouse(int type) {
        switch (type) {
            case 0:
                return new DellMouse();
            case 1:
                return new HpMouse();
            default:
                return new DellMouse();
        }
    }

    public static void main(String[] args) {
        Mouse mouse = MouseFactory.createMouse(1);
        mouse.sayHi();
    }
}
