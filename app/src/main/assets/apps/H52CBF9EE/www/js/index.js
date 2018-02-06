/**
 * 调用方法
 */
$("#addHorn").click(function () {

	plus.ShowErro.erro(2);
});
/**
 * 删除方法
 */
$("#removeHorn").click(function () {
		console.log("2222");
	plus.ShowErro.removedata();
})
/**
 * 添加数据
 */
$("#addString").click(function () {
	plus.ShowErro.addString("小米，欢迎来到miui10");
})
/**
 * 获取Android中的数据
 */
$("#getString").click(function () {
	plus.ShowErro.getStringData();

//    $("#getStr").text("测试"+str.RetArgu1+str.RetArgu2);
})
pluginGetStringArrayArgu=function () {
	var Argus = plus.plugintest.PluginTestFunctionSyncArrayArgu(["Html5", "Plus", "SyncFunction", "ArrayArgument!"]);
	alert(Argus.RetArgu1 + "_" + Argus.RetArgu2 + "_" + Argus.RetArgu3 + "_" + Argus.RetArgu4);
}
getIntData=function (){
    var array=plus.plugintest.getIntData();
     alert(array.One+"//"+array.Two+"//"+array.Three+"//"+array.Four);
}
getbooleanData=function(){
     alert(plus.plugintest.getbooleanData());

}