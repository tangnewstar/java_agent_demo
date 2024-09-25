package org.tangscode.java_agent;

import java.lang.instrument.Instrumentation;

/**
 * @author tangxinxing
 * @version 1.0
 * @description
 * @date 2024/9/25
 */
public class AgentMain {

    public static void agentmain(String agentArgs, Instrumentation inst) {
        System.out.println("----------哈哈，我是agentmain");
        System.out.println("----------agentArgs = " + agentArgs);
    }
}
