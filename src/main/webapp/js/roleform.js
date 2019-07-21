/*菜单只有三级*/
layui.define([ 'form', 'element' ], function(exports) {
	var $ = layui.$, form = layui.form, element = layui.element;
	form.on('checkbox(checkedListener)', function(data) {
		let parentDIV = $(this).parent()[0];
		switch (parentDIV.tagName) {
		case 'DIV':
			/*二级或三级节点*/
			if ($(parentDIV).has('.layui-input-block').length == 0) {
				/* 没有子节点 */
				let parentTag = $(parentDIV).parent().find('>input');
				let ancestorTag = $(parentDIV).parent().parent().find('legend input');
				let parentTagName = $(parentDIV).parent()[0].tagName;
				if (!data.elem.checked) {
					if ('DIV' == parentTagName) {
						/*三级节点*/
						if($(parentDIV).siblings().find('>input:checked').size()==0){
							/*设置父节点反选*/
							$(parentDIV).parent().find('>input').prop('checked', false);
							if($(parentDIV).parent().parent().find('.layui-input-block>input:checked').size()==0){
								/*设置祖父节点反选*/
								$(parentDIV).parent().parent().find('legend input').prop('checked', false);
							}
						}
						
					} else {
						/*二级节点*/
						if($(parentDIV).parent().find('.layui-input-block>input:checked').size()==0){
							/*设置父节点反选*/
							$(parentDIV).parent().find('legend input').prop('checked', false);
						}
					}
				} else {
					if ('DIV' == parentTagName) {
						/*三级节点*/
						/*设置父节点选中*/
						$(parentTag).prop("checked", true);
						/*设置祖父节点选中*/
						$(ancestorTag).prop("checked", true);
					} else {
						/*二级节点*/
						/*设置父节点选中*/
						$(parentDIV).parent().find('legend input').prop(
								"checked", true);
					}
				}
			} else {
				/* 有子节点 */
				/*二级节点*/
				let childrenArray = $(parentDIV).find('.layui-input-block input');
				if (!data.elem.checked) {
					/*设置子节点反选*/
					$.each(childrenArray, function(i, item) {
						$(item).prop("checked", false);
					});
					/*设置父节点反选*/
					if($(parentDIV).parent().find('.layui-input-block>input:checked').size()==0){
						$(parentDIV).parent().find('legend input').prop('checked', false);
					}

				} else {
					/*设置子节点选中*/
					$.each(childrenArray, function(i, item) {
						$(item).prop("checked", true);
					});
					/*设置父节点选中*/
					$(parentDIV).parent().find('legend input').prop("checked",
							true);
				}
			}
			break;
		case 'LEGEND':
			/*顶级节点*/
			let childrenArray = $(parentDIV).parent().find('input');
			if (!data.elem.checked) {
				$.each(childrenArray, function(i, item) {
					$(item).prop("checked", false);
				});
			} else {
				$.each(childrenArray, function(i, item) {
					$(item).prop("checked", true);
				});
			}
			break;
		}
		form.render();
	});
	exports('roleform', {});
});