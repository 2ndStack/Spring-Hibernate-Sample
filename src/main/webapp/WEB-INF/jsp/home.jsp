<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hore Bisa</title>
    <script type="text/javascript" src="<c:url value='/resources/js/jquery-2.1.1.js'/>"></script>
</head>
<body>
<div id="main">HOREEEE</div>
<br/>
<button id="btn">Click Donk</button>
<script type="text/javascript">
    $(function () {
        $("#btn").click(function(){
            $("#main").text("OKEEE");
        });
    });
</script>
</body>
</html>