<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- proteinInteractionGraph.jsp -->
<%-- TODO fix this.  it's not very helpful now that our interactions are attached to genes instead of proteins
<c:choose>
  <c:when test="${empty object.interactions}">
    <p>No interactions found in FlyMine</p>
  </c:when>
  <c:otherwise>
    <img style="border: 1px solid #ccc" title="Protein Interactions"
         src="<html:rewrite action="/proteinInteractionRenderer?object=${object.id}"/>"/>
  </c:otherwise>
</c:choose>
 --%>
<!-- /proteinInteractionGraph.jsp -->