<%@ tag body-content="scriptless" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="im"%>
<%@ attribute name="pageName" required="true" %>
<%@ attribute name="helpimg" required="false" %>
<%@ attribute name="anchor" required="false" %>

<%-- outputs a superscript question mark which, when clicked, pops up a
     section in the wiki pages --%>

<c:set var="url" value="${WEB_PROPERTIES['project.helpLocation']}/${pageName}.html"/>

<c:if test="${!empty anchor}">
  <c:set var="url" value="${url}#"/>
  <c:set var="url" value="${url}${anchor}"/>
</c:if>

&nbsp;&nbsp;
<html:link href="${url}" onclick="javascript:window.open('${url}','_help','toolbar=0,scrollbars=1,location=1,statusbar=1,menubar=0,resizable=1,width=800,height=600');return false">
  <jsp:doBody/>
  <c:if test="${!empty helpimg}">
    <img src="${helpimg}" title="Click here for more information about this page." style="vertical-align:middle"/>
  </c:if>
</html:link>
