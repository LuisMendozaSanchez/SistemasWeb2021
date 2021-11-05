function boton4() {
    window.alert('envíar4');
}

//Definimos una variable la cual "apunta" a un elemento HTML identificado por su ID
var btnEnviar1 = document.getElementById('btnEnviar1');
btnEnviar1.style.color="pink";

//Se agrega un listener para achar el evento click en el botón
//La acción que ocurrirá al dar click la ejecutará una funcion anónima
btnEnviar1.addEventListener('click', function(){
    window.alert('enviar1');
    cambiarColor();
    cambiarEstado();
});

var emailHelp = document.getElementById('emailHelp');
function cambiarColor(color){
    emailHelp.style.color=color;   
}
function cambiarEstado(estado){
    var exampleCheck = document.getElementById("exampleCheck1").checked = estado;
}

var btnEnviar5 = document.getElementById('btnEnviar5');
btnEnviar5.addEventListener('click', callback);

function callback(){
    window.alert("Enviar5");
    cambiarColor("green");
    cambiarEstado(true);
}