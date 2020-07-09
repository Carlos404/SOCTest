<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>SOC - UPDATE</title>
</head>
<body>
	<s:form method="post" namespace="/product" action="putConsulta">
		<s:textfield label="Nome" name="nome"></s:textfield>
		<s:textfield label="CPF" name="cpf"></s:textfield>
		<s:textfield label="Celular" name="celular"></s:textfield>
		<s:textfield label="Email" name="email"></s:textfield>
		<s:textarea label="Analise" name="analise" rows="5" cols="20"></s:textarea>
		<s:submit value="update" align="left" name="submitType" type="submit"></s:submit>
	</s:form>
	<s:if test="ctr>0">
		<span style="color: red;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
</body>
</html>