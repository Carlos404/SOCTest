<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<title>Exames</title>
<style>
table, td, th {border: 1px solid #2c3e50;}
table {border-collapse: collapse;width: 60%;}
th {height: 30px;}
.button-update {background-color: #487eb0;color: #f5f6fa; border-radius: 5px;}
.button-delete {background-color: #EA2027;color: #f5f6fa; border-radius: 5px;}
</style>
</head>
<body>
	<div style="margin-top: 40px;  margin-left: 25%">
		<s:if test="noData==true">
			<table>
				<thead>
					<tr style="background-color: #95a5a6; color:#2f3640;">
						<th>Paciente</th>
						<th>CPF</th>
						<th>Contato</th>
						<th>E-mail</th>
						<th>Resultado Exame</th>
						<th>Ações</th>
					</tr>
				</thead>
				<s:iterator value="consultas">
					<tr>
						<td><s:property value="nome" /></td>
						<td><s:property value="cpf" /></td>
						<td><s:property value="celular" /></td>
						<td><s:property value="email" /></td>
						<td><s:property value="resultado" /></td>
						<td>
							<a href="putConsulta.action?submitType=updatedata&id=<s:property value="id"/>&nome=<s:property value="nome"/>&cpf=<s:property value="cpf"/>&celular=<s:property value="celular"/>&email=<s:property value="email"/>&analise=<s:property value="resultado"/>">
								<button class="button-update">Editar</button>
							</a>
							<a href="deleteConsulta.action?id=<s:property value="id"/>">
								<button class="button-delete">Excluir</button>
							</a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
		<s:else>
			<div style="color: red;">OPS! Algo deu errado.</div>
		</s:else>
	</div>
</body>
</html>