package com.bstek.crm.uflo.handle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bstek.uflo.env.Context;
import com.bstek.uflo.model.ProcessInstance;
import com.bstek.uflo.process.handler.AssignmentHandler;
import com.bstek.uflo.process.node.TaskNode;

/** 
* 
* @author bob.yang
* @since 2017年9月24日
* 部门经理审批节点处理人
*
*/
@Component
public class LoginUserAssignmentHandler implements AssignmentHandler {

	public Collection<String> handle(TaskNode taskNode, ProcessInstance processInstance, Context context) {
		List<String> users = new ArrayList<String>();		
		String promoter = processInstance.getPromoter();//流程实例的发起人
		users.add(promoter);
		return users;
	}

}