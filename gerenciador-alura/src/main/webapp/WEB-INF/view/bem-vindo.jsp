<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <body>
  	Bem vindo no curso Servlets da Alura!
  	<br />
     <c:forEach var="i" begin="1" end="10" step="2">
       ${i} <br />
     </c:forEach>
  </body>
</html>