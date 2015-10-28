
public class Client {

	public static void main(String args[]) {
		ConcreteStrategyOne concreteStrategyOne = new ConcreteStrategyOne();
		ConcreteStrategyTwo concreteStrategyTwo = new ConcreteStrategyTwo();
		ConcreteStrategyThree concreteStrategyThree = new ConcreteStrategyThree();
		Context context = new Context(concreteStrategyOne);
		//context.setStrategy(concreteStrategyTwo);
		context.algorithm();
	}
}

//注意：策略模式就是将算法封装出来，把算法的运行和实现分开。
