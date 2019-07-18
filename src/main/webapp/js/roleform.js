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
				let ancestorTag = $(parentDIV).parent().parent().find(
						'legend input');
				let parentTagName = $(parentDIV).parent()[0].tagName;
				if (!data.elem.checked) {
					let brotherArray = $(parentDIV).parent().find(
					'.layui-input-block>input');
					if ('DIV' == parentTagName) {
						/*三级节点*/
						let ancestorArray = $(parentDIV).parent().parent()
								.find('>.layui-input-block>input');

						let hasBrotherCheck = false;
						$.each(brotherArray, function(i, item) {
							if (item.checked) {
								hasBrotherCheck = true;
								return false;
							}
						});
						/* 判断兄弟节点是否有选中 */
						if (!hasBrotherCheck) {
							$(parentDIV).parent().find('>input').prop(
									"checked", false);

							let ancestorCheck = false;
							$.each(ancestorArray, function(i, item) {
								if (item.checked) {
									ancestorCheck = true;
									return false;
								}
							});
							/* 判断父节点的兄弟节点是否有选中 */
							if (!ancestorCheck) {
								$(parentDIV).parent().parent().find(
										'legend input').prop("checked", false);
							}
						}
					} else {
						/*二级节点*/
						let hasBrotherCheck = false;
						$.each(brotherArray, function(i, item) {
							if (item.checked) {
								hasBrotherCheck = true;
								return false;
							}
						});
						/* 判断兄弟节点是否有选中 */
						if (!hasBrotherCheck) {
							$(parentDIV).parent().find('legend input').prop(
									"checked", false);
						}
					}
				} else {
					if ('DIV' == parentTagName) {
						$(parentTag).prop("checked", true);
						$(ancestorTag).prop("checked", true);
					} else {
						$(parentDIV).parent().find('legend input').prop(
								"checked", true);
					}
				}
			} else {
				/* 有子节点 */
				let childrenArray = $(parentDIV).find('input');
				if (!data.elem.checked) {
					$.each(childrenArray, function(i, item) {
						$(item).prop("checked", false);
					});

					let hasCheck = false;
					let brotherArray = $(parentDIV).parent().find(
							'.layui-input-block>input');
					$.each(brotherArray, function(i, item) {
						if (item.checked) {
							hasCheck = true;
							return false;
						}
					});
					if (!hasCheck) {
						$(parentDIV).parent().find('legend input').prop(
								"checked", false);
					}

				} else {
					$.each(childrenArray, function(i, item) {
						$(item).prop("checked", true);
					});
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