fetch('http://localhost:8080/api/imagens')
.then(response => response.json())
.then(imagens => mostrarImagens([imagens])) 
.catch(error => {
    console.error("Erro ao buscar imagem:", error)
});


function addImage(){
    const nome = document.getElementById('nome').value.trim();
    const url = document.getElementById('url').value.trim();

    if(!nome || !url){
        alert("Preencha todos os campos!");
        return;
    }
    fetch('http://localhost:8080/api/imagens',{
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify({ 
        nome: nome, 
        url: url
    })

})
.then(response => response.json())
.then(data => {
    console.log("Resposta da API:", data);
    
    fetchImagens();

    document.getElementById('nome').value = '';
    document.getElementById('url').value = '';

     Swal.fire({
        icon: 'success',
        title: 'sucesso',
        text: 'Imagem adicionada!'
    });
   
})
.catch(error => {
    console.error("Erro ao enviar dados:", error);
});
}

function fetchImagens(){
    fetch('http://localhost:8080/api/imagens')
    .then(response => response.json())
    .then(imagens => mostrarImagens(imagens))
    .catch(error => {
        console.error("Erro ao buscar imagem :", error);
    });
}
function mostrarImagens(imagens){
    const galeria = document.getElementById('galeriaIMG');
    galeria.innerHTML = '';

    imagens.forEach(imagem => {
        const div = document.createElement('div');
        div.innerHTML = `
        <h3>${imagem.nome}</h3>
        <img src= "${imagem.url}" alt="${imagem.nome}" style = "max-width: 200px;"/> 
        <button onclick = "removerIMG(this)">Remover</button>
        <hr>
        `;
    
     galeria.appendChild(div);
    })
   
}
fetchImagens();
function removerIMG(botao){

    if(confirm("Tem certeza que quer remover?")){
        const div = botao.closest('div');
        div.remove();
    }
    Swal.fire({
        icon: 'question',
        title: 'Voce tem certeza?',
        showCancelButton: 'true',
        confirmButtonText: 'Sim',
        cancelButtonText: 'Não'
    }).then((result) => {
        if(result.isConfirmed){
            const container = botao.closest('div');
            container.remove;
            Swal.fire('Removido', '', 'success')
        }else{
            Swal.fire('Cancelado','','info');
        }
    });
}