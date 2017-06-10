/**
 * @author xuxc
 * @since 2017年6月7日 上午9:10:58
 */
package yagu.xuxc;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xuxc
 * @since 2017年6月7日 上午9:10:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseJunit {

    /**
     * 生成一个全局的上下文环境
     */
    private ClassPathXmlApplicationContext context;
    
    /**
     * 测试运行前 实例化上下文环境
     * @author xuxc
     * @since 2017年6月7日 上午9:21:44
     */
    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext();
    }
}
