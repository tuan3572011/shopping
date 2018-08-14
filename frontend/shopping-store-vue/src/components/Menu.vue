<template>
      <li  v-bind:class="{ 'folder-collection folder': menu.isCollection }" v-on:mouseover="showSubMenu" v-on:mouseleave="hideSubMenu" >
        <a aria-haspopup="true" v-bind:href="menu.link">{{menu.name}}</a>
             <ul v-show="isExpand">  
                <li v-for="subMenu in subMenus"  v-bind:key='subMenu.name'>
                    <a v-bind:href="subMenu.link">
                        {{subMenu.name}}
                    </a>
                </li>
            </ul>
      </li>
</template>

<script>
export default {
  props: ["menu", "subMenus"],
  data: function() {
    return {
      isExpand: false
    };
  },
  methods: {
    showSubMenu: function() {
      this.isExpand = true;
    },
    hideSubMenu: function() {
      this.isExpand = false;
    }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
li.first a {
  border-top: 1px solid #fff9ef;
  padding-top: 1.25em;
}
ul.left-menu a {
  background: url("../assets/img/ornament.png") no-repeat 0 100%;
  font: bold 14px/1.2 "Book Antiqua", "Palatino Linotype", Georgia, serif;
  display: block;
  text-align: center;
  letter-spacing: 0.1em;
  padding: 1em 0.5em 3em;
  padding-top: 1em;
  margin-bottom: -1em;
  text-transform: uppercase;
}

ul.left-menu a:hover {
    background-position: 50% 100%;
}

ul.left-menu i {
    font: normal 10px Baskerville, Garamond, Palatino, "Palatino Linotype", "Hoefler Text", "Times New Roman", serif;
    display: block;
    letter-spacing: 0.05em;
}

a {
  color: #890101;
  text-decoration: none;
  -moz-transition: 0.2s color linear;
  -webkit-transition: 0.2s color linear;
  transition: 0.2s color linear;
}

a:hover {
    color: #DF3030;
}
</style>
