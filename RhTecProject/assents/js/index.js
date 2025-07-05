'use strict';
  
      
    const limparFormulario = () => {
                document.getElementById('endereco').value = '';
                document.getElementById('numero').value = '';
                document.getElementById('Bairro').value = '';
                document.getElementById('Cidade').value = '';
                document.getElementById('Estado').value = '';

        }


    const preencherFormulario = (endereco) =>{
                document.getElementById('endereco').value = endereco.logradouro;
                document.getElementById('numero').value = ''
                document.getElementById('Bairro').value = endereco.bairro;
                document.getElementById('Cidade').value = endereco.localidade;
                document.getElementById('Estado').value = endereco.uf;
        };
  
        

    const pesquisarCep =  async() => {
   
   
        try{
    const cep = document.getElementById('CEP').value;
    const url = `https://viacep.com.br/ws/${cep}/json/`
    const regexcep = /^[0-9]{8}$/; 
   
    if  (!regexcep.test(cep)){
        document.getElementById('CEP').value = 'Formato invalido!'
        console.error("CEP não encontrado!")
        limparFormulario();
        return;
}
      const dados =  await fetch(url);
      const endereco = await dados.json();   
    
     if (endereco.hasOwnProperty('erro')){
        document.getElementById('CEP').value = 'CEP não encontrado!'
        console.error("CEP não encontrado!")
        limparFormulario();
        return;
}
        preencherFormulario(endereco); 
        console.log(endereco);

}catch(error){
    console.error("Erro ao buscar cep : " ,error);
    limparFormulario();
 }
};
document.getElementById('CEP')
.addEventListener('focusout',pesquisarCep); 


const preencherCadastro = async(event) =>{
    event.preventDefault();
    try{
        
        
        const nome = document.getElementById('Nome').value;
        const email = document.getElementById('email').value;
        const senha = document.getElementById('Senha').value;
        const cep = document.getElementById('CEP').value.replace(/\D/g, '');
        const endereco = document.getElementById('endereco').value;
        const numero = document.getElementById('numero').value;
        const bairro = document.getElementById('Bairro').value;
        const cidade = document.getElementById('Cidade').value;
        const estado = document.getElementById('Estado').value;

        const dadosFuncionarios ={
            nome: nome,
            email: email,
            senha: senha,
            cep: cep,
            endereco: endereco,
            numero: numero,
            bairro: bairro,
            cidade: cidade,
            estado: estado
        };

        console.log("enviando dados para api: ", dadosFuncionarios)

        const apiresposta = await fetch('http://localhost:8080/api/rhtecfuncionarios', {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(dadosFuncionarios)
        });

        if (apiresposta.ok){
            const funcionarioCriado = await apiresposta.json();
            alert("Funcionario Cadastrado!");
            document.getElementById('formcadastroFuncionario').reset();
        } else{
            const erroTexto = await apiresposta.text();
            alert("Erro ao cadastrar funcionário :" + erroTexto);
        }

    } catch(error){
        alert("Erro na conexão com a API.");
        console.error("Erro:", error);
    }
}


document.getElementById('formcadastroFuncionario')
.addEventListener('submit',preencherCadastro);

const API_URL = "http://localhost:8080/api/funcinarios-cargos";

// Quando carregar a página
document.addEventListener("DOMContentLoaded", () => {
  listarVinculos();

  document.getElementById("form-vinculo").addEventListener("submit", (e) => {
    e.preventDefault();
    criarVinculo();
  });
});

// Criar vínculo funcionário-cargo
async function criarVinculo() {
  const funcionarioId = document.getElementById("funcionarioId").value;
  const cargoId = document.getElementById("cargoId").value;
  const detalhes = document.getElementById("detalhes").value;
  const dataInicio = document.getElementById("dataInicio").value;
  const dataFim = document.getElementById("dataFim").value;

  const vinculo = {
    funcionarioKey: { id: funcionarioId },
    cargoKey: { id: cargoId },
    detalhes,
    dataInicio,
    dataFim
  };

  try {
    const response = await fetch(API_URL, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(vinculo)
    });

    if (response.ok) {
      alert("Vínculo criado com sucesso!");
      listarVinculos();
      document.getElementById("form-vinculo").reset();
    } else {
      alert("Erro ao criar vínculo");
    }
  } catch (err) {
    console.error(err);
  }
}

// Listar vínculos
async function listarVinculos() {
  const tbody = document.getElementById("tabela-vinculos");
  tbody.innerHTML = "";

  try {
    const response = await fetch(API_URL);
    const vinculos = await response.json();

    vinculos.forEach((v) => {
      const row = document.createElement("tr");
      row.innerHTML = `
        <td>${v.id}</td>
        <td>${v.funcionarioKey?.id}</td>
        <td>${v.cargoKey?.id}</td>
        <td>${v.detalhes}</td>
        <td>${v.dataInicio}</td>
        <td>${v.dataFim ?? "-"}</td>
        <td>
          <button onclick="editarVinculo(${v.id})">Editar</button>
          <button onclick="removerVinculo(${v.id})">Remover</button>
        </td>
      `;
      tbody.appendChild(row);
    });
  } catch (err) {
    console.error("Erro ao carregar vínculos:", err);
  }
}

// Editar vínculo
async function editarVinculo(id) {
  const novoDetalhe = prompt("Digite novo detalhe:");

  if (!novoDetalhe) return;

  try {
    const responseGet = await fetch(`${API_URL}/${id}`);
    const vinculo = await responseGet.json();

    vinculo.detalhes = novoDetalhe;

    const responsePut = await fetch(`${API_URL}/${id}`, {
      method: "PUT",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(vinculo)
    });

    if (responsePut.ok) {
      alert("Vínculo atualizado com sucesso");
      listarVinculos();
    } else {
      alert("Erro ao atualizar");
    }
  } catch (err) {
    console.error("Erro ao editar:", err);
  }
}

// Remover vínculo
async function removerVinculo(id) {
  if (!confirm("Tem certeza que deseja remover este vínculo?")) return;

  try {
    const response = await fetch(`${API_URL}/${id}`, {
      method: "DELETE"
    });

    if (response.ok) {
      alert("Removido com sucesso");
      listarVinculos();
    } else {
      alert("Erro ao remover");
    }
  } catch (err) {
    console.error("Erro ao deletar:", err);
  }
}