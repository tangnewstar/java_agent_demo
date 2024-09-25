package org.tangscode.java_agent;

import sun.instrument.InstrumentationImpl;

/**
 * 基于Instrument接口实现java agent
 */
public class TestPreMainJavaAgent
{
    public static void main( String[] args )
    {
        System.out.println("哈喽，大家好，我是TestPreMainJavaAgent，" +
                "今天，我打算和PreMain以及PreMain2一起去玩玩Java Agent.");
    }
}
