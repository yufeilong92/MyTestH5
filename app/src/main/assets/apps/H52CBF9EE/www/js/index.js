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
	var str= plus.ShowErro.getStringData();
	$("#getStr").text("测试结果："+str);
})