function consumirAPI() {
  var codigoUsuario = document.getElementById("codigoUsuario").value;
  var apiUrl = `http://backend:3000/api/usuarios/${codigoUsuario}`;

  fetch(apiUrl)
    .then(response => response.json())
    .then(data => {
      var resultadoDiv = document.getElementById("resultado");
      resultadoDiv.innerHTML = "";

      for (var key in data) {
        if (data.hasOwnProperty(key)) {
          var label = document.createElement("label");
          label.innerHTML = key + ": ";
          resultadoDiv.appendChild(label);

          var value = document.createElement("span");
          value.innerHTML = data[key];
          resultadoDiv.appendChild(value);

          resultadoDiv.appendChild(document.createElement("br"));
        }
      }
    })
    .catch(error => {
      console.log('Error:', error);
    });
}

