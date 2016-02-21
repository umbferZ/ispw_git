<%--
  Created by IntelliJ IDEA.
  User: Francesco
  Date: 08/02/16
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista Promozioni</title>
    <link rel="stylesheet" href="../css/materialize.min.css">
</head>
<body>

<jsp:include page="../includes/header.jsp"/>

<br>
<div class="container">
    <h5>Lista di promozioni attive</h5>
</div>
<br>
<div class="container">
    <table class="striped" id="eventTable">
        <thead>
        <tr>
            <th data-field="id">Evento</th>
            <th data-field="name">Data e ora</th>
            <th data-field="modify"></th>
        </tr>
        </thead>

        <tbody>
        <tr>
            <td>Vasco Rossi - LiveKOM016</td>
            <td>22-23/06/2016 ore 21:15</td>
            <td><form method="post" action="UCPromozioni01Adesione.jsp">
                <button class="btn waves-effect waves-light" type="submit" name="action">Modifica</button>
            </form></td>

        </tr>
        <tr>
            <td>Rugby SixNations2016 - Italy France</td>
            <td>27/02/2016 ore 15:00</td>
            <td><form method="post" action="UCPromozioni01Adesione.jsp">
                <button class="btn waves-effect waves-light" type="submit" name="action">Modifica</button>
            </form></td>
        </tr>
        </tbody>
    </table>
</div>
<script src="../js/materialize.min.js"></script>
<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
</body>
</html>
