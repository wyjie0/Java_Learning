package com.example.quartz_study.scheduler;

import org.quartz.*;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Random;
import java.util.UUID;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;

public class QuartzTest {
    public static void main(String[] args) {
        try {
            // 创建Scheduler
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            SimpleScheduleBuilder.simpleSchedule().withIntervalInMinutes(5);
            String uuid = UUID.randomUUID().toString();
            // 创建Trigger
            SimpleTrigger trigger = TriggerBuilder.newTrigger().withIdentity(uuid, "group_wyj")
                    .startNow()
                    .withSchedule(simpleSchedule().withIntervalInSeconds(2)
                            .repeatForever())
                    .build();

            // 定义JobDetail
            JobDetail job = JobBuilder.newJob(HelloQuartz.class).withIdentity(uuid, "group_wyj")
                    .usingJobData("name", "quartz")
                    .build();

            // 加入调度
            scheduler.scheduleJob(job, trigger);
            ListenerManager listenerManager = scheduler.getListenerManager();
            listenerManager.addJobListener(new ScheduleListener());
            //启动
            scheduler.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
