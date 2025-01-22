window.onload = function() {

    

    document.body.addEventListener("click", function(e){
        if(e.target.classList.contains("boton_casilla")){
            let x = e.target.id.split("-")[1];
            let y = e.target.id.split("-")[2];
            cambiarPieza(x, y);
        } else if(e.target.classList.contains("reiniciar-tablero")){
            rellenarTablero();
        }
    });
    
    const contenedorTablero = document.getElementById("tablero_ajedrez");
    let piezas = ["-","P","R","C","B","K","Q"];

    function rellenarTablero() {
        if(contenedorTablero.children.length===0){
            let filas=8;
            let columnas=8;
            let tableroMatriz = new Array(filas);
            for(let i=0; i<tableroMatriz.length; i++){
                tableroMatriz[i] = new Array(columnas);
                for(let j=0; j<tableroMatriz[i].length; j++){
                    let casilla= document.createElement("button");
                    casilla.id=`casilla-${i}-${j}`;
                    if((i+j)%2===0){
                        casilla.className = "negra";
                    }else{
                        casilla.className = "blanca";
                    }
                    casilla.classList.add("casilla");
                    casilla.classList.add("boton_casilla");
                    casilla.textContent=piezas[0];
                    contenedorTablero.append(casilla);
                }
            }
        } else {
            for(button of contenedorTablero.children){
                button.textContent=piezas[0];
            }
        }
    }

    function cambiarPieza(coordenadaX, coordenadaY) {
        let casillaAcambiar = document.getElementById(`casilla-${coordenadaX}-${coordenadaY}`);
        for(let i=0; i<piezas.length; i++){
            if(casillaAcambiar.textContent==piezas[piezas.length-1]){
                casillaAcambiar.textContent=piezas[0];
                break;
            } else if (casillaAcambiar.textContent==piezas[i]){
                casillaAcambiar.textContent=piezas[i+1];
                break;
            }
        }
    }

    rellenarTablero();
}