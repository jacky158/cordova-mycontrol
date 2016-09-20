var exec = require('cordova/exec')
    ;

module.exports = {
  toggleLeftMenu: function () {
      exec(null, null, "MyControl", "toggleLeftMenu", []);
  },
  toggleRightMenu: function () {
      exec(null, null, "MyControl", "toggleRightMenu", []);
  },
  lockMenus: function () {
      exec(null, null, "MyControl", "lockMenus", []);
  },
  unlockMenus: function () {
    exec(null, null, "MyControl", "unlockMenus", []);
  },
  openLeftMenu: function(){
    exec(null, null, "MyControl", "openLeftMenu", []);
  },
  closeLeftMenu: function(){
    exec(null, null, "MyControl", "closeLeftMenu", []);
  },
  openRightMenu: function(){
    exec(null, null, "MyControl", "openRightMenu", []);
  },
  closeRightMenu: function(){
    exec(null, null, "MyControl", "closeRightMenu", []);
  }
};
