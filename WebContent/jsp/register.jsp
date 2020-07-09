<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Cadastrar - Exame</title>
<style type="text/css">
.button-register {background-color: green;color: white;}
.button-report {background-color: #000000;color: white;margin-left: 30%;}
</style>
</head>
<body>

	
	<a href=getConsulta><button class="button-report" type="button">Exames Cadastrados</button></a>
	<s:form action="postConsulta.action" method="post">
		
		<s:textfield label="nome" name="nome" />
		<s:textfield label="CPF" name="cpf" />
		<s:textfield label="Celular" name="celular" />
		<s:textfield label="Email" name="email" />
		<s:textfield label="Resultado" name="analise" />
				
		<s:submit cssClass="button-register" value="Registrar" />
	</s:form>
	<s:if test="ctr>0">
		<span style="color: green;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
</body>
</html>