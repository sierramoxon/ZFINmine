<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- malariamine/webapp/resources/webapp/model/keggDisplayer.jsp -->
<c:if test="${!empty object.pathways}">
<h3>Pathways</h3>

<!-- loop through the pathways -->
<c:forEach items="${object.pathways}" var="item">

     <!-- eg. http://www.genome.jp/kegg-bin/show_pathway?pfa00030+PF13_0143 -->
     <a href="http://www.genome.jp/kegg-bin/show_pathway?dre${item.identifier}">${item.identifier}</a><br/>

</c:forEach>

</c:if>
<!-- keggDisplayer.jsp -->