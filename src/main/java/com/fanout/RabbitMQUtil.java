package com.fanout;

import cn.hutool.core.util.NetUtil;

import javax.swing.*;
//判断服务器否启动
public class RabbitMQUtil {
    public static void main(String[] args) {
        checkServer();
    }

    public static void checkServer() {
        if (NetUtil.isUsableLocalPort(15672)){
            JOptionPane.showMessageDialog(null,"RabbmitMQ 服务器未启动");
            System.exit(1);
        }
    }


}
