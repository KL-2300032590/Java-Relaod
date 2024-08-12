package decoratorPattern;

abstract class IceCreamDecorator  implements IceCream
{
    protected IceCream c;
    protected IceCreamDecorator(IceCream c)
    {
    	this.c=c;
    }
    @Override
	public double getCost() {
		// TODO Auto-generated method stub
		return c.getCost();
	}

	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return c.getDetail();
	}
}
