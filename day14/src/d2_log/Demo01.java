package d2_log;

//目标：掌握在项目中导入Logback日志技术并使用

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 需求：利用logback日志技术，将日志信息打印在控制台
 * Logback日志技术导入步骤：
 *      1.将资料中lib目录下的logback相关jar包复制到模块中，并add as library 添加为模块依赖
 *      2.创建Logback框架提供的Logger对象，然后用Logger对象调用其提供的方法就可以记录运行的日志信息了
 *          Logger log=loggerFactory.getLogger(类.class);
 *          Log.info("main方法开始执行");
 */
public class Demo01 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Demo01.class);
        logger.info("asfasfa");
    }
}
