<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="im"%>

<!-- mymine.jsp -->

<div class="body">
<script type="text/javascript" src="js/mymine.js"></script>

<c:choose>
  <%-- bags --%>
  <c:when test="${subtabs[subtabName]  =='lists'||subtabs[subtabName]  == null}">
    <tiles:insert name="historyBagView.jsp">
    <tiles:put name="type" value="bag"/>
  </tiles:insert>
  </c:when>

    <%-- query history --%>
    <c:when test="${subtabs[subtabName]  =='history'}">
      <tiles:insert name="historyQueryView.jsp">
        <tiles:put name="type" value="history"/>
      </tiles:insert>
    </c:when>
    
    <%-- saved queries --%>
    <c:when test="${subtabs[subtabName]  =='saved'}">
      <tiles:insert name="historyQueryView.jsp">
        <tiles:put name="type" value="saved"/>
      </tiles:insert>
    </c:when>
           
    <%-- saved templates --%>    
    <c:when test="${subtabs[subtabName]  =='templates'}">
      <tiles:insert name="historyTemplateView.jsp">
        <tiles:put name="type" value="template"/>
      </tiles:insert>
    </c:when>
    
    <%-- password --%> 
    <c:when test="${subtabs[subtabName]  =='password'}">
      <tiles:insert name="changePassword.jsp" />
    </c:when>
  </c:choose>

  <%-- tag actions for super user --%>
  <div class="body">
    <c:if test="${IS_SUPERUSER}">
      <span class="smallnote">
          <html:link action="/exportTags">
            <fmt:message key="history.exportTags"/>
          </html:link>
      </span><br/>
      <span class="smallnote">
          <html:link action="/tagImport">
            <fmt:message key="history.importTags"/>
          </html:link>
      </span>
    </c:if>
  </div>

</div>


<!-- /mymine.jsp -->
