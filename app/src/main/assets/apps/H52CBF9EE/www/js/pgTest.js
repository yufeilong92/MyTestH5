document.addEventListener("plusready", function() {
	// 声明的JS“扩展插件别名”
	var _BARCODE = 'plugintest',
		B = window.plus.bridge;
	var plugintest = {
		PluginTestFunctionSyncArrayArgu: function(Argus) {
			return B.execSync(_BARCODE, "PluginTestFunctionSyncArrayArgu", [Argus]);
		},
		getIntData:function(){
		return B.execSync(_BARCODE,"getIntData",null);
		},
		getbooleanData:function(){
		 return B.execSync(_BARCODE,"getbooleanData",null);
		}

	};
	window.plus.plugintest = plugintest;
}, true)