<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="im"%>

<!-- templateList.jsp -->

<html:xhtml/>

<tiles:importAttribute name="displayObject" ignore="true"/>
<tiles:importAttribute name="interMineIdBag" ignore="true"/>
<tiles:importAttribute name="noTemplatesMsgKey" ignore="true"/>
<tiles:importAttribute name="placement"/>
<tiles:importAttribute name="scope"/>
<tiles:importAttribute name="trail" ignore="true"/>

<c:if test="${!empty displayObject}">
  <c:set var="interMineObject" value="${displayObject.object}"/>
</c:if>

<c:forEach items="${templates}" var="templateQuery" varStatus="status">
  <tiles:insert name="objectDetailsTemplate.jsp">
    <tiles:put name="displayObject" beanName="displayObject"/>
    <tiles:put name="interMineIdBag" beanName="interMineIdBag"/>
    <tiles:put name="templateQuery" beanName="templateQuery"/>
    <tiles:put name="placement" value="${placement}"/>
    <tiles:put name="scope" value="${scope}"/>
    <tiles:put name="trail" value="${trail}"/>
  </tiles:insert>
  <c:if test="${!status.last}">
    <hr class="seperator"/>
  </c:if>
</c:forEach>

<c:if test="${empty templates && !empty noTemplatesMsgKey}">
  <div class="altmessage"><fmt:message key="${noTemplatesMsgKey}"/></div>
</c:if>

<!-- /templateList.jsp -->
