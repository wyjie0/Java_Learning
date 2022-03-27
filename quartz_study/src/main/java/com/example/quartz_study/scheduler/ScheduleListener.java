package com.example.quartz_study.scheduler;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

public class ScheduleListener implements JobListener {
    @Override
    public String getName() {
        return "wyj_listener";
    }

    @Override
    public void jobToBeExecuted(JobExecutionContext jobExecutionContext) {
        System.out.println("job to be executed " + jobExecutionContext.getJobDetail().getKey());
    }

    @Override
    public void jobExecutionVetoed(JobExecutionContext jobExecutionContext) {

    }

    @Override
    public void jobWasExecuted(JobExecutionContext jobExecutionContext, JobExecutionException e) {
        System.out.println("job was executed " + jobExecutionContext.getJobDetail().getKey());
    }
}
