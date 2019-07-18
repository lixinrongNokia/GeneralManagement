/**
 * 项目JS主入口 以依赖layui的layer和form模块为例
 */
layui.define([ 'layer', 'form' ], function(exports) {
	var $ = layui.$, layer = layui.layer, form = layui.form;
	let table = layui.data('loginData');
	let username = table.username;
	let password = table.password;
	let remember = table.remember;

	readData();
	/* 监听提交按钮 */
	form.on('submit(LAY-user-login-submit)', function(obj) {
		let data = obj.field;
		if (data.username != username || data.password != password) {
			obj.field.password = hex_md5(obj.field.password);
		}

		$.ajax({
			url : webRoot + '/user/checklogin',
			data : obj.field,
			dataType : 'json',
			success : function(res) {
				if (res.result_code && res.return_code) {
					inputData(data);
					toastANDRedirect('登录成功', webRoot + '/sys/home');
				} else {
					toastErr(res.msg);
				}
			}
		});

	});
	/* 监听勾选 */
	form.on('checkbox(remember)', function(data) {
		var isChecked = data.elem.checked;
		$('#remember').val(isChecked);
		if (!isChecked) {
			layui.data('loginData', {
				key : 'username',
				remove : true
			});
			layui.data('loginData', {
				key : 'password',
				remove : true
			});
			layui.data('loginData', {
				key : 'remember',
				remove : true
			});
		}
	});
	/* 写入本地存储 */
	function inputData(obj) {
		let isChecked = $('#remember').val();
		if ('true' == isChecked) {
			layui.data('loginData', {
				key : 'username',
				value : obj.username
			});
			layui.data('loginData', {
				key : 'password',
				value : obj.password
			});
			layui.data('loginData', {
				key : 'remember',
				value : true
			});
		}
	}
	/* 读取本地存储 */
	function readData() {
		if (remember) {
			$('#remember').val(true);
			$('#username').val(table.username);
			$('#password').val(table.password);
			$('#remember').prop('checked', true);
			form.render();
		}
	}

	exports('login', {});
});