$(function() {
	// 标准时间类型字符串转化为时间戳
	function StringParseTimeStamp(obj) {
		return Date.parse(new Date(obj));
	}// end

	// 计算两个参数之间的时间差
	function calculationTime(start, end) {
		// 判断是否要进行取绝对值还是要求正整数
		var timeStamp = Math.abs(Date.parse(end) - Date.parse(start));

		var timeDifference = timeStamp / (1000 * 60 * 60);
		var arr = timeDifference.toString().split('.');//使用toString()方法转化为String类型才可以操作
		var harf = arr[1].slice(0, 1);
		var date = arr[0];
		if (harf >= 5) {
			date = arr[0] + "." + 5;
		}
		return date;
	}//end
})