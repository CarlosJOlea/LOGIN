var cuentas = '';

function guardar() {

    var _nom = document.getElementById("nom").value;
    var _ced = document.getElementById("ced").value;

    
    document.getElementById("ced").value = "";

    var fila = "<tr><td>" + _nom + "</td><td>" + _ced + "</td></tr>";

    var btn = document.createElement("TR");
    btn.innerHTML = fila;
    document.getElementById("tablita").appendChild(btn);

}

var input = document.getElementById("ced");
input.addEventListener("keyup", function (event) {
    if (event.keyCode === 13) {
        event.preventDefault();
        document.getElementById("btn_guardar").click();
     
    }
});
