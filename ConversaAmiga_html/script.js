const formulario = document.querySelector("form");
const inome = document.querySelector(".nome");
const iemail = document.querySelector(".email");
const itelefone = document.querySelector(".telefone");

function cadastrar(){
    fetch("http://localhost:8080/usuarios",
    {
        headers:{
            'Accept':'aplication/json',
            'Content-Type': 'aplication/json'
        },
        method:"POST",
        body: JSON.stringify(
            {
                nome: inome.value,
                email: iemail.value,
                telefone: itelefone.value
            }
        )
    } )

    .then(function (res) {console.log(res)})
    .catch(function (res) {console.log(res)})
};


function limpar(){
    inome.value =""; 
    iemail.value = "";
    itelefone.value ="";

};


formulario.addEventListener('submit', function (event){
    event.preventDefault();
    
    cadastrar();
    limpar();
});