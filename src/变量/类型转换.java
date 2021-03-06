package 变量;

public class 类型转换 {
	public static void main() {

//	转换规则
		/**
		 * 转换规则如图所示 精度高的数据类型就像容量大的杯子，可以放更大的数据 精度低的数据类型就像容量小的杯子，只能放更小的数据
		 * 小杯子往大杯子里倒东西，大杯子怎么都放得下 大杯子往小杯子里倒东西，有的时候放的下，有的时候就会有溢出 需要注意的一点是
		 * 虽然short和char都是16位的，长度是一样的 但是彼此之间，依然需要进行强制转换
		 */

		char c = 'A';
		short s = 80;
//	 虽然short和char都是16位的，长度是一样的但是彼此之间，依然需要进行强制转换
		c = (char) s;
		// 进行直接转换，会出现编译错误
//	s = c ;

		/**
		 * l 是long类型的，其类型长度是64位 i 是int类型的，其类型长度是32位 所以l的精度，比i的精度要高 l = i; 把i的值赋给l，
		 * 首先l和i彼此的类型是不一样的，那么能否转换就取决于彼此的精度 这个例子，是低精度向高精度转换 是可以正常转换的
		 * 换句话说，int比较小，要放进比较大的long,随便怎么样，都放的进去
		 */
		long l = 50;
		int i = 50;
		//int比较小，要放进较大的long，随便怎么样，都放得进去
		l = i;
		
		
	}
}
