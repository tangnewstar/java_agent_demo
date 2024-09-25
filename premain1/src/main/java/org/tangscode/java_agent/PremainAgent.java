package org.tangscode.java_agent;

import java.lang.instrument.Instrumentation;

/**
 *  agent包定义的方法public static void premain(String agentArgs)
 *  方法名必须为premain，因为Instrumentation调用
 * sun.instrument.InstrumentationImpl.loadClassAndCallPremain()
 * 指定了方法名称
 */
public class PremainAgent {

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println(">>>>>>>>>>>>>> this is PremainAgent");
        System.out.println(">>>>>>>>>>>>>> agentArgs = " + agentArgs);
    }
}
