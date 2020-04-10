package com.xuxueli.xxljobexecutorlewy95.task;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static com.xxl.job.core.biz.model.ReturnT.SUCCESS;

/**
 * 任务 Handler示例（Bean模式）
 * 开发步骤：
 * 1、继承 IJobHandler：com.xxl.job.core.handler.IJobHandler；
 * 2、注册到Spring容器：添加 @Component注解，被Spring容器扫描为Bean实例；
 * 3、注册到执行器工厂：添加 @XxlJob("自定义jobhandler名称")注解，
 *    注解value值对应的是调度中心新建任务的 JobHandler 属性的值。
 * 4、执行日志：XxlJobLogger.log打印执行日志；
 * 5、任务执行结果枚举：SUCCESS、FAIL、FAIL_TIMEOUT。
 */
@Slf4j
@Component
public class FirstJobHandler {

    @XxlJob("HelloWorld-Job")
    public ReturnT<String> firstXxlJob(String param) throws Exception{
        XxlJobLogger.log("XXL-JOB: Hello World.");

        for (int i = 0; i < 10; i++) {
            XxlJobLogger.log("The boy named {} is {}", param, i);
            Thread.sleep(2000);
        }
        return SUCCESS;
    }

}