<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="arquivos/styleOdontoEkip.css" />
<script type="text/javascript" src="arquivos/scriptValidation.js"></script>
</head>
<body>
<fieldset class="pagina">
<h1>:: Plano de tratamento</h1>
<div id="msg">
	<h5 class="information">${msg}</h5>
	<h5 class="error">${msgE}</h5>
</div>
<div id="paciente">
<center>
	<table border="1" width="80%" bordercolor="#5e8ce9">
		<tr>
			<td align="center" bgcolor="#5e8ce9" width="10%"><b>Elemento</b></td>
			<td align="center" bgcolor="#5e8ce9" width="40%"><b>Procedimento</b></td>
			<td align="center" bgcolor="#5e8ce9" width="20%"><b>Face</b></td>
			<td align="center" bgcolor="#5e8ce9" width="20%"><b>Autorização</b></td>
			<td align="center" bgcolor="#5e8ce9" width="10%"><b>Remover</b>
		</tr>
		<c:forEach items="${sessionScope.listaTratamento}" var="colecao">
		<tr>
			<td align="center">${colecao.elemento}</td>
			<td align="center">${colecao.procedimento}</td>
			<td align="center">${colecao.face}</td>
			<td align="center">${colecao.statusAutorizacao}</td>
			<td align="center"><a href="ServletOdontograma?btn=Excluir&index=${colecao.idOdontogramaProcedimento}">Excluir</a></td>
		</tr>	
		</c:forEach>
	</table>
	<form name="formBtn" method="post" action="ServletOdontograma">
		<input type="submit" name="btn" value="Voltar ao odontograma"/>
	</form>	
</center>
</div>
</fieldset>
<c:import url="cabecalho.jsp" />

</body>
</html>