document.addEventListener("plusready", function() {
	// 声明的JS“扩展插件别名”
	var _SHOWDATA = 'ShowErro';
	var B = window.plus.bridge;
	var showlogdata = {
		// 声明异步返回方法
		showLog:function(method, args, successCallback) {
			var callbackId = this.getCallbackId(successCallback, this.errorCallback)
//               if (args != null) {
//                    args.unshift(callbackId)
//                  } else {
//                    var args = [callbackId]
//                  }

              	// 通知Native层plugintest扩展插件运行”PluginTestFunction”方法
			return B.exec(_SHOWDATA, method,[callbackId,args]);
		},
		/**
		 * 得到id
		 * @param {Object} successCallback
		 */
		getCallbackId:function(successCallback) {
			var success = typeof successCallback !== 'function' ? null : function(args) {
				successCallback(args)
			}
			return B.callbackId(success, this.errorCallback)
		},
		/**
		 * 错误回调
		 * @param {Object} errorMsg
		 */
		errorCallback:function(errorMsg) {
			console.log('Javascript callback error: ' + errorMsg)
		},
		/**
		 * 调用Android
		 * @param {Object} name
		 */
		erromsg:function(name) {
			this.showLog('erromsg', name, null);
		},
		removedata:function () {
			this.showLog('removedata',null,null);
		},
        addString:function (name) {
        	this.showLog("addString",name,null);
        },
        getStringData:function(){
          return this.showLog("getStringData",null,null);
        }

	};

	window.plus.ShowErro = showlogdata;
}, true);