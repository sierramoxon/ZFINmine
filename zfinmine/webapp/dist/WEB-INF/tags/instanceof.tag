<%@ tag body-content="empty" %>
<%@ attribute name="instanceofObject" required="true" type="java.lang.Object"%>
<%@ attribute name="instanceofClass" required="true" %>
<%@ attribute name="instanceofVariable" required="true" %>

<%-- evaluate whether the object is an instance of the class --%>

<%
    String variable = (String) jspContext.getAttribute("instanceofVariable");

    try {
        Object o = jspContext.getAttribute("instanceofObject");
        String c = (String) jspContext.getAttribute("instanceofClass");

        Class clazz = Class.forName(c);

        if (clazz.isInstance(o)) {
            request.setAttribute(variable, "true");
        } else {
            request.setAttribute(variable, "false");
        }
   } catch (Exception e) {
      application.log("instanceof.tag: " + e.getClass() + ": " + e.getMessage());
      request.setAttribute(variable, "");
   }
%>
