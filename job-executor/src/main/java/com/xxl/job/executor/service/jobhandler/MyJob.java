package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class MyJob {
    private static Logger logger = LoggerFactory.getLogger(MyJob.class);

    /**
     * demo
     */
    @XxlJob("demoJob")
    public ReturnT<String> demoJob(String param) throws Exception {
        // XxlJobLogger.log 在程序运行时候只在可视化页面里的日志显示并不在控制台显示
        XxlJobLogger.log("job begin...");
        // 因为在可视化页面当中执行器运行结果是由 returnT.code 来决定的,所以可以自己生成一个对象根据业务逻辑在代码中改变对应值
        ReturnT returnT = new ReturnT(200,null);
        try {
            // todo
        }catch (Exception e){
            e.printStackTrace();
            XxlJobLogger.log(e);
            returnT.setCode(500);
        }finally {
            // todo
        }
        XxlJobLogger.log("job finish...");
        return returnT;
    }
}
