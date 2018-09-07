<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
  <title>Developer</title>
</head>
<body>

<h2>Enter numbers for summarize</h2>
<form:form method="POST" action="/calcResult">
  <table>
    <tr>
      <td><form:label path="first">Id</form:label></td>
      <td><form:input path="first" /></td>
    </tr>
    <tr>
      <td><form:label path="second">Name</form:label></td>
      <td><form:input path="second" /></td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" value="Submit"/>
      </td>
    </tr>
  </table>
</form:form>
</body>
</html>