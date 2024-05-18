let numrandom=0;
function randomicoAuto(){

    let randomH = document.getElementById("h2Random");
    let btnRandom = document.getElementById("btnrandom");
    btnRandom.addEventListener('click', function() {
        let random = Math.floor(Math.random() * 100 + 1);
        numrandom=random;
        randomH.innerHTML = numrandom;
        changecolorRandom();
    });
}

randomicoAuto();

let numero = document.getElementById("numeroDinamico");
let aumenta = 0;

function AumentaAuto() {
    let btnAumenta = document.getElementById("aumenta");
    btnAumenta.addEventListener('click', function() {
        aumenta++;
        numero.innerHTML = aumenta;
        changecolorAuto();  
    });
}

AumentaAuto();

function diminuisciAuto() {
    let btnDiminuisci = document.getElementById("diminuisci");
    btnDiminuisci.addEventListener('click', function() {
        aumenta--;
        numero.innerHTML = aumenta;
        changecolorAuto(); 
    });
}

diminuisciAuto();

function resetAuto() {
    let btnReset = document.getElementById("reset");
    btnReset.addEventListener('click', function() {
        aumenta = 0;
        numero.innerHTML = aumenta;
        changecolorAuto(); 
    });
}

resetAuto();

let NumeroUtente = 0;
let Appogino = 0;

function sceltaUtente() {
    let btnscelta = document.getElementById("sceltaUtente");
    let numeroUtenteDisplay = document.getElementById("h2Utente");
    btnscelta.addEventListener('click', function() {
        let InputNumero = +prompt("Inserisci il numero");
        if (isNaN(InputNumero)) {
            alert("Inserisci un numero valido");
        } else {
            Appogino = InputNumero;
            NumeroUtente = InputNumero;
            numeroUtenteDisplay.innerHTML = NumeroUtente;
            cambiaColoreUtente();
        }
    });
}

sceltaUtente();

function AumentaUtente() {
    let numeroUtenteDisplay = document.getElementById("h2Utente");
    let btnAumentaUtente = document.getElementById("aumentaUtente");
    btnAumentaUtente.addEventListener('click', function() {
        NumeroUtente++;
        numeroUtenteDisplay.innerHTML = NumeroUtente;
        cambiaColoreUtente();
    });
}

AumentaUtente();

function diminuisciUtente() {
    let numeroUtenteDisplay = document.getElementById("h2Utente");
    let btnDiminuisciUtente = document.getElementById("diminuisciUtente");
    btnDiminuisciUtente.addEventListener('click', function() {
        NumeroUtente--;
        numeroUtenteDisplay.innerHTML = NumeroUtente;
        cambiaColoreUtente();
    });
}

diminuisciUtente();

function resetUtente() {
    let btnReset = document.getElementById("resetUtente");
    let numeroUtenteDisplay = document.getElementById("h2Utente");
    btnReset.addEventListener('click', function() {
        NumeroUtente = Appogino;
        numeroUtenteDisplay.innerHTML = Appogino;
        cambiaColoreUtente();
    });
}

resetUtente();

//Cambiare il div Della classe boxCounterGreen in base al numero
function cambiaColoreUtente() {
    let numeroDisplay3 = document.getElementById("h2Utente");
    let elements = document.getElementsByClassName("BoxCountergreen"); // Ottenere tutti gli elementi della classe BoxCounterRed
    if (NumeroUtente >= 0) {
        numeroDisplay3.classList.remove("numeroNegativo");
        numeroDisplay3.classList.add("numeroPositivo");
        for (let i = 0; i < elements.length; i++) { // Iterare su tutti gli elementi
            elements[i].classList.remove("numeroNegativo");
            elements[i].classList.add("numeroPositivo");
        }
    } else if(NumeroUtente === 0) { //se il numero è uguale a 0 torna grigio
        numeroDisplay3.classList.toggle("numeroNeutro");
        for (let i = 0; i < elements.length; i++) { // Iterare su tutti gli elementi
            elements[i].classList.toggle("numeroNeutro");
        }
    }
    else {
        numeroDisplay3.classList.remove("numeroPositivo");
        numeroDisplay3.classList.add("numeroNegativo");
        for (let i = 0; i < elements.length; i++) { // Iterare su tutti gli elementi
            elements[i].classList.remove("numeroPositivo");
            elements[i].classList.add("numeroNegativo");
        }
    }
}
h2Utente


//Cambiare il div Della classe boxCounterGreen in base al numero
function changecolorAuto() {
    let numeroDisplay3 = document.getElementById("numeroDinamico");
    let elements = document.getElementsByClassName("BoxCounterRed"); // Ottenere tutti gli elementi con la classe BoxCounterRed
    if (aumenta >= 0) {
        numeroDisplay3.classList.remove("numeroNegativo");
        numeroDisplay3.classList.add("numeroPositivo");
        for (let i = 0; i < elements.length; i++) { // Iterare su tutti gli elementi
            elements[i].classList.remove("numeroNegativo");
            elements[i].classList.add("numeroPositivo");
        }
    } else if(aumenta === 0) { //se il numero è uguale a 0 torna grigio
        numeroDisplay3.classList.toggle("numeroNeutro");
        for (let i = 0; i < elements.length; i++) { // Iterare su tutti gli elementi
            elements[i].classList.toggle("numeroNeutro");
        }
    }
    else {
        numeroDisplay3.classList.remove("numeroPositivo");
        numeroDisplay3.classList.add("numeroNegativo");
        for (let i = 0; i < elements.length; i++) { // Iterare su tutti gli elementi
            elements[i].classList.remove("numeroPositivo");
            elements[i].classList.add("numeroNegativo");
        }
    }
}


//Cambiare il div Della classe boxCounterGreen in base al numero del numero random
function changecolorRandom() {
    let numeroDisplay3 = document.getElementById("h2Random");
    let elements = document.getElementsByClassName("BoxCounterRandom"); // Ottenere tutti gli elementi con la classe BoxCounterRed
    if (numrandom >= 0) {
        numeroDisplay3.classList.remove("numeroNegativo");
        numeroDisplay3.classList.add("numeroPositivo");
        for (let i = 0; i < elements.length; i++) { // Iterare su tutti gli elementi
            elements[i].classList.remove("numeroNegativo");
            elements[i].classList.add("numeroPositivo");
        }
    } else if(numrandom === 0) { //se il numero è uguale a 0 torna grigio
        numeroDisplay3.classList.toggle("numeroNeutro");
        for (let i = 0; i < elements.length; i++) { // Iterare su tutti gli elementi
            elements[i].classList.toggle("numeroNeutro");
        }
    }
    else {
        numeroDisplay3.classList.remove("numeroPositivo");
        numeroDisplay3.classList.add("numeroNegativo");
        for (let i = 0; i < elements.length; i++) { // Iterare su tutti gli elementi
            elements[i].classList.remove("numeroPositivo");
            elements[i].classList.add("numeroNegativo");
        }
    }
}
