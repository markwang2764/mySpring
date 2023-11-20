package demo.annotation;

/**
 * @program: mySpringFramework
 * @description:
 * @author: Mr.markWang 2764
 * @create: 2023-11-18 22:46
 **/
@CourseInfoAnnotation(courseName = "剑指java面试", courseTag = "面试", courseProfile = "fds")
public class JavaInterviewCourse {
    @PersonInfoAnnotation(name="mark", language = {"java","c++"})
    private String author;
    public void getCourseInfo() {
    }
}
