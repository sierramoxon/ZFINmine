<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="im"%>

<!-- customQuery.jsp -->
<html:xhtml/>

<script type="text/javascript" src="js/mymine.js"></script>

<div class="body">
    <div id="leftCol">
      <im:boxarea title="QueryBuilder" stylename="plainbox" >
      <p><fmt:message key="customQuery.intro"/></p><br>
           <html:link action="/tree">
              Browse data model
              <img border="0" class="arrow" src="images/right-arrow.gif" title="Click here to browse the data model"/>
            </html:link>
            <br/>
            <html:link action="/importQueries?query_builder=yes">
              <fmt:message key="begin.import.query"/>
              <img border="0" class="arrow" src="images/right-arrow.gif" title="Click here to import a query"/>
            </html:link>
            <br/>
            <%-- TODO this should be done elsewhere --%>
          <c:choose>
            <c:when test="${!PROFILE.loggedIn}">
              <c:set var="linky" value="login.do?returnto=%2Fmymine.do%3Fpage%3Dsaved"/>
              <html:link action="${linky}">
              Login to view saved queries
              <img border="0" class="arrow" src="images/right-arrow.gif" title="Click here to login"/>
            </html:link>
            </c:when>
            <c:otherwise>
              <c:set var="linky" value="/mymine.do?subtab=saved"/>
              <html:link action="${linky}">
              View saved queries
              <img border="0" class="arrow" src="images/right-arrow.gif" title="Click here to view saved queries"/>
            </html:link>
            </c:otherwise>
          </c:choose>
          </im:boxarea>
   </div>

   <div id="rightCol">
  <%-- class chooser --%>
  <im:boxarea titleKey="customQuery.classChooser" stylename="gradientbox">
    <tiles:insert name="classChooser.tile"/>
  </im:boxarea>
   </div>

  <div id="clearLine">
         <%-- query history --%>
         <im:boxarea title="Query History" stylename="gradientbox">
          <tiles:insert name="historyQueryView.jsp">
             <tiles:put name="type" value="history"/>
           </tiles:insert>
          </im:boxarea>
  </div>
</div>

<!-- /customQuery.jsp -->
