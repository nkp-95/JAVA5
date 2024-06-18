package lambda;

@FunctionalInterface //하나만 쓸수 있게 막아줌
public interface MyNumber {                 //BinayOpertor(stream 이랑 비교)
	int getMax(int num1, int num2);               //  apply(stream 이랑 비교)
	//int add(int num1, int num2);  // 막힘
}
