package birzubir.spring.creational.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = PrototypeApplication.class)
public class PrototypeApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testPrototype(){
        Employee zubir = applicationContext.getBean("employeeManager", Employee.class);
        zubir.setName("Zubir");

        Employee riki = applicationContext.getBean("employeeStaff", Employee.class);
        riki.setName("Riki");

        Employee sayed = applicationContext.getBean("employeeStaff", Employee.class);
        sayed.setName("Sayed");

        Employee faudan = applicationContext.getBean("employeeManager", Employee.class);
        faudan.setName("Faudan");

        System.out.println(zubir);
        System.out.println(riki);
        System.out.println(sayed);
        System.out.println(faudan);
    }
}
