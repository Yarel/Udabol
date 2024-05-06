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

      var table = document.createElement("table");
      table.classList.add("centered");

      for (var key in data) {
        if (data.hasOwnProperty(key)) {
          var row = document.createElement("tr");

          var labelCell = document.createElement("td");
          labelCell.textContent = key;
          row.appendChild(labelCell);

          var valueCell = document.createElement("td");
          valueCell.textContent = data[key];
          row.appendChild(valueCell);

          table.appendChild(row);
        }
      }

      resultadoDiv.appendChild(table);
    })
    .catch(function(error) {
      console.log("Error:", error);
    });
}

