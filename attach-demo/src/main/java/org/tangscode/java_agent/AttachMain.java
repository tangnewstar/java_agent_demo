package org.tangscode.java_agent;

import com.sun.tools.attach.VirtualMachine;

/**
 * @author tangxinxing
 * @version 1.0
 * @description
 * @date 2024/9/25
 */
public class AttachMain {

    public static void main(String[] args) {
        try {
            VirtualMachine vm = VirtualMachine.attach("17728");
            vm.loadAgent("E:\\code\\java_agent_demo\\agent-demo\\target\\agent-demo-1.0-SNAPSHOT.jar", "haha");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
