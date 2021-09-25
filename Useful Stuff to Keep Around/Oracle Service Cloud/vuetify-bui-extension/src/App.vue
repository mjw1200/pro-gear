<template>
  <div>
    <SearchBox v-bind:extensionGlobalContext="extensionGlobalContext" v-bind:workspaceRecord="workspaceRecord"/>
  </div>
 </template>

<script>
import SearchBox from './components/SearchBox'

export default {
  name: 'App',
  props : {
    extensionGlobalContext : null,
    workspaceRecord : null
  },
  components : {
    SearchBox
  },
  data () {
    return {
      items : [
        {"Description" : "Julie's friend Tyler", "ModelNumber" : 5},
        {"Description" : "Julie's friend Chase", "ModelNumber" : 12},
        {"Description" : "Liam", "ModelNumber" : 11},
        {"Description" : "Julie", "ModelNumber" : 13},
        {"Description" : "Liam's friend Jesse", "ModelNumber" : 7},
        {"Description" : "Fight Club narrator Tyler", "ModelNumber" : 2},        
      ],
      prods : [
        {"ID" : 1, "ModelNumber" : "WD10EARS-00Y5B1", "SerialNumber" : "WCAV55011322", "Description" : "DCM WESTERN DIGITAL SATA 3.5 HARD DRIVE", "Caution" : ["OOR", "OEM"]},
        {"ID" : 2, "ModelNumber" : "WD10EARS-00Y5B1", "SerialNumber" : "WCAV55097925", "Description" : "DCM WESTERN DIGITAL SATA 3.5 HARD DRIVE", "Caution" : ["OOW"]},
        {"ID" : 3, "ModelNumber" : "WDCA039RNN", "SerialNumber" : "", "Description" : "CABLE ASSEMBLY, USB TYPE A TO USB MINI-B, 1250MM DARK GREY", "Caution" : []},
        {"ID" : 4, "ModelNumber" : "WDBY8K0000NBK-WRSN", "SerialNumber" : "", "Description" : "WD USB 3.1 CABLE TYPE-C TO MICRO-B, MY BOOK", "Caution" : []}
      ],
      selectedProds : []
    }
  }
}
</script>
