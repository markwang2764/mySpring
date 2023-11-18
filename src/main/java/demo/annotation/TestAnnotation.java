package demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: mySpringFramework
 * @description:
 * @author: Mr.markWang 2764
 * @create: 2023-11-18 21:23
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface TestAnnotation {
}
