<template>
   <div class="fundo">
    <!-- <div class="page-holder"> -->
      <header>
           <!--BARRA-->
        <ul class="menu-site">
            <li id="nome-site">Serotonina |</li>  
            <li><a href="#titulo1-site">Início</a></li>
            <li><a href="#titulo2-site">Sobre Nós</a></li>
            <li><a href="#titulo3-site">Fale Conosco</a></li>
            <NuxtLink to="/tarefas-2">
            <li><a href="" id="entrar-site">Entrar</a></li>
            </NuxtLink>
           
        </ul>  
      </header>
 
      <!-- <b-container class="bv-example-row"> -->
        <link href="../assets/css/main.css" rel="stylesheet" />
        <!-- <menuHamburguer> </menuHamburguer> -->
 
          <!--PARAGRÁFO-->
          <article>
            <h1 id="titulo1-site">Com Serotonina você se motiva!</h1>
            <b><p id="texto-site">Organize sua vida e tenha acesso à dicas e metodologias
                  para melhorar seu desempenho.</p></b>
          </article>
   
 
          <CarouselSlide/>
 
 
  <!-- SOBRE NÓS -->
  <article class="sobre">
    <h1 id="titulo2-site"><b> Sobre Nós </b></h1>
    <section class="caixatexto-site">
      <div>
        <h2><b> 1. </b></h2>
        <p><b> Quem somos? </b><p>
        <p> Estudantes do Ensino Médio, integrado ao curso    técnico de desenvolvimento de sistemas, do IFSP Bragança Paulista. </p>
      </div>
    </section>
   
    <section class="caixatexto-site">
      <div>
        <h2><b> 2. </b></h2>
        <p><b> Qual é o problema? </b><p>
        <p>A pandemia afetou a rotina de todos e trouxe como consequência transtornos mentais que prejudicam a rotina de muitos.</p>
      </div>
     
    </section>
   
    <section class="caixatexto-site">
      <div>
        <h2><b> 3. </b></h2>
        <p><b> Como podemos ajudar? </b></p>
        <p> Com nosso app suas tarefas são organizadas de maneira simples e fácil. Além de termos conteúdos de dicas para  
         você! </p>
      </div>
     
    </section>
  </article>
 
 
        <!-- FALE CONOSCO -->
        <article class="faleconosco">
        <!-- IMAGEM -->
        <section class="paragrafo-fale-c">
        <img id="celular-site" src="../assets/celular.png"/>
        </section>
 
        <!-- BLOCO -->
        <section class="paragrafo-fale-c">
            <div>
            <h1 id="titulo3-site">Nos mande uma mensagem !</h1>
            <h4 id="mensg-feedback">Escreva sua opinião, sentimento, feedback e muito mais.</h4>
            </div>
 
            <!-- CAIXA TEXTO -->
            <form class="form" method="POST" action="recebe-feedback.php" name="feedback" onsubmit="return validar()">
                <div class="bloco-site">
                    <input type="text" value=""  name="nome" placeholder="Nome"  class="mensagem-site"/>
                    <input type="email" value="" name="email" placeholder="E-mail" class="mensagem-site"/>
                   
                    <textarea rows="10" cols="40" maxlength="500" placeholder="Escreva aqui" class="caixa-texto" name="mensagem"></textarea>
                   
                <input type="submit" value="Enviar" class="enviar-site"/>
                </div>
 
            </form>
           
        </section>
 
        </article>
 
         <!-- RODAPÉ -->
  <footer>
      <div class="rodape">
        <img id="google" src="../assets/googlePlay.jpg" />
     </div>
   
      <div  class="rodape">
        <p>SEROTONINA </p>
      </div>
 
   
    <div class="rodape">
      <img class="icone-site" src="../assets/insta.png"/>
      <img class="icone-site" src="../assets/tt.png"/>
    </div>
   
 
    <div  id="rodape-direitos">
      <p> © 2022 - Todos os direitos reservados. Desenvolvedores Equipe Serotonina</p>
    </div>
 
  </footer>
 
      <!-- </b-container> -->
   </div>
 
</template>
 
 
<script>
 
import CarouselSlide from '../components/CarouselSlide.vue';
 
 
// import menuHamburguer from '~/components/menuHamburguer.vue'
 
export default {
  components: { CarouselSlide },
  // components: { menuHamburguer },
  name: 'index-Tela',
}
 
</script>
 


