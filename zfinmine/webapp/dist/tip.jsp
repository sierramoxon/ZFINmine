<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- tip.jsp -->
  <h3>Did you know?</h3>
  <a href="/${WEB_PROPERTIES['webapp.path']}/tip.do?id=${randomTip}" target="_top"><img src="<html:rewrite page="/tips/images/tip${randomTip}.png" />" title="Click here to read more of this entry" border="0" height="16" width="16" /></a>&nbsp;&nbsp;
  <jsp:include page="tips/tip${randomTip}_short.jsp"/>&nbsp;<html:link action="/tip?id=${randomTip}" target="_top">Read more ...</html:link>

<!-- /tip.jsp -->
