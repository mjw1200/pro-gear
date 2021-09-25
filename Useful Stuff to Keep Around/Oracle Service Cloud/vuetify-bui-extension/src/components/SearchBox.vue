<template>
  <v-container smoo align-content-start grid-list-md> <!-- "smoo" is a silliness to prove a point. See CSS section -->
    <v-layout row wrap>
      <v-flex>
        <!-- Very long line - don't be afraid to scroll -->
        <v-autocomplete v-model="model" :items="items" item-text="Description" item-value="ModelNumber" :loading="isLoading" :search-input.sync="search" chips clearable hide-details hide-selected return-object label="Search" dense solo></v-autocomplete>
      </v-flex>
    </v-layout>

    <v-layout row>
      <v-flex>
        Selection: {{ model }}
      </v-flex>
    </v-layout>

    <v-layout row>
      <v-btn color="primary" class="black--text" @click="apply()" >
        Apply
      </v-btn>
    </v-layout>
  </v-container>
</template>

<script>
/* eslint-disable no-console */
export default {
  name: 'SearchBox',
  props: {
    extensionGlobalContext : null,
    workspaceRecord : null
  },
  data() {
    return {
      refNo: null,
      isLoading: false,
      items: [        
        {"ID" : 1, "ModelNumber" : "WD10EARS-00Y5B1", "SerialNumber" : "WCAV55011322", "Description" : "DCM WESTERN DIGITAL SATA 3.5 HARD DRIVE", "Caution" : ["OOR", "OEM"]},
        {"ID" : 2, "ModelNumber" : "WD10EARS-00Y5B1", "SerialNumber" : "WCAV55097925", "Description" : "DCM WESTERN DIGITAL SATA 3.5 HARD DRIVE", "Caution" : ["OOW"]},
        {"ID" : 3, "ModelNumber" : "WDCA039RNN", "SerialNumber" : "", "Description" : "CABLE ASSEMBLY, USB TYPE A TO USB MINI-B, 1250MM DARK GREY", "Caution" : []},
        {"ID" : 4, "ModelNumber" : "WDBY8K0000NBK-WRSN", "SerialNumber" : "", "Description" : "WD USB 3.1 CABLE TYPE-C TO MICRO-B, MY BOOK", "Caution" : []}
      ],
      model: null,
      search: null
    }
  },
  methods: {
    apply: function() {
      var j = {modelNumber: this.model};
      window.localStorage.removeItem(this.refNo);
      window.localStorage.setItem(this.refNo, JSON.stringify(j));

      this.globalContext.invokeAction('readCache', {refNo:this.refNo})
      .then(function(result) {
        console.log('typeahead then result');
      })
      .catch(function(error) {
        // TODO: something useful      
      });
    }
  },
  created: function () {
    const comp = this;

    this.workspaceRecord.getFieldValues(['Incident.RefNo']).then(function(fld) {
      if(fld.getField('Incident.RefNo').getValue())
        comp.refNo = fld.getField('Incident.RefNo').getValue();
    });

    this.extensionGlobalContext.registerAction('setTab', function(param) {
      console.log("setTab triggered");
      comp.workspaceRecord.triggerNamedEvent('focusRMATab');
    });    
  },
  watch: {
    search (val) {    
      if(val == null || val.length < 2)
        return;

      if (this.isLoading) return
      this.isLoading = true

      const component = this;
      var arr = [];

      this.$store.dispatch('filterList', val.toLowerCase())
      .then(function(r) {
        r.forEach(function (itm, index) {
          var part = itm.ModelNumber + (itm.Description !== null ? ('-' + itm.Description) : '');
          arr.push({ModelNumber:itm.ModelNumber, Description:part});
        });

        component.items = arr;
      
      })
      .catch(err => {
        console.log(err)
      })
      .finally(() => (this.isLoading = false))
    }
    }
}
</script>

<style>
/*
  Vuetify turns attributes into classes for our convenience...with the exception of data attributes
  https://vuetifyjs.com/en/framework/grid */

.smoo {
  width: 100%;
}
</style>