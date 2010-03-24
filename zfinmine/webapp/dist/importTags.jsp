<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="im"%>

<!-- importTags.jsp -->
<html:xhtml/>
<im:body>
  <fmt:message key="importTags.message"/><p>
  <html:form action="/importTags">
    <table cellspacing="0" cellpadding="3" border="0">
    <tr>
      <td align="right" valign="top"><fmt:message key="importTags.xml"/></td>
      <td><html:textarea property="xml" cols="60" rows="20"/></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td align="center">
        <html:submit><fmt:message key="importTags.submit"/></html:submit>
      </td>
    </tr>
    </table>
  </html:form>
</im:body>
<!-- /importTags -->
