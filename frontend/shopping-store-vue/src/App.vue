<template>
  <div id="app">
    <div class="theme-container">
      <TopHeader/>
      <LeftHeader/>
      <div class="page">
        <Content></Content>
        <!-- <div class="product-detail">
                <product-detail></product-detail>
              </div> -->
      </div>
    </div>
  </div>
</template>

<script>
  import TopHeader from "./components/TopHeader.vue";
  import LeftHeader from "./components/LeftHeader.vue";
  import Nav from "./components/Nav.vue";
  import Content from "./components/Content.vue";
  import ProductDetail from "./components/ProductDetail.vue";
  
  export default {
    name: "app",
    components: {
      LeftHeader,
      TopHeader,
      Nav,
      Content,
      ProductDetail
    }
  };
</script>

<style>
  .topnav,
  .sidebar-mask {
    position: fixed;
    top: 0;
    left: 0;
  }
  
  .page {
    padding-left: 22%;
  }
  
  .product-list {
    padding-top: 100px;
  }
  
  #app {
    font-family: "Avenir", Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-left: 0px;
    margin-right: 0px;
    height: 100%;
  }
  
  html {
    -ms-text-size-adjust: 100%;
    -webkit-text-size-adjust: 100%;
    position: absolute;
    height: 100%;
    overflow: hidden;
  }
  
  body {
    margin: 0;
    font: 16px/1 sans-serif;
    -moz-osx-font-smoothing: grayscale;
    -webkit-font-smoothing: antialiased;
    height: 100%;
    overflow: auto;
  }
  
  h1,
  h2,
  h3,
  h4,
  p,
  blockquote,
  figure,
  ol,
  ul {
    margin: 0;
    padding: 0;
  }
  
  main,
  li {
    display: block;
  }
  
  h1,
  h2,
  h3,
  h4 {
    font-size: inherit;
  }
  
  strong {
    font-weight: bold;
  }
  
  a,
  button {
    color: inherit;
    transition: 0.3s;
  }
  
  a {
    text-decoration: none;
  }
  
  button {
    overflow: visible;
    border: 0;
    font: inherit;
    -webkit-font-smoothing: inherit;
    letter-spacing: inherit;
    background: none;
    cursor: pointer;
  }
  
   ::-moz-focus-inner {
    padding: 0;
    border: 0;
  }
  
   :focus {
    outline: 0;
  }
  
  img {
    max-width: 100%;
    height: auto;
    border: 0;
  }

  html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, font, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td {
    margin: 0;
    padding: 0;
    border: 0;
    outline: 0;
    font-size: 100%;
    vertical-align: baseline;
    background: transparent;
}

body {
    background: #E4E4E4 url("./assets/img/bg.png");
  	-moz-text-shadow: 0 1px 0 rgba(255, 255, 255, 0.8);
	  -webkit-text-shadow: 0 1px 0 rgba(255, 255, 255, 0.8);
}
</style>
