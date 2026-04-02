<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css"   href="style.css">
    </head>
    <body>
        <div class="container">
           <%-- <h2 class="title">Result is: <%= session.getAttribute("result") %> </h2> --%>
            <h2 class="title">Welcome to My Site</h2>
            <p> ${alien} </p>
            <p> Welcome to the ${course} world </p>
        </div>
    </body>
</html>