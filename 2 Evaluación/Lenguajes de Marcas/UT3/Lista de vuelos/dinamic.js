window.onload = function() {
    function update_time() {
        var now = new Date();
        var hours = now.getHours();
        var minutes = now.getMinutes();
        var sign = hours >= 12 ? "PM" : "AM";
        hours = hours % 12;
        hours = hours ? hours : 12; // the hour '0' should be '12'
        minutes = minutes < 10 ? "0" + minutes : minutes;
        var time = hours + ":" + minutes + " " + sign;
        document.getElementById("current_time").innerHTML =
            "Current time: " + time + " GMT+1";
    }

    // Lanza la actualización de la hora cada minuto.
    window.setInterval(update_time, 60000);
    update_time();
    let filaTablaVuelos = document.getElementById("flight-1");
    let addFlightButton = document.getElementById("add-flight-button");
    let removeAllButton = document.getElementById("remove-all-button");

    addFlightButton.addEventListener("click", function(){
        addFlight();
    });
    removeAllButton.addEventListener("click", function(){
        removeAll();
    });

    document.getElementById("flights-list").addEventListener("click", function(event){
        let flightId = event.target.parentElement.parentElement.id;
        if(event.target.classList.contains("remove-button")){
            removeFlight(flightId);
        } else if (event.target.classList.contains("change-status")){
            changeFlightStatus(flightId);
        }
    });

    // Número de vuelos en la tabla.
    var flightsAmount = 3;

    function removeAll() {
        let confirmacion = confirm("¿Estás seguro de que quieres borrar todos los vuelos?");
        if(confirmacion){
            for(vuelo of document.querySelectorAll(".flight")){
                console.log(vuelo);
                document.getElementById("flights-list").removeChild(vuelo);
            }
        }
    }

    function changeFlightStatus(flightId) {
        let vuelo = document.getElementById(flightId);
        vuelo.querySelector(".col_remark").textContent = vuelo.querySelector("select").value;
        
    }

    function removeFlight(flightId) {
        let flight = document.getElementById(flightId);
        let confirmacion = confirm("¿Estás seguro de que quieres borrar este vuelo?");
        if(confirmacion){
            flight.parentElement.removeChild(flight);
        }
    }

    function addFlight() {
        let datos = [
            "Terminal "+document.getElementById("new-flight-terminal").value,
            document.getElementById("new-flight-ref").value,
            document.getElementById("new-flight-dest").value,
            document.getElementById("new-flight-time").value,
            document.getElementById("new-flight-gate").value,
            document.getElementById("new-flight-remark").value
        ];
        const inputs = document.getElementById("add-flight").querySelectorAll("input");
        let flightLists = document.getElementById("flights-list");
        let empty = false;
        inputs.forEach(input => {
            if(input.value.trim() === ''){
                empty=true;
            }
        });
        if(empty){
            alert("Faltan datos en la documentación del vuelo.")
        } else {
            let nuevaFila = document.createElement("div");
            let arrayListaVuelos = document.querySelectorAll(".row_data");
            //numero de fila en tabla para gestionar ids
            let numFila = parseInt(arrayListaVuelos[arrayListaVuelos.length-2].id.split('-')[1]);
            nuevaFila = filaTablaVuelos.cloneNode(true);

            //creacion de los id de los diferentes elementos internos de forma dinamica
            nuevaFila.id = arrayListaVuelos.length>1?"flight-"+(numFila+1):"flight-1";
            nuevaFila.querySelector(".col_remark").id = arrayListaVuelos.length>1?"flight-"+(numFila+1)+"-remark":"flight-1-remark";
            nuevaFila.querySelector("select").id = arrayListaVuelos.length>1?"flight-"+(numFila+1)+"-actions":"flight-1-actions";

            //CAMBIO DE DATOS EN LA FILA A AÑADIR Y ANEXIÓN
            let celdasNuevaFila = nuevaFila.querySelectorAll(".cell");
            for(let i=0; i<datos.length; i++){
                celdasNuevaFila[i].textContent=datos[i];
            }
            flightLists.appendChild(nuevaFila);

            //LIMPIEZA INPUTS
            for(inp of inputs){
                inp.value='';
                document.getElementById("new-flight-remark").value = '';
            }
        }
    }
}