<h2><svg aria-hidden="true" class="octicon octicon-link" height="16" version="1.1" viewBox="0 0 16 16" width="16"></svg></a>Projeto utilizando conceitos de concorrência - Impressora Concorrência</h1>
<h3><svg aria-hidden="true" class="octicon octicon-link" height="16" version="1.1" viewBox="0 0 16 16" width="16"></svg></a>Conceitos de concorrência utilizados: </h3>

<ul>
  <li>
    <p>Threads e seus métodos -> Start, Run, Sleep, Stop e Resume.</p>
  </li>
  <li>
    <p>Evitar problemas: deadlock, starvation, lockout.</p>
  </li>
</ul>

<h3><svg aria-hidden="true" class="octicon octicon-link" height="16" version="1.1" viewBox="0 0 16 16" width="16"></svg></a>Especificações do projeto: </h3>
<ul>
  <li>
    <p>Programa feito para simular impressora em que sua impressão é realizada em paralelo.</p>
  </li>
  <li>
    <p>Dentro da pasta do projeto, existem 3 pastas, sendo elas: Impressos (Arquivos a serem imprimidos), 
    Imprimindo (Arquivos que estão imprimindo), Finalizados (Arquivo que já foram impressos). </p>
  </li>
  <li>
    <p>Os arquivos .txt devem ser colocados na pasta Impressos, para começar a impressão (linha por linha) do mesmo. 
    A impressora realiza apenas 3 impressões por vez, neste caso, se houver mais de 3 arquivos na pasta, a impressão é ordenada por:</p>
    <ul>
      <li>
        <p>1 - Pela prioridade. A prioridade é dada pelo nome do arquivo, o número que se encontra após o hífen (-). Ex.: "doc-1.txt", logo prioridade é 1. 
        A prioridade é dada de ordem crescente. </p>
      </li>
      <li>
        <p>2 - Pelo tamanho. Em caso de não houver prioridade (ou empate), é dada pelo tamanho do arquivo. Os arquivos serão 
        organizados pelo seu tamanho do menor para o maior.</p>
      </li>
    </ul>
  </li>
  <li>
    <p> Os arquivos são automaticamente organizados e ordenados para impressão pelo Runnable,  além de auto-inicializarem para impressão.
  </li>
   <li>
    <p> Os arquivos são movidos para as suas determinadas pastas de acordo com o estado de impressão. Verificar as pastas acima.
  </li>
     <li>
    <p> Em caso do programa ser interrompido, o arquivo que estiver sendo imprimido serão movidos novamente para impressão.
  </li>
   <li>
    <p> Para cada impressão, é possível pausá-las e continuar através da interface gráfica (Netbeans).
  </li>
</ul>

<h3><svg aria-hidden="true" class="octicon octicon-link" height="16" version="1.1" viewBox="0 0 16 16" width="16"></svg></a>Observações: </h3>
<ul>
  <li>
    <p>Apenas realizando impressões com arquivos .txt.</p>
  </li>
  <li>
    <p>Futuramente, projeto poderá ser complementado com aplicação SGBD, alterando a persistência para banco de dados. (Atual arquivos)</p>
  </li>
</ul>
