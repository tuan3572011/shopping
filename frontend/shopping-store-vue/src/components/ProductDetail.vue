<template>
  <div>
    germansokolov13 commented on Apr 30, 2015 I need an element be repeated as with v-repeat but not for each array element but rather N times where N is some Vue's property of type number. I don't know how to do it with custom directives or components. Maybe
    it would be useful to create some sort of a v-times predefined directive? Or maybe I am missing something? @yyx990803 Member yyx990803 commented on Apr 30, 2015 You can just do v-repeat="10", or it can also be bound to a numeric value: http://vuejs.org/guide/list.html#Iterating_Over_a_Range
    @germansokolov13 germansokolov13 commented on May 1, 2015 Oh, woops, I didn't nitice it. @germansokolov13 germansokolov13 closed this on May 1, 2015 @thehowl thehowl commented on Jul 30, 2017 For those who stumble on this issue while looking for a solution:
    in vue 2 it is actually v-for="n in 10" @dractw dractw commented on Aug 17, 2017 • I found this a few days ago, looking for a solution on how to v-for a large array not entirely, but for N-elements for the first pass: N times v-fo Actually, didn't found
    this in documentations, or didnt seek so good @LinusBorg Member LinusBorg commented on Aug 17, 2017 This repository is deprecated, please use forum.vuejs.org @tuan3572011
  
  </div>
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
  
</style>
