package s1_junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * 需求：定义单元测试类，测试UserService中的方法
 * 测试方法注意点：
 *      1、必须是公开的，无参数 无返回值的方法
 *      2、测试方法必须使用@Test注解标记。
 * 预期结果的正确性测试：断言
 *      Assert.assertEquals(错误的标识消息, 预期结果, 实际结果);
 * Junit5.xxxx版本常用注解：
 *      @BeforeEach：用来修饰实例方法，该方法会在每一个测试方法执行之前执行一次
 *      @AfterEach：用来修饰实例方法，该方法会在每一个测试方法执行之后执行一次
 *      @BeforeClass：用来静态修饰方法，该方法会在所有测试方法之前只执行一次
 *      @AfterClass：用来静态修饰方法，该方法会在所有测试方法之后只执行一次
 */
public class UserManagerTest {

    @Test
    public void loginTest(){
        UserManager um = new UserManager();
        boolean flag = um.login("admin","123");
        Assert.assertEquals(true,flag);//断言
    }

}
