package com.massiver.opcclient;

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
        //OpcUaClient client = OPCUAUtils.createClient();
        //
        //client.connect().get();
        ////Thread.sleep(1000);
        ////browseNode("", client, Identifiers.RootFolder);
        //
        //
        //// NodeId nodeId = new NodeId(3, "MODBUS.人工降雨.A相电流");
        ////
        //// DataValue value = client.readValue(0.0, TimestampsToReturn.Both, nodeId).get();
        //
        //UaVariableNode node = client.getAddressSpace().getVariableNode(Identifiers.Server_ServerStatus_StartTime);
        //DataValue value = node.readValue();
        //
        //logger.info("StartTime={}", value.getValue().getValue());

        System.out.println("Hello World!");
    }


}
