package org.tangscode.java_agent;

import java.lang.instrument.Instrumentation;

/**
 *  agent包定义的方法public static void premain(String agentArgs)
 *  方法名必须为premain，因为Instrumentation调用
 * sun.instrument.InstrumentationImpl.loadClassAndCallPremain()
 * 指定了方法名称
 *
 * 如果agent抛出异常，目标程序则无法启动
 */
public class PremainAgent2 {

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println(">>>>>>>>>>>>>> this is PremainAgent2");
        System.out.println(">>>>>>>>>>>>>> agentArgs = " + agentArgs);
//        throw new RuntimeException("PremainAgent2 故意抛出异常");
    }
}
