<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
    <%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="im" %>

<%--
mainConstraint.jsp

Inputs:
editingConstraintIndex the index of the constraint we are editing, or null for a new constraint
editingTemplateConstraint
editingNode the PathNode of the field we are constraining
displayConstraint a DisplayConstraint object
loopQueryPaths a list of PathNodes that are a compatible type to the current node
loopQueryOps ClassConstraint.VALID_OPS
editingPath a Path object

Calculated:
constraint
validOps displayConstraint.validOps
fixedOps displayConstraint.fixedOpIndices
options displayConstraint.optionsList

--%>

<!-- mainConstraint.jsp -->

<html:xhtml/>
<div id="constraint" style="display:none">
    <html:form action="/mainAction" styleId="mainForm">
    <html:hidden styleId="addType" property="addType" value=""/>
    <c:choose>
      <c:when test="${!empty editingNode.pathString}">
        <html:hidden property="path" value="${editingNode.pathString}"/>
      </c:when>
      <c:otherwise>
        <html:hidden property="path" value="${editingPath}"/>
      </c:otherwise>
    </c:choose>
    <html:hidden property="editingConstraintEditable" value="${editingConstraintEditable}"/>
    <c:if test="${editingConstraintIndex != null}">
    <html:hidden property="cindex" value="${editingConstraintIndex}"/>
</c:if>

<c:if test="${TEMPLATE_BUILD_STATE != null && (editingTemplateConstraint)}">
<c:set var="constraint" value="${editingNode.constraints[editingConstraintIndex]}" scope="request"/>
<tiles:insert page="constraintSettings.jsp"/>
</c:if>

<c:if test="${!editingTemplateConstraint}">

<div class="heading constraintTitle">
    <fmt:message key="query.constrain"/><%--Constraint--%>
</div>

<div class="body">
<c:if test="${empty joinStyleOnly}" >
  <h3><fmt:message key="query.constraintHeading"/></h3> <%--1. Choose a filter--%>
</c:if>
<!-- ATTRIBUTE TOGGLE -->
<c:if test="${displayConstraint.attribute || ! empty keyFields}">
  <h4>
    <a href="javascript:swapInputs('attribute');">
      <img id='attributeToggle' src="images/disclosed.gif"/>
      <fmt:message key="query.filterValue"/><%--Filter query results on this field having a specific value.--%>
    </a>
  </h4>

  <!-- field name -->
  <c:choose>
    <c:when test="${empty editingNode.fieldName}">
      <span class="type">
        <c:out value="${editingNode.pathString}"/>
      </span>
    </c:when>
    <c:otherwise>
      <span class="attributeField">
        <c:out value="${editingNode.fieldName}"/>
      </span>
    </c:otherwise>
  </c:choose>
  <c:choose>
    <c:when test="${editingNode.collection}">
      <fmt:message key="query.collection"><%--collection--%>
        <fmt:param value="${editingNode.type}"/>
      </fmt:message>
    </c:when>
    <c:otherwise>
      <%-- <c:out value="${editingNode.type}"/> --%>
    </c:otherwise>
  </c:choose>

  <c:set var="fixedOps" value="${displayConstraint.fixedOpIndices}"/>
  <c:set var="options" value="${displayConstraint.optionsList}"/>
  <c:set var="validOps" value="${displayConstraint.validOps}"/>
</c:if>

<script type="text/javascript">
<!--

fixedOps = new Array();

fixedOps[0] = new Array();
<c:forEach items="${fixedOps}" var="op" varStatus="status">
fixedOps[0][${status.count}] = "<c:out value="${op}"/>";
</c:forEach>


//-->
</script>


<!-- input or radio buttons -->
<c:choose>
  <c:when test="${editingNode.attribute}">
    <table border="0" cellspacing="0" cellpadding="1" border="0" class="noborder" >
      <tr>
        <c:choose>
          <c:when test="${editingNode.type == 'Boolean'}">
            <td valign="top">
              <html:hidden property="attributeOp" styleId="attribute1" value="0" disabled="false" />
              <html:radio property="attributeValue" styleId="attribute2" value="true" disabled="false" /><fmt:message key="query.constraint.true"/>
              <html:radio property="attributeValue" styleId="attribute3" value="false" disabled="false" /><fmt:message key="query.constraint.false"/>
              <html:radio property="attributeValue" styleId="attribute4" value="NULL" disabled="false" /><fmt:message key="query.constraint.null"/>
            </td>
          </c:when>
          <c:otherwise>
            <td valign="top">
              <html:select property="attributeOp" styleId="attribute5" onchange="updateConstraintForm(0, this.form.attributeOp, this.form.attributeOptions, this.form.attributeValue, fixedOps)">
                <c:forEach items="${validOps}" var="op">
                  <c:if test="${!(editingNode.type == 'String' && (op.value == '<=' || op.value == '>='))}">
                    <option value="${op.key}"<c:if test="${editingConstraintOperand == op.key}">selected</c:if>>
                      <im:displayableOpName opName="${op.value}" valueType="${editingNode.type}"/>
                    </option>
                  </c:if>
                </c:forEach>
              </html:select>
            </td>
            <td valign="top" align="center">
              <span id="operandEditSpan0">
                <c:set var="ac" value="${useAutoCompleter}"/>
                <c:set var="classDesc" value="${classDescriptor}"/>
                <c:set var="fieldDesc" value="${fieldDescriptor}"/>
                <c:choose>
                  <%-- inputfield for an autocompletion --%>
                  <c:when test="${!empty ac}">
                    <input name="attributeValue" id="attribute6" size="55" autocomplete ="off" style="background:#ffffc8" value="${editingConstraintValue}" onKeyDown="getId(this.id); isSubmit(event);" onKeyUp="readInput(event, '${classDesc}', '${fieldDesc}');" onMouseOver="setMouseOver(1);" onMouseOut="setMouseOver(0);" onBlur="if(MOUSE_OVER != 1) { removeList(); }"/>
                    <iframe width="100%" height="0" id="attribute6_IEbugFixFrame" marginheight="0" marginwidth="0" frameborder="0" style="position:absolute;" >
                    </iframe>
                    <div class="auto_complete" id="attribute6_display" onMouseOver="setMouseOver(1);" onMouseOut="setMouseOver(0);" onBlur="if(MOUSE_OVER != 1) { removeList(); }">
                    </div>
                    <div class="error_auto_complete" id="attribute6_error">
                    </div>
                  </c:when>
                  <%-- normal inputfield --%>
                  <c:otherwise>
                    <c:set var="datePickerClass" value=""/>
                    <c:if test="${editingNode.type == 'Date'}">
                      <c:set var="datePickerClass" value="date-pick"/>
                    </c:if>
                    <html:text property="attributeValue" styleId="attribute6" value="${editingConstraintValue}" onkeypress="if(event.keyCode == 13) {$('attribute').click();return false;}" styleClass="${datePickerClass}"/>
                    <c:if test="${editingNode.type == 'Date'}">
<script type="text/javascript">
jQuery('.date-pick').datepicker(
    {
        buttonImage: 'images/calendar.png',
        buttonImageOnly: true,
        dateFormat: 'yy-mm-dd',
        showOn: "both",
        showAnim: 'blind',
        showOptions: {speed: 'fast'}
    }
);
</script>
                    </c:if>
                  </c:otherwise>
                </c:choose>

                <%-- might want to show up arrow --%>
                <c:if test="${!empty options}">
                  <br/><im:vspacer height="2"/>
                  <img src="images/up-arrow.gif" title="^^^" border="0" height="13" width="13"/>
                  <im:vspacer height="2"/>
                </c:if>
              </span>
              <c:if test="${!empty options}">
                <html:select property="attributeOptions" styleId="attribute7" onchange="this.form.attributeValue.value=this.value;">
                  <c:forEach items="${options}" var="option">
                    <option value="${option}"<c:if test="${editingConstraintValue == option}">selected</c:if>>
                      <c:out value="${option}"/>
                    </option>
                  </c:forEach>
                </html:select>
              </c:if>
            </td>
          </c:otherwise>
        </c:choose>
        <td valign="top">&nbsp;
          <html:submit property="attribute"  styleId="attributeSubmit" disabled="false">
            <fmt:message key="query.submitConstraint"/><%--Add to query--%>
          </html:submit>
        </td>
      </tr>
      <c:if test="${editingNode.type == 'String'}">
        <tr>
          <td colspan="3">
            <span class="smallnote">
              <fmt:message key="query.filterValue.wildcardHint"/>
            </span>
          </td>
        </tr>
      </c:if>
    </table>
  </c:when>
  <c:otherwise>

<!-- lookup constraint -->
<c:if test="${!empty keyFields}">
<p style="text-align: left;">
    <fmt:message key="query.lookupConstraintLabel"/><%--Search for:--%>
    <html:hidden property="attributeOp" styleId="attribute1" value="18" disabled="false" />
    <html:text property="attributeValue" styleId="attribute2"
    value="${editingConstraintValue}"
    onkeypress="if(event.keyCode == 13) {$('attribute').click();return false;}"/>
    <c:if test="${!empty options}">
    <html:select property="attributeOptions" styleId="attribute3" onchange="this.form.attributeValue.value=this.value;">
    <c:forEach items="${options}" var="option">
    <option value="${option}"
    <c:if test="${editingConstraintValue == option}">
    selected
</c:if>
>
<c:out value="${option}"/>
</option>
</c:forEach>
</html:select>
</c:if>
<html:submit property="attribute" styleId="attributeSubmit" disabled="false" >
<fmt:message key="query.submitConstraint"/><%--Add to query--%>
</html:submit>
</p>
<p style="text-align: left;">
    <span class="smallnote">
        <fmt:message key="query.lookupConstraintHelp"><%--This will search...--%>
        <fmt:param value="${keyFields}"/>
    </fmt:message>
</span>
</p>
<c:choose>
<c:when test="${haveExtraConstraint}">
<p style="text-align: left;">
    <fmt:message key="bagBuild.extraConstraint">
    <fmt:param value="${extraBagQueryClass}"/>
</fmt:message>
<html:select property="extraValue" value="${editingConstraintExtraValue}">
<html:option value="">Any</html:option>
<c:forEach items="${extraClassFieldValues}" var="value">
<html:option value="${value}">
<c:out value="${value}"/>
</html:option>
</c:forEach>
</html:select>
</p>
</c:when>
<c:otherwise>
<html:hidden property="extraValue" value=""/>
</c:otherwise>
</c:choose>
</c:if>

<c:if test="${editingNode.indentation != 0 && !empty SUBCLASSES[editingNode.type]}">


<!-- SUBCLASS -->

<c:if test="${! empty displayConstraint.fixedOpIndices}">
<h5><fmt:message key="query.or"/></h5>
</c:if>

<h4>
    <a href="javascript:swapInputs('subclass');">
        <img id='subclassToggle' src="images/undisclosed.gif"/>
        <fmt:message key="query.filterSubclass"/><%--Filter query results based on this field being a member of a specific class of objects.--%>
    </a>
</h4>

<p style="text-align: left;">
    <fmt:message key="query.subclassConstraint"/><%--Constraint to be subtype:--%>
    <html:select property="subclassValue" styleId="subclass1" disabled="true">
    <c:forEach items="${SUBCLASSES[editingNode.type]}" var="subclass">
    <html:option value="${subclass}">
    <c:out value="${subclass}"/>
    </html:option>
</c:forEach>
</html:select>
<html:submit property="subclass" styleId="subclassSubmit" disabled="true">
<fmt:message key="query.submitConstraint"/><%--Add to query--%>
</html:submit>
</p>

<c:if test="${empty displayConstraint.fixedOpIndices && empty keyFields}">
<script type="text/javascript">
swapInputs('subclass');
</script>
</c:if>

</c:if>
<c:if test="${!empty loopQueryPaths && !empty loopQueryOps}">

<!-- QUERY LOOP -->
<h5><fmt:message key="query.or"/></h5>

<h4>
    <a href="javascript:swapInputs('loopQuery');">
        <img id='loopQueryToggle' src="images/undisclosed.gif"/>
        <fmt:message key="query.filterLoopQuery"/><%--Filter query results on the query loop.--%>
    </a>
</h4>
<p style="text-align: left;">
    <fmt:message key="query.loopQueryConstraint"/><%--Constraint to another field:--%>
    <html:select property="loopQueryOp" styleId="loopQuery1" disabled="true">
    <c:forEach items="${loopQueryOps}" var="loopOp">
    <html:option value="${loopOp.key}">
    <c:out value="${loopOp.value}"/>
    </html:option>
</c:forEach>
</html:select>
<html:select property="loopQueryValue" styleId="loopQuery2" disabled="true">
<c:forEach items="${loopQueryPaths}" var="loopPath">
<html:option value="${loopPath}">
<c:out value="${fn:replace(loopPath, '.', ' > ')}"/>
</html:option>
</c:forEach>
</html:select>

<html:submit property="loop" styleId="loopQuerySubmit" disabled="true">
<fmt:message key="query.submitConstraint"/><%--Add to query--%>
</html:submit>
</p>
</c:if>
</c:otherwise>
</c:choose>

<c:if test="${(!empty bags) || (!editingNode.collection && !editingNode.reference &&
    !empty editingNode.parent && editingNode.type != 'boolean')}">
<div id="optionstoggle" style="background-color:#1863B8;color:#FFF;padding:5px;margin:15px 0;cursor:pointer;"><img id='advanced_toggle' src="images/undisclosed.gif"/>&nbsp;<strong>Advanced Options</strong></div>
<div id="options${editingNode.fieldName}" style="display:none; background-color:#00F3FF;padding:5px">

    <c:if test="${!empty bags}">

    <!-- BAGS -->
    <h5><fmt:message key="query.or"/></h5>

    <h4>
        <a href="javascript:swapInputs('bag');">
            <img id='bagToggle' src="images/undisclosed.gif"/>
            <fmt:message key="query.filterBag"/><%--Filter query results on the contents of your bag--%>
        </a>
    </h4>

    <p style="text-align: left;">
        <fmt:message key="query.bagConstraint"/><%--Contained in bag:--%>
        <html:select property="bagOp" styleId="bag1" disabled="true">
        <c:forEach items="${bagOps}" var="bagOp">
        <html:option value="${bagOp.key}">
        <c:out value="${bagOp.value}"/>
        </html:option>
    </c:forEach>
    </html:select>
    <html:select property="bagValue" styleId="bag2" disabled="true">
    <c:forEach items="${bags}" var="bag">
    <html:option value="${bag.key}">
    <c:out value="${bag.key}"/>
    </html:option>
</c:forEach>
</html:select>
<tiles:insert name="tagSelect.tile">
<tiles:put name="type" value="bag" />
<tiles:put name="onChangeFunction" value="filterByTag" />
<tiles:put name="selectId" value="bag3" />
<tiles:put name="disabled" value="true" />
</tiles:insert>
<html:submit property="bag"  styleId="bagSubmit" disabled="true">
<fmt:message key="query.submitConstraint"/><%--Add to query--%>
</html:submit>
</p>
</c:if>


<c:if test="${(!editingNode.collection && !editingNode.reference &&
    !empty editingNode.parent && editingNode.type != 'boolean')}">
    <!-- NULL OR NOT -->
    <h5><fmt:message key="query.or"/></h5>

    <h4>
        <a href="javascript:swapInputs('empty');">
            <img id='emptyToggle' src="images/undisclosed.gif"/>
            <fmt:message key="query.filterEmpty"/><%--Filter query results on this field having any value or not.--%>
        </a>
    </h4>


    <p style="text-align: left;">
        <html:radio property="nullConstraint" styleId="empty1" value="NULL" disabled="true" /><fmt:message key="query.constraint.null"/>
        <html:radio property="nullConstraint" styleId="empty2" value="NotNULL" disabled="true" /><fmt:message key="query.constraint.notnull"/>
        &nbsp;
        <html:submit property="nullnotnull" styleId="emptySubmit" disabled="true">
        <fmt:message key="query.submitConstraint"/><%--Add to query--%>
        </html:submit>
    </p>
</c:if>
</div>
</c:if>
<%--${loopQueryOJ != true}--%>
  <c:if test="${(!editingPath.onlyAttribute)}" >
    <c:if test="${allowOuterJoin}">
      <h3><fmt:message key="query.joinHeading" /></h3> <%--2. Join type--%>
      <ol style="list-style:none">
        <li>
          <html:radio property="joinType" value="inner" styleId="inner" />
          <label for="inner">&nbsp;
            <fmt:message key="query.innerJoin">
              <fmt:param value="${editingPath.secondLastClassDescriptor.unqualifiedName}"/>
              <fmt:param value="${editingPath.lastClassDescriptor.unqualifiedName}"/>
            </fmt:message>                 
            <img border="0" src="images/join_inner.png" width="13" height="13" title="Inner join"/>
          </label>
        </li>
        <li>
          <html:radio property="joinType" value="outer" styleId="outer"/>
          <label for="outer">&nbsp;
            <fmt:message key="query.outerJoin">
              <fmt:param value="${editingPath.secondLastClassDescriptor.unqualifiedName}"/>
              <fmt:param value="${editingPath.lastClassDescriptor.unqualifiedName}"/>
            </fmt:message>
            <img border="0" src="images/join_outer.png" width="13" height="13" title="Outer join"/>
          </label>
        </li>
      </ol>
      <html:hidden property="useJoin" value="true"/>
      <c:if test="${! empty joinStyleOnly}">
        <html:submit property="joinStyle" styleId="joinStyleSubmit" >
          <fmt:message key="query.submitConstraint"/><%-- Submit button --%>
        </html:submit>
      </c:if>
    </c:if>
  </c:if>
</div>

<script type="text/javascript">
<!--
initConstraintForm(0,
    $('mainForm').attributeOp,
    $('mainForm').attributeOptions,
    $('mainForm').attributeValue,
    fixedOps);

    jQuery("#optionstoggle").click(function () {
        if (jQuery("#options${editingNode.fieldName}").is(":hidden")) {
           jQuery("#options${editingNode.fieldName}").slideDown("slow");
        } else {
            jQuery("#options${editingNode.fieldName}").hide();
        }
    });


    //-->
    </script>

</div>
<%--
<div class="body" style="text-align:right">
    <span id="cancelButton"></span>
    <script language="JavaScript">
        <!--
        <c:if test="${param.deletePath}">
            <c:set var="deletePath" value="${param.deletePath}"/>
        </c:if>
        <c:choose>
        <c:when test="${!empty deletePath}">
        $('cancelButton').innerHTML='<input type="button" onclick="window.location.href=\'<html:rewrite action="/mainChange?method=removeNode&amp;path=${deletePath}"/>\'" value="<fmt:message key="query.cancelConstraint"/>"/>';
    </c:when>
    <c:otherwise>
    $('cancelButton').innerHTML='<input type="button" onclick="window.location.href=\'<html:rewrite action="/query"/>?cancel\'" value="<fmt:message key="query.cancelConstraint"/>"/>';
</c:otherwise>
</c:choose>
//-->
</script>
</div>
--%>
</c:if>
</html:form>
</div>

<!-- /mainConstraint.jsp -->

