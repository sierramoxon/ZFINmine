<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<!-- bagUploadConfirm.jsp -->
<html:xhtml/>
<html:form action="/bagUploadConfirm" focus="newBagName" method="post" enctype="multipart/form-data" styleId="bagUploadConfirmForm">
<html:hidden property="matchIDs" styleId="matchIDs"/>
<html:hidden property="bagType"/>
<script type="text/javascript" src="js/baguploadconfirm.js"></script>
<script type="text/javascript">
 <!--
window.onload = function() { toggleForm(${matchCount}); }

function toggleForm(matchCount) {
  if (matchCount > 0) {
    document.bagUploadConfirmForm.newBagName.disabled = false;
    document.bagUploadConfirmForm.confirmBagUpload.disabled = false;
  } else {
    document.bagUploadConfirmForm.newBagName.disabled = true;
    document.bagUploadConfirmForm.confirmBagUpload.disabled = true;
  }
}

// -->
</script>
<c:set var="totalIdCount" value="${fn:length(duplicates) + fn:length(lowQualityMatches) + fn:length(convertedObjects) + matchCount + fn:length(unresolved)}"/>  <div class="body" align="center">

    <div id="uploadConfirmMessage">
      <strong>
        <span id="matchCount">${matchCount}</span> ${bagUploadConfirmForm.bagType}(s)
      </strong>
      currently in your list.<br/>
      <c:if test="${matchCount<totalIdCount}">
          Also found&nbsp;
      </c:if>
      <c:set var="comCount" value="0"/>
      <c:if test="${fn:length(lowQualityMatches)>0}">
        <strong>
          <span id="lowQCount">${fn:length(lowQualityMatches)}</span>
          synonym matches
        </strong>
        <c:set var="comCount" value="${comCount+1}"/>
      </c:if>
      <c:if test="${fn:length(duplicates)>0}">
        <c:if test="${comCount>=1}">,</c:if>
        <strong><span id="duplicateCount">${fn:length(duplicates)}</span> duplicate(s)</strong>
        <c:set var="comCount" value="${comCount+1}"/>
      </c:if>
      <c:if test="${fn:length(convertedObjects)>0}">
        <c:if test="${comCount>=1}">,</c:if>
        <strong>
          <span id="convertedCount">${fn:length(convertedObjects)}</span>
          objects found by converting types
        </strong>
        <c:set var="comCount" value="${comCount+1}"/>
      </c:if>
      <c:if test="${fn:length(unresolved)>0}">
      <c:if test="${comCount>=1}">,</c:if>
        <strong>${fn:length(unresolved)} unresolved</strong> identifier(s).
      </c:if>
    </div>
    <div class="blueBg">
      <c:choose>
        <c:when test="${matchCount < totalIdCount}">
          <p>
            <strong><span id="initialIdCount">${matchCount}</span></strong>
            of the <strong>${totalIdCount}</strong>
            identifier(s) you provided will be saved in your list.
          </p>
        </c:when>
        <c:otherwise>
          <p>Matches found for all identifiers</p>
        </c:otherwise>
      </c:choose>
      <fmt:message key="bagUploadConfirm.bagName"/>:
      <html:text property="newBagName" size="20" value="" onkeypress="if (event.keyCode == 13) {validateBagName('bagUploadConfirmForm');return false;} "/>
    <input type="button" name="confirmBagUpload" value="Save list" onclick="javascript:validateBagName('bagUploadConfirmForm');"/>
    </div>
  </div>
  <c:if test="${!empty duplicates || ! empty lowQualityMatches || ! empty convertedObjects}">
    <div class="heading">
      <fmt:message key="bagUploadConfirm.issues"/>
  </div>
    <div class="body">

  <p><b><span id="addAllLink" onclick="addAll('all','${jsArray}');" class="fakelink">Add all</span> |
    <span id="removeAllLink" onclick="removeAll('all','${jsArray}');">Remove all</span></b></p>

        <br/>

    <p><fmt:message key="bagUploadConfirm.issuesHelp">
         <fmt:param value="${bagUploadConfirmForm.bagType}"/>
       </fmt:message></p>
    <c:if test="${! empty lowQualityMatches}">
    <br/>
      <p>
        <h3>Synonym matches</h3>
    </p>
      <p>
        <c:set var="issueMap" value="${lowQualityMatches}"/>
        <tiles:insert name="bagUploadConfirmIssue.tile">
          <tiles:put name="message" value="${message}"/>
          <tiles:put name="issueMap" beanName="issueMap"/>
          <tiles:put name="issueType" value="lowQ"/>
          <tiles:put name="messageKey" value="bagUploadConfirm.lowQ"/>
          <tiles:put name="arrayName" value="${flatLowQualityMatches}"/>
        </tiles:insert>
    </p>
    </c:if>
    <c:if test="${! empty duplicates}">
      <br/>
      <p>
        <h3>Duplicates</h3>
      </p>
    <p>
        <c:set var="issueMap" value="${duplicates}"/>
        <tiles:insert name="bagUploadConfirmIssue.tile">
          <tiles:put name="message" value="${message}"/>
          <tiles:put name="issueMap" beanName="issueMap"/>
          <tiles:put name="issueType" value="duplicate"/>
          <tiles:put name="messageKey" value="bagUploadConfirm.duplicatesHeader"/>
          <tiles:put name="arrayName" value="${flatDuplicate}"/>
        </tiles:insert>
    </p>
    </c:if>

    <c:if test="${!empty convertedObjects}">
    <br/>
      <p>
        <h3><fmt:message key="bagUploadConfirm.convertedHeader"/></h3>
  </p>
      <p>
        <c:set var="issueMap" value="${convertedObjects}"/>
        <tiles:insert name="bagUploadConfirmIssue.tile">
          <tiles:put name="message" value="${message}"/>
          <tiles:put name="issueMap" beanName="issueMap"/>
          <tiles:put name="issueType" value="converted"/>
          <tiles:put name="messageKey" value="bagUploadConfirm.converted"/>
          <tiles:put name="messageParam" value="${bagUploadConfirmForm.bagType}"/>
          <tiles:put name="arrayName" value="${flatConverted}"/>
        </tiles:insert>
      </p>
    </c:if>
    </div>
  </c:if>

  <c:if test="${fn:length(unresolved) > 0}">
    <div class="heading">
      <fmt:message key="bagUploadConfirm.unresolvedDesc"/>
    </div>
    <div class="body">
      <p>
        <fmt:message key="bagUploadConfirm.unresolved">
          <fmt:param value="${fn:length(unresolved)}"/>
          <fmt:param value="${bagUploadConfirmForm.bagType}"/>
          <fmt:param value="${bagUploadConfirmForm.extraFieldValue}"/>
        </fmt:message>
      </p>
      <p style="font-weight: bold">
        <c:forEach items="${unresolved}" var="unresolvedIdentifer">${unresolvedIdentifer.key} </c:forEach>
      </p>
    </div>
    <div class="body">
    <html:submit property="goBack">
      <fmt:message key="bagUploadConfirm.goBack"/>
    </html:submit>
    </div>
  </c:if>
</html:form>
<!-- /bagUploadConfirm.jsp -->
