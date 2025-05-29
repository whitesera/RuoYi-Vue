package com.ruoyi.flowable.listener;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class ArchiveDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        // 实现档案归档的业务逻辑
        // 将档案信息保存到数据库中
        System.out.println("档案已归档");
    }
}