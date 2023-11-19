import java.math.BigDecimal;

public class Account extends Product {
	private BigDecimal count;

	public BigDecimal getCount() {
		return count;
	}

	public void setCount(BigDecimal count) {
		this.count = count;
	}
}
