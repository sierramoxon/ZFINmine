<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!-- errorMessagesContainers.jsp -->
<link rel="stylesheet" type="text/css" href="css/errorMessages.css"/>
<div>
    <div class="topBar errors" id="error_msg" style="display:none"><span style="float:right;padding:0;margin:0"><img src="images/close.png" alt="Dismiss" title="Dismiss" style="cursor:pointer;" onclick="javascript:jQuery('#error_msg').hide();"></span></div>
    <div class="topBar messages" id="msg" style="display:none"><span style="float:right;padding:0;margin:0"><img src="images/close.png" alt="Dismiss" title="Dismiss" style="cursor:pointer;" onclick="javascript:jQuery('#msg').hide();"></span></div>
    <div class="topBar lookupReport" id="lookup_msg" style="display:none"><span style="float:right;padding:0;margin:0"><img src="images/close.png" alt="Dismiss" title="Dismiss" style="cursor:pointer;" onclick="javascript:jQuery('#lookup_msg').hide();"></span></div>

    <noscript>
      <div class="topBar errors">
        <fmt:message key="errors.noscript"/>
      </div>
      <br/>
    </noscript>

</div>
<!-- /errorMessagesContainers.jsp -->
