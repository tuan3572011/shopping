<template>
      <nav class="menu" >
        <div class="main-menu">
            <ul class="left-menu">
                <Menu v-for="menu in mainMenus" v-bind:key="menu.id" v-bind:menu="menu" v-bind:subMenus="getSubMenuByMainMenuId(menu.id)" ></Menu>
            </ul>
        </div>
      </nav>
</template>

<script>
import Menu from "./Menu.vue";
export default {
  components: {
    Menu
  },
  data: function() {
    return {
      mainMenus: [
        { id: 1, name: "Newark", isCollection: true, link: "/newark" },
        { id: 2, name: "Kennett SQ.", isCollection: true, link: "/kennett" },
        { id: 3, name: "Summit N.", isCollection: true, link: "/summit" },
        { id: 4, name: "Theme.", isCollection: false, link: "/theme" }
      ],
      mainMenusCollections: [
        {
          id: 1,
          order: 1,
          name: "Newark 1",
          isCollection: false,
          link: "/newark"
        },
        {
          id: 1,
          order: 2,
          name: "Newark 2",
          isCollection: false,
          link: "/kennett"
        },
        {
          id: 1,
          order: 3,
          name: "Newark 3",
          isCollection: false,
          link: "/summit"
        },

        {
          id: 2,
          order: 1,
          name: "Kennett SQ. 1",
          isCollection: false,
          link: "/newark"
        },
        {
          id: 2,
          order: 2,
          name: "Kennett SQ. 2",
          isCollection: false,
          link: "/kennett"
        },
        {
          id: 2,
          order: 3,
          name: "Kennett SQ. 3",
          isCollection: false,
          link: "/summit"
        },

        {
          id: 3,
          order: 1,
          name: "Summit N. 1",
          isCollection: false,
          link: "/newark"
        },
        {
          id: 3,
          order: 2,
          name: "Summit N. 2",
          isCollection: false,
          link: "/kennett"
        },
        {
          id: 3,
          order: 3,
          name: "Summit N. 3",
          isCollection: false,
          link: "/summit"
        }
      ]
    };
  },
  methods: {
    getSubMenuByMainMenuId: function(id) {
      return this.mainMenusCollections
        .filter(menuCollection => menuCollection.id === id)
        .sort((m1, m2) => m1.order < m2.order);
    }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
ul.left-menu {
    border-top: 1px solid #888583;
    margin: 2em auto 0;
    width: 64.379%;
}
ol, ul {
    list-style: none;
}
</style>
