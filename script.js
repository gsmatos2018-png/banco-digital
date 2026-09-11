const projetos = [
  {
    nome: "Conta Digital",
    descricao: "Simulação de conta bancária com saldo e operações.",
    link: "#"
  },
  {
    nome: "Dashboard Financeiro",
    descricao: "Resumo de receitas e despesas.",
    link: "#"
  },
  {
    nome: "Calculadora de Juros",
    descricao: "Cálculo de juros simples e compostos.",
    link: "#"
  }
];

const container = document.getElementById("lista-projetos");

projetos.forEach((projeto, index) => {
  const div = document.createElement("div");
  div.classList.add("projeto");

  div.style.opacity = 0;
  div.style.transform = "translateY(20px)";

  div.innerHTML = `
    <h3>${projeto.nome}</h3>
    <p>${projeto.descricao}</p>
    <a href="${projeto.link}" target="_blank">Ver Projeto</a>
  `;

  container.appendChild(div);

  // animação
  setTimeout(() => {
    div.style.transition = "0.5s";
    div.style.opacity = 1;
    div.style.transform = "translateY(0)";
  }, index * 200);
});
