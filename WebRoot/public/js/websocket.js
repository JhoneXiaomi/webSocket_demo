var websocket = new WebSocket('ws://localhost:8080/ws/mensagens');

websocket.onopen = onopen;
websocket.onclose = onclose;
websocket.onerror = onerror;
websocket.onmessage = onmessage;

function onopen(evt) {
	console.log('onopen');
}

function onclose(evt) {
	console.log('onclose');
}

function onerror(evt) {
	console.log('onerror');
}

function onmessage(evt) {
	console.log('onmessage');
	document.getElementById('mensagemServer').innerHTML = 'Server: ' + evt.data;
}

function sendMessage(message) {
	websocket.send(document.getElementById('mensagem').value);
}