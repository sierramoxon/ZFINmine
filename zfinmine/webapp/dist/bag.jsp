<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<!-- bag.jsp -->
<html:xhtml/>

<div class="body">
  <c:choose>
    <c:when test="${empty subtabs[subtabName]  || subtabs[subtabName] == 'upload'}">
      <!-- <div id="leftCol"> -->
            <div align="center">
              <tiles:insert name="bagBuild.tile"/>
            </div>
      <!-- </div> -->
    </c:when>
    <c:otherwise>
      <!-- <div id="rightCol"> -->
              <div style="clear:both">
              <c:import url="bagView.jsp"/>
              </div>
      <!-- </div> -->
    </c:otherwise>
  </c:choose>
</div>
<!-- /bag.jsp -->
