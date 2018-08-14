<template>
    <li>
      <a v-bind:href="menu.link">{{menu.name}}</a>
      <SubMenuPanel/>
    </li>
</template>

<script>
  import SubMenuPanel from "./SubMenuPanel.vue";
  export default {
    components: {
      SubMenuPanel
    },
    props: ['menu'],
    data: function() {
      return {
        isExpand: false
      }
    },
    methods: {
      showDetail: function() {
        this.isExpand = true;
      },
      hideDetail: function() {
        this.isExpand = false;
      }
    }
  };
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  .menu {
    text-align: left;
  }

  
</style>
