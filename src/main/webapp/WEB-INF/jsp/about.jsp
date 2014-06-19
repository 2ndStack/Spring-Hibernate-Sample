<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ABOUT</title>
</head>
<body>
<h1>ABOUTTTTT</h1>

<c:forEach items="${data}" var="trip">
    <h5>${trip.name}</h5>
    <h5>${trip.description}</h5>
    <h5>${trip.lastUpdated}</h5>
</c:forEach>
</body>
</html>