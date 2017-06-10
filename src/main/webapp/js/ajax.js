$(function() {
	//同步get ajax
	function getSynchronizeAjax(url,param) {
		$.ajax({
			url : url, //（默认为当前页地址）发送请求的地址
			type : 'GET', //请求方式（post或get）默认为get
			dataType : 'json', //服务器返回的数据类型(此为返回JSON数据)
			contentType : "application/json",
			data :param,
			async : false,//同步ajax
			cache : false,//缓存
			processData : true,//为true时 通过data选项传递进来的数据，如果是一个对象(技术上讲只要不是字符串)，都会处理转化成一个查询字符串
			success : function(result) {
			},
			error : function(result) {
				alert("error");
			}
		});
	}//end
	
	//异步get ajax
	function getAsyncAjax(url,param) {
		$.ajax({
			url : url, //（默认为当前页地址）发送请求的地址
			type : 'GET', //请求方式（post或get）默认为get
			dataType : 'json', //服务器返回的数据类型(此为返回JSON数据)
			contentType : "application/json",
			data :param,
			async : true,//同步ajax
			cache : false,//缓存
			processData : true,//为true时 通过data选项传递进来的数据，如果是一个对象(技术上讲只要不是字符串)，都会处理转化成一个查询字符串
			success : function(result) {
				return restult;
			},
			error : function(result) {
				alert("error");
			}
		});
	}//end
	
	//同步post ajax
	function postSynchronizeAjax(url,params) {
		var param = JSON.stringify(params);
		$.ajax({
			url : url, //（默认为当前页地址）发送请求的地址
			type : 'POST', //请求方式（post或get）默认为get
			dataType : 'json', //服务器返回的数据类型(此为返回JSON数据)
			contentType : "application/json",
			data :param,
			async : false,//同步ajax
			cache : false,//缓存
			processData : true,//为true时 通过data选项传递进来的数据，如果是一个对象(技术上讲只要不是字符串)，都会处理转化成一个查询字符串
			success : function(result) {
				return restult;
			},
			error : function(result) {
				alert("error");
			}
		});
	}//end
	
	//异步post ajax
	function postAsyncAjax(url,params) {
		var param = JSON.stringify(params);
		$.ajax({
			url : url, //（默认为当前页地址）发送请求的地址
			type : 'POST', //请求方式（post或get）默认为get
			dataType : 'json', //服务器返回的数据类型(此为返回JSON数据)
			contentType : "application/json",
			data :param,
			async : true,//同步ajax
			cache : false,//缓存
			processData : true,//为true时 通过data选项传递进来的数据，如果是一个对象(技术上讲只要不是字符串)，都会处理转化成一个查询字符串
			success : function(result) {
				return restult;
			},
			error : function(result) {
				alert("error");
			}
		});
	}//end
	
	//同步 Security框架拦截 post ajax
	function getSecuritySynchronizeAjax(url,params) {
		var param = JSON.stringify(params);
		var token ='${_csrf.token}';
		var key = '${_csrf.parameterName}';
		$.ajax({
			url : url+'?'+key+'='+token , //（默认为当前页地址）发送请求的地址
			type : 'POST', //请求方式（post或get）默认为get
			dataType : 'json', //服务器返回的数据类型(此为返回JSON数据)
			contentType : "application/json",
			data :param,
			async : false,//同步ajax
			cache : false,//缓存
			processData : true,//为true时 通过data选项传递进来的数据，如果是一个对象(技术上讲只要不是字符串)，都会处理转化成一个查询字符串
			success : function(result) {
				return restult;
			},
			error : function(result) {
				alert("error");
			}
		});
	}//end
	
	//异步 Security框架拦截 post ajax
	function getSecurityAsyncAjax(url,params) {
		var param = JSON.stringify(params);
		var token ='${_csrf.token}';
		var key = '${_csrf.parameterName}';
		$.ajax({
			url : url+'?'+key+'='+token, //（默认为当前页地址）发送请求的地址
			type : 'POST', //请求方式（post或get）默认为get
			dataType : 'json', //服务器返回的数据类型(此为返回JSON数据)
			contentType : "application/json",
			data :param,
			async : true,//同步ajax
			cache : false,//缓存
			processData : true,//为true时 通过data选项传递进来的数据，如果是一个对象(技术上讲只要不是字符串)，都会处理转化成一个查询字符串  原为processData : false
			success : function(result) {
				return restult;
			},
			error : function(result) {
				alert("error");
			}
		});
	}//end
})