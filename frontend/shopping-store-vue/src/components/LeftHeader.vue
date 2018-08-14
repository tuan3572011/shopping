<template>
  <aside id="leftHeader" class="sidebar">
    <div data-content-field="site-title">
      <h1  id="logo">
      <a href="/">
        <img :src="logo" v-bind:alt="name">
        <!-- <h1 style="letter-spacing: 0.153846em;">{{name}}</h1> -->
      </a>
      </h1>
      <p id="siteTagline" data-content-field="site-tagline">{{moto}}</p>
    </div>
    <Nav></Nav>
  </aside>
</template>

<script>
import Nav from "./Nav.vue";
export default {
  components:{
    Nav
  },
  data: function() {
    return {
      logo: require("../assets/img/logo.png"),
      name: "Grain Craft Bar + Kitchen",
      moto: "Great food. Great drinks. Great music.",
      mainMenus: [
        {
          id: 1,
          name: "Newark",
          isCollection: true,
          link: "/newark"
        },
        {
          id: 2,
          name: "Kennett SQ.",
          isCollection: true,
          link: "/kennett"
        },
        {
          id: 3,
          name: "Summit N.",
          isCollection: true,
          link: "/summit"
        },
        {
          id: 4,
          name: "Theme.",
          isCollection: false,
          link: "/theme"
        }
      ]
    };
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.sidebar {
  font-size: 15px;
  background: transparent;
  width: 28.575%;
  position: fixed;
  z-index: 10;
  margin: 0;
  top: 3.6rem;
  left: 0;
  bottom: 0;
  box-sizing: border-box;
  /* border-right: 1px solid #eaecef; */
  overflow-y: auto;
}

img {
  max-width: 100%;
}

h1 {
  background: url("../assets/img/logo-bg.png") no-repeat 50% 0;
}

h1 a {
    padding-top: 117px;
    height: 324px;
    display: block;
    text-align: center;
}
a {
    color: #890101;
    text-decoration: none;
    -moz-transition: 0.2s color linear;
    -webkit-transition: 0.2s color linear;
    transition: 0.2s color linear;
}
</style>
