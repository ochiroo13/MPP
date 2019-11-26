package prob2B;

import java.util.List;

public class Order {

	private int orderNum;

	private List<OrderLine> listOrderLine;

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public List<OrderLine> getListOrderLine() {
		return listOrderLine;
	}

	public void setListOrderLine(List<OrderLine> listOrderLine) {
		this.listOrderLine = listOrderLine;
	}

}
