<html>
	<head>
		<script type="text/javascript" src="/public/js/websocket.js"></script>
	</head>
	<body>
		<h1>Client</h1>
		<p>Enviar mensagem para o server:</p>
		<input id="mensagem">
		<button onclick="sendMessage()">Enviar</button>
		
		<p>Mensagem retornada pelo server:</p>
		<span id="mensagemServer"></span>
	</body>
</html>