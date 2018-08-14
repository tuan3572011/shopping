<template>
  <header id="topHeader" class="topnav">
    <!-- <div class="content">
      <a href="/" id="logo" class="has-img">
        <h5>{{name}}</h5>
      </a>
      <div class="empty"></div>
      <div class="search-box">
      <input v-model="query" aria-label="Search" />

      </div>
      <div class="links">
        <TopHeaderMenu v-for="menu in mainMenus" :key="menu.name" v-bind:menu="menu"></TopHeaderMenu>
        <label >{{query}}</label>
      </div>
      
    </div> -->
  
  
  </header>
</template>

<script>
import TopHeaderMenu from "./TopHeaderMenu.vue";
export default {
  components: {
    TopHeaderMenu
  },
  data: function() {
    return {
      query: "",
      logo:
        "//static1.squarespace.com/static/58cd4cd646c3c40813a12f1d/t/58d3e62c197aea1d30831344/1531026943630/?format=300w",
      name: "Grain Craft Bar + Kitchen",
      moto: "Great food. Great drinks. Great music.",
      mainMenus: [
        {
          id: 1,
          name: "Category",
          isCollection: true,
          link: "/newark"
        },
        {
          id: 2,
          name: "Product",
          isCollection: true,
          link: "/kennett"
        },
        {
          id: 3,
          name: "Category",
          isCollection: true,
          link: "/summit"
        },
        {
          id: 4,
          name: "Contact",
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
.topnav {
  z-index: 20;
  right: 0;
  height: 3.6rem;
  background: url("../assets/img/rag.png") repeat-x;
  padding: 2em 0;
  box-sizing: border-box;
  /* border-bottom: 1px solid #eaecef; */
  padding: 0.7rem 1.5rem;
  line-height: 2.2rem;
}

.topnav .content {
  display: flex;
}

.topnav .content #logo {
  flex-grow: 1;
  text-align: left;
  letter-spacing: 0.1;
}

.topnav .content #logo h5 {
  line-height: 2.125;
}

.topnav .content .search-box {
  flex-grow: 1;
  display: inline-block;
  position: relative;
  margin-right: 0.5rem;
  max-width: 19.5rem;
}

.topnav .content .links {
  font-size: 1.2rem;
  flex-grow: 5;
  display: flex;
  max-width: 38rem;
}

.topnav .content .empty {
  flex-grow: 2;
}

.topnav .content .links li {
  flex-grow: 1;
  margin-top: 0;
}

.search-box input {
  cursor: text;
  width: 100%;
  color: #4e6e8e;
  display: inline-block;
  border: 1px solid #cfd4db;
  border-radius: 2rem;
  font-size: 0.9rem;
  line-height: 2rem;
  padding: 0 0.5rem 0 2rem;
  outline: none;
  transition: all 0.2s ease;
  background: #fff url("../assets/img/search.svg") 0.6rem 0.5rem no-repeat;
  background-size: auto auto;
  background-size: 1rem;
}
</style>
