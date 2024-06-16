package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01 {
    public static void main(String[] arg)
    {

        try ( var context = new AnnotationConfigApplicationContext(AppConfigration.class)){

            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("address"));
            System.out.println(context.getBean("person1"));
            System.out.println(context.getBean("person2"));

        }



    }

}
