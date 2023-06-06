/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jbpm;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JBPMEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JBPMEndpoint target = (JBPMEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "attachmentid":
        case "attachmentId": target.getConfiguration().setAttachmentId(property(camelContext, java.lang.Long.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "contentid":
        case "contentId": target.getConfiguration().setContentId(property(camelContext, java.lang.Long.class, value)); return true;
        case "deploymentid":
        case "deploymentId": target.getConfiguration().setDeploymentId(property(camelContext, java.lang.String.class, value)); return true;
        case "emittersenditems":
        case "emitterSendItems": target.getConfiguration().setEmitterSendItems(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "entities": target.getConfiguration().setEntities(property(camelContext, java.util.List.class, value)); return true;
        case "event": target.getConfiguration().setEvent(property(camelContext, java.lang.Object.class, value)); return true;
        case "eventtype":
        case "eventType": target.getConfiguration().setEventType(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "extrajaxbclasses":
        case "extraJaxbClasses": target.getConfiguration().setExtraJaxbClasses(property(camelContext, java.lang.Class[].class, value)); return true;
        case "identifier": target.getConfiguration().setIdentifier(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxnumber":
        case "maxNumber": target.getConfiguration().setMaxNumber(property(camelContext, java.lang.Integer.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "page": target.getConfiguration().setPage(property(camelContext, java.lang.Integer.class, value)); return true;
        case "pagesize":
        case "pageSize": target.getConfiguration().setPageSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "parameters": target.getConfiguration().setParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "processid":
        case "processId": target.getConfiguration().setProcessId(property(camelContext, java.lang.String.class, value)); return true;
        case "processinstanceid":
        case "processInstanceId": target.getConfiguration().setProcessInstanceId(property(camelContext, java.lang.Long.class, value)); return true;
        case "statuses": target.getConfiguration().setStatuses(property(camelContext, java.util.List.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "targetuserid":
        case "targetUserId": target.getConfiguration().setTargetUserId(property(camelContext, java.lang.String.class, value)); return true;
        case "task": target.getConfiguration().setTask(property(camelContext, org.kie.api.task.model.Task.class, value)); return true;
        case "taskid":
        case "taskId": target.getConfiguration().setTaskId(property(camelContext, java.lang.Long.class, value)); return true;
        case "timeout": target.getConfiguration().setTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "userid":
        case "userId": target.getConfiguration().setUserId(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "userName": target.getConfiguration().setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "value": target.getConfiguration().setValue(property(camelContext, java.lang.Object.class, value)); return true;
        case "workitemid":
        case "workItemId": target.getConfiguration().setWorkItemId(property(camelContext, java.lang.Long.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "attachmentid":
        case "attachmentId": return java.lang.Long.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "contentid":
        case "contentId": return java.lang.Long.class;
        case "deploymentid":
        case "deploymentId": return java.lang.String.class;
        case "emittersenditems":
        case "emitterSendItems": return java.lang.Boolean.class;
        case "entities": return java.util.List.class;
        case "event": return java.lang.Object.class;
        case "eventtype":
        case "eventType": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "extrajaxbclasses":
        case "extraJaxbClasses": return java.lang.Class[].class;
        case "identifier": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxnumber":
        case "maxNumber": return java.lang.Integer.class;
        case "operation": return java.lang.String.class;
        case "page": return java.lang.Integer.class;
        case "pagesize":
        case "pageSize": return java.lang.Integer.class;
        case "parameters": return java.util.Map.class;
        case "password": return java.lang.String.class;
        case "processid":
        case "processId": return java.lang.String.class;
        case "processinstanceid":
        case "processInstanceId": return java.lang.Long.class;
        case "statuses": return java.util.List.class;
        case "synchronous": return boolean.class;
        case "targetuserid":
        case "targetUserId": return java.lang.String.class;
        case "task": return org.kie.api.task.model.Task.class;
        case "taskid":
        case "taskId": return java.lang.Long.class;
        case "timeout": return java.lang.Integer.class;
        case "userid":
        case "userId": return java.lang.String.class;
        case "username":
        case "userName": return java.lang.String.class;
        case "value": return java.lang.Object.class;
        case "workitemid":
        case "workItemId": return java.lang.Long.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        JBPMEndpoint target = (JBPMEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "attachmentid":
        case "attachmentId": return target.getConfiguration().getAttachmentId();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "contentid":
        case "contentId": return target.getConfiguration().getContentId();
        case "deploymentid":
        case "deploymentId": return target.getConfiguration().getDeploymentId();
        case "emittersenditems":
        case "emitterSendItems": return target.getConfiguration().getEmitterSendItems();
        case "entities": return target.getConfiguration().getEntities();
        case "event": return target.getConfiguration().getEvent();
        case "eventtype":
        case "eventType": return target.getConfiguration().getEventType();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "extrajaxbclasses":
        case "extraJaxbClasses": return target.getConfiguration().getExtraJaxbClasses();
        case "identifier": return target.getConfiguration().getIdentifier();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxnumber":
        case "maxNumber": return target.getConfiguration().getMaxNumber();
        case "operation": return target.getConfiguration().getOperation();
        case "page": return target.getConfiguration().getPage();
        case "pagesize":
        case "pageSize": return target.getConfiguration().getPageSize();
        case "parameters": return target.getConfiguration().getParameters();
        case "password": return target.getConfiguration().getPassword();
        case "processid":
        case "processId": return target.getConfiguration().getProcessId();
        case "processinstanceid":
        case "processInstanceId": return target.getConfiguration().getProcessInstanceId();
        case "statuses": return target.getConfiguration().getStatuses();
        case "synchronous": return target.isSynchronous();
        case "targetuserid":
        case "targetUserId": return target.getConfiguration().getTargetUserId();
        case "task": return target.getConfiguration().getTask();
        case "taskid":
        case "taskId": return target.getConfiguration().getTaskId();
        case "timeout": return target.getConfiguration().getTimeout();
        case "userid":
        case "userId": return target.getConfiguration().getUserId();
        case "username":
        case "userName": return target.getConfiguration().getUserName();
        case "value": return target.getConfiguration().getValue();
        case "workitemid":
        case "workItemId": return target.getConfiguration().getWorkItemId();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "entities": return java.lang.String.class;
        case "parameters": return java.lang.Object.class;
        case "statuses": return java.lang.String.class;
        default: return null;
        }
    }
}
