import Vue from 'vue'
import App from './App.vue'
import Buefy from 'buefy'
import 'buefy/lib/buefy.css'

Vue.config.productionTip = false
Vue.use(Buefy)
new Vue({
  render: h => h(App)
}).$mount('#app')
