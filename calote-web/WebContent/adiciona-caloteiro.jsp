<meta charset="UTF-8">
<%@ include file="includes.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Adiciona Caloteiro</title>
</head>
<body>
<c:import url="cabecalho.jsp"/>
<hr>
	Usuário Logado: ${usuarioLogado.nome }
<hr>
<form action="sistema" method="post" id="formAdicionaCaloteiro">
	<input type="hidden" value="AdicionaCaloteiro" name="logica">
	<triadTag:campoTexto campoName="nome" label="Nome:" id="labelNome"></triadTag:campoTexto><br>
	<triadTag:campoTexto campoName="email" label="Email:" id="labelEmail"></triadTag:campoTexto><br>
	<triadTag:campoTexto campoName="devendo" label="Devendo:" id="labelDevendo"></triadTag:campoTexto><br>
	<triadTag:campoTexto campoName="dataDivida" label="Data da Divida" id="labelData"></triadTag:campoTexto><br>
	<input type="submit" value="Salvar">
</form>
<c:import url="rodape.jsp"/>
</body>

<script src="js/jquery-2.1.0.min.js"></script>
<script src="js/jquery.maskMoney.min.js"></script>
<script src="js/jquery.validate.min.js"></script>
<script src="js/mascara-validacoes.js"></script>
</html>