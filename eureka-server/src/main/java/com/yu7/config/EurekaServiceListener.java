//package com.yu7.config;
//
//import AllUtil.StringUtils.StringChange;
//import com.netflix.appinfo.InstanceInfo;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
//import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
//import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//
///**
// * Eureka服务上下线监听
// */
//@Slf4j
//@Component
//public class EurekaServiceListener {
//    /**
//     * 想要在Eureka-Server中更新缓存好像行不通，还是得去调用方
//     */
//    @Resource
//    ClearRibbonCacheBeanByListen clearRibbonCacheBean;
//
//    @Resource
//    SpringClientFactory springClientFactory;
//    @EventListener
//    public void listen(EurekaInstanceCanceledEvent event){
//        log.debug(event.getServerId()+"\t"+event.getAppName()+"服务下线");
//        String serverInfo = event.getServerId();
//        Integer port = StringChange.stringGetNumber(serverInfo);
//        clearRibbonCacheBean.clearRibbonCacheByPort(springClientFactory,port,event.getAppName());
//    }
//
//    @EventListener
//    public void listen(EurekaInstanceRegisteredEvent event){
//        InstanceInfo instanceInfo = event.getInstanceInfo();
//        log.debug(instanceInfo.getId()+"\t"+instanceInfo.getAppName()+"进行注册");
//    }
//}
