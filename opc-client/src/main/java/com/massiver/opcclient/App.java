package com.massiver.opcclient;

import com.massiver.opcclient.ui.MainFrame;
import com.massiver.opcclient.utils.OPCUAUtils;
import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.nodes.UaNode;
import org.eclipse.milo.opcua.sdk.client.nodes.UaVariableNode;
import org.eclipse.milo.opcua.stack.core.Identifiers;
import org.eclipse.milo.opcua.stack.core.UaException;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;

/**
 * Hello world!
 */

public class App {
    static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws Exception {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }

}
