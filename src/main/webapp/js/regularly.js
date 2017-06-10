$(function() {
	// 是否为正整数
	function isPositiveNum(obj) {
		var re = /^[0-9]*[1-9][0-9]*$/;
		return re.test(obj)
	} // end

	//验证非空
	function checkNonNull(obj) {
		var res = true;
		if (obj == "") {
			res = false;
		}
		if (obj == undefined) {
			res = false;
		}
		return res;
	}//end
	
	//验证手机号正则
	function checkPhoneNumber(obj) {
		var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(17[0-9]{1}))+\d{8})$/;
		return myreg.test(obj);
	}//end
})