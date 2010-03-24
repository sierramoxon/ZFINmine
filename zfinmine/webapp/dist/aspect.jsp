<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="im"%>

<!-- aspect -->

<html:xhtml/>

<script language="javascript">
<!--//<![CDATA[

   function toggleDiv(elementId) {
      var element = document.getElementById(elementId);
      var display = element.style.display;
      if(display=='none') {
      element.style.display='block';
          document.getElementById(elementId + 'Toggle').src = 'images/disclosed.gif';
      } else {
          element.style.display='none';
          document.getElementById(elementId + 'Toggle').src = 'images/undisclosed.gif';
      }
   }

   function hideCurrentDataDivs() {
     var hasHidden = true;
     var index = 1;
     while (hasHidden) {
       if (document.getElementById('hiddenDiv' + index)) {
         toggleDiv('hiddenDiv' + index);
         index ++;
       } else {
            hasHidden = false;
    }
     }
   }
   window.onload = function() {
     hideCurrentDataDivs();
   }
//]]>-->
</script>


<%-- Import into request scope so that popup can see it --%>
<tiles:importAttribute name="aspect" scope="request"/>
<tiles:importAttribute name="startingPoints"/>

<im:box title="${aspect.name}" topRightTile="/aspectPopup.jsp">

  <c:if test="${!empty aspect.aspectSources}">
    <div class="aspectSources">
      <fmt:message key="aspect.sources.from"/>
      <ul>
        <c:forEach items="${aspect.aspectSources}" var="source">
          <li><a href="${source.url}" target="_new" class="extlink">${source.name}</a></li>
        </c:forEach>
      </ul>
    </div>
  </c:if>

  <img src="${ASPECTS[aspect.name].iconImage}" title="${aspect.name} queries, databases, datasources and data downloads" class="aspectPageIcon" align="left"/>
  <div class="body aspectIntro">
    ${aspect.introText}
  </div>
  <div style="clear:both;"></div>

  <c:if test="${!empty aspect.tileName}">
    <div class="aspectTile">
      <tiles:insert name="${aspect.tileName}"/>
    </div>
  </c:if>

  <div class="heading">
    <fmt:message key="aspect.templates.heading"/>
  </div>
  <div class="body aspectTemplates">
    <tiles:insert name="templateList.tile">
      <tiles:put name="scope" value="global"/>
      <tiles:put name="placement" value="${aspect.name}"/>
      <tiles:put name="noTemplatesMsgKey" value="templateList.noTemplates"/>
    </tiles:insert>
  </div>

  <div class="heading">
    <fmt:message key="aspect.starting.points.heading"/>
  </div>
  <div class="body aspectStartingPoints">
    <p><fmt:message key="aspect.starting.points.helptext"/></p>
    <c:forEach items="${startingPoints}" var="classname" varStatus="status">
      <im:unqualify className="${classname}" var="name"/>
      <a href="/${WEB_PROPERTIES['webapp.path']}/queryClassSelect.do?action=<fmt:message key="button.selectClass"/>&amp;className=${classname}" title="<c:out value="${classDescriptions[classname]}"  /> "rel="NOFOLLOW" >${name}</a><c:if test="${!status.last}">,</c:if>
    </c:forEach>
  </div>

</im:box>

<!-- /aspect -->

