function consumirEndpoint() {
  var codigo = document.getElementById("codigo").value;

  var fetchOptions = {
    method: 'GET',
    headers: {
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*'
    },
    mode: 'cors',
    cache: 'default'
  };

  fetch("https://200.105.154.18:5901/api/Alumnos/" + codigo, fetchOptions)
    .then(function(response) {
      return response.json();
    })
    .then(function(data) {
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
    .catch(function(error) {
      console.log("Error:", error);
    });
}

