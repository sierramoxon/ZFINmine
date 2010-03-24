<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="im" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<!-- wsFilterList.jsp -->

<%@ page import="org.intermine.dwr.AjaxServices" %>
<%@ page import="org.intermine.web.logic.session.SessionMethods" %>

<tiles:importAttribute name="type"/>
<tiles:importAttribute name="wsListId"/>
<tiles:importAttribute name="scope"/>
<tiles:importAttribute name="showNames" ignore="true"/>
<tiles:importAttribute name="showTitles" ignore="true"/>
<tiles:importAttribute name="showDescriptions" ignore="true"/>
<tiles:importAttribute name="showSearchBox" ignore="true"/>

<tiles:importAttribute name="makeCheckBoxes" ignore="true"/>
<tiles:importAttribute name="makeTable" ignore="true"/>
<tiles:importAttribute name="makeLine" ignore="true"/>
<tiles:importAttribute name="wsHeader" ignore="true"/>
<tiles:importAttribute name="wsRow" ignore="true"/>
<tiles:importAttribute name="height" ignore="true"/>
<tiles:importAttribute name="limit" ignore="true"/>
<tiles:importAttribute name="initialFilterText" ignore="true"/>
<tiles:importAttribute name="loginMessageKey" ignore="true"/>
<tiles:importAttribute name="showCount" ignore="true"/>


<html:xhtml/>
<%
    String id =  pageContext.getAttribute("wsListId") + "_" + pageContext.getAttribute("type") + "_item_description";
      org.intermine.web.logic.results.WebState webState = SessionMethods.getWebState(session);
      if (webState.getState(id) != null) {
          if (webState.getState(id).toString().equals("true")) {
              pageContext.setAttribute("userShowDescription", true);
          }
      } else {
          pageContext.setAttribute("userShowDescription", true);
      }
%>

<c:set var="ws_input_id" value="${wsListId}_${type}_filter_text"/>
<c:set var="ws_input_aspect" value="${wsListId}_${type}_filter_aspect"/>
<c:set var="textForBox" value="${WEB_PROPERTIES['lists.input.example']}" />

<script type="text/javascript" charset="utf-8">
// jQuery(document).ready(function(){
//     jQuery('#actions_button').click(function() {
//         var posArray = findPosition(this);
//         jQuery('#actions_menu').css('left', posArray[0] +"px");
//         jQuery('#actions_menu').css('top', posArray[1] + 20 +"px");
//         jQuery('#actions_menu').toggle();
//     });
//     // document.onClick(function(){
//     //     jQuery('#actions_menu').hide();
//     // })
// });

function clearBagName(element) {
    if(element.value == '${textForBox}'){
        element.value='';
        element.style.fontStyle = 'normal';
        element.style.color = '';
    }
}
</script>

<div class="filterBar">
            Search:&nbsp;
            <input type="text" id="${ws_input_id}" name="newName_${name}" size="20"
                onkeyup="return filterWebSearchablesHandler(event, this, '${type}', '${wsListId}');"
                onmouseup="if(this.value != null && this.value.length > 1) {return filterWebSearchablesHandler(event, this, '${type}', '${wsListId}');}"
                onKeyPress="return disableEnterKey(event);"
                disabled="true"
                value="${initialFilterText}"/>

          <c:if test="${PROFILE.loggedIn || type == 'template'}">
            Filter:&nbsp;
          </c:if>
          <c:if test="${PROFILE.loggedIn}">
            <a href="javascript:filterFavourites('${type}', '${wsListId}');"><img id="filter_favourites_${wsListId}_${type}" src="images/filter_favourites.png" width="20" height="20" title="Show Only Favourites" style="vertical-align: middle;"/></a>
            <a href="javascript:changeScope('${type}', '${wsListId}');"><img id="filter_scope_${wsListId}_${type}" src="images/filter_all.png" width="20" height="20" title="Show all or mine only" style="vertical-align: middle;"/></a>
            <c:if test="${type == 'bag'}">
              <script type="text/javascript">
                  function filterByTag(tag) {
                      filterByUserTag('${type}', '${wsListId}', tag);
                  }
              </script>
              <tiles:insert name="tagSelect.tile">
                      <tiles:put name="type" value="${type}" />
                      <tiles:put name="selectId" value="tagSelect" />
                      <tiles:put name="onChangeFunction" value="filterByTag" />
              </tiles:insert>
            </c:if>
          </c:if>

          <c:if test="${type == 'template'}">
          <%-- aspects --%>
            <select onchange="javascript:filterAspect('${type}', '${wsListId}')" id="${ws_input_aspect}" class="aspectSelect" style="">
            <c:if test="${aspect == null}">
              <option value="" selected>-- all categories --</option>
            </c:if>
            <c:forEach items="${ASPECTS}" var="entry">
              <c:set var="set" value="${entry.value}"/>
              <option value="${set.name}"
                <c:if test="${aspect.name == set.name}">
                  selected
                </c:if>
              >${set.name}</option>
            </c:forEach>
          </select>
          </c:if>
           <input type="button" name="reset" value="Reset" id="reset_button" onclick="javascript:return clearFilter('${type}', '${wsListId}')">
          <input type="hidden" name="filterAction_${wsListId}_${type}" id="filterAction_${wsListId}_${type}"/>
          <input type="hidden" name="filterScope_${wsListId}_${type}" id="filterScope_${wsListId}_${type}" value="${scope}"/>
</div>

<div id="filter_tool_bar">
    <!-- <html:link styleId="actions_button" linkName="#">List Actions (Union, Intersection,..)&nbsp;<img src="images/arrow_down.png" width="10" height="8" alt="Arrow Down"></html:link> -->
    <ul id="actions_menu">
        <li><strong>Actions:</strong></li>
    <c:choose>
    <c:when test="${type == 'template'}">
    <script language="javascript">
      jQuery("document").ready(function(){
        jQuery("#export_button").click(function(){
          jQuery("#modifyTemplateForm").submit();
        });
      });
    </script>
        <li>
            <html:submit property="export" value="Export selected"/>
            <html:hidden property="pageName" value="templates"/>
            <html:hidden property="templateButton" value="export"/>
        </li>
    </c:when>
    <c:otherwise>
    <li>
        <a href="#operations" title="Union" onclick="jQuery('#listsButton').val('union')" class="boxy"><img src="images/union.png" width="21" height="14" alt="Union">Union</a>&nbsp;|&nbsp;
    </li>
    <li>
        <a href="#operations" title="Intersect" onclick="jQuery('#listsButton').val('intersect')" class="boxy"><img src="images/intersect.png" width="21" height="14" alt="Intersect">Intersect</a>&nbsp;|&nbsp;
    </li>
    <li>
        <a href="#operations" title="Subtract" onclick="jQuery('#listsButton').val('subtract')" class="boxy"><img src="images/subtract.png" width="21" height="14" alt="Subtract">Subtract</a>&nbsp;|&nbsp;
    </li>
    <li>
        <a href="#operations" title="Copy" onclick="jQuery('#listsButton').val('copy')" class="boxy"><img src="images/copy.png" width="16" height="16" alt="Copy">Copy</a>
    </li>
    </c:otherwise>
    </c:choose>
    <li>&nbsp;&nbsp;&nbsp;</li>
    <li><b>Options:</b></li>
    <li>
      <c:if test="${! empty userShowDescription}">
        <c:set var="checkboxChecked" value="checked" />
      </c:if>
      <input type="checkbox" <c:out value="${checkboxChecked}" /> id="showCheckbox"
      onclick="showDescriptions('<c:out value="${wsListId}" />', '<c:out value="${type}" />', this.checked)">
    </li>
    <li>
      <label for="showCheckbox">Show descriptions</label>
    </li>
    </ul>
    <br clear="both"/>
</div>
<html:hidden property="listsButton" value="" styleId="listsButton"/>
<%-- Need a dummy because boxy puts it outside of the form --%>
<html:hidden property="newBagName" value="" styleId="newBagName"/>
<div id="operations" style="display:none">
    Enter a new List name:<br>
    <html:text styleId="dummy_text" property="" size="12" value="${textForBox}" style="color:#666;font-style:italic;vertical-align:top" onclick="clearBagName(this)"/>
    <html:submit property="submit" value="Save" onclick="submitBagOperation()"/>
</div>
<script type="text/javascript" charset="utf-8">
    jQuery(document).ready(function(){
        jQuery(".boxy").boxy();
    });
    function submitBagOperation() {
       jQuery("#newBagName").val(jQuery("#dummy_text").val());
       validateBagOperations('modifyBagForm',jQuery('#listsButton').val());
    }
</script>
<script type="text/javascript">
  <%-- turn off autocomplete because of a Gecko bug:
       http://geekswithblogs.net/shahedul/archive/2006/08/14/87910.aspx --%>
  <!--
      jQuery('#${wsListId}_${type}_filter_text').attr('autocomplete','off');
    -->
</script>

<tiles:insert name="webSearchableList.tile">
  <tiles:put name="type" value="${type}"/>
  <tiles:put name="wsListId" value="${wsListId}"/>
  <tiles:put name="scope" value="${scope}"/>
  <tiles:put name="tags" value="${tags}"/>
  <tiles:put name="showNames" value="${showNames}"/>
  <tiles:put name="showTitles" value="${showTitles}"/>
  <tiles:put name="showDescriptions" value="${showDescriptions}"/>
  <tiles:put name="makeCheckBoxes" value="${makeCheckBoxes}"/>
  <tiles:put name="makeTable" value="${makeTable}"/>
  <tiles:put name="makeLine" value="${makeLine}"/>
  <tiles:put name="wsHeader" value="${wsHeader}"/>
  <tiles:put name="wsRow" value="${wsRow}"/>
  <tiles:put name="limit" value="${limit}"/>
  <tiles:put name="height" value="${height}"/>
  <tiles:put name="showSearchBox" value="${showSearchBox}"/>
  <tiles:put name="delayDisplay" value="${!empty initialFilterText}"/>
  <tiles:put name="loginMessageKey" value="${loginMessageKey}"/>
  <tiles:put name="showCount" value="${showCount}"/>
</tiles:insert>

 <script type="text/javascript">
<%-- enable filter only after the list is populated --%>
<!--//<![CDATA[
    jQuery('#${ws_input_id}').attr('disabled','');
//]]>-->
  </script>

<c:if test="${empty userShowDescription}">
    <script type="text/javascript">
<%-- If show description checkbox is not checked, then descriptions should be hidden --%>
    showDescriptions('<c:out value="${wsListId}" />', '<c:out value="${type}" />', false);
    </script>
</c:if>

<c:if test="${!empty initialFilterText}">
  <script type="text/javascript">
<!--//<![CDATA[
    filterWebSearchablesHandler(null, jQuery('#${ws_input_id}').get(0), '${type}', '${wsListId}');
//]]>-->
  </script>
</c:if>
<!-- /wsFilterList.jsp -->
