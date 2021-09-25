import Vue from 'vue'
import './plugins/vuetify'
import App from './App.vue'

Vue.config.productionTip = false
ORACLE_SERVICE_CLOUD.extension_loader.load("RMA Reporter" , "0.1").then(function(extensionProvider) { // eslint-disable-line no-undef
  extensionProvider.getGlobalContext().then(function(ExtensionGlobalContext) {
    extensionProvider.registerWorkspaceExtension(function(WorkspaceRecord) {
      new Vue({
        el: "#app",
        render (createElement) {
          return createElement(App,
            {
              props: {
                extensionGlobalContext:ExtensionGlobalContext,
                workspaceRecord:WorkspaceRecord
              }
            }
          );
        }
      })
    })  
  })
})

