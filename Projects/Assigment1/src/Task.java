
public class Task {

	private User assignee;

	private int priority;

	private String status;

	private double estimateTime;

	private User reporter;

	private int burndown;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getEstimateTime() {
		return estimateTime;
	}

	public void setEstimateTime(double estimateTime) {
		this.estimateTime = estimateTime;
	}

	public User getAssignee() {
		return assignee;
	}

	public void setAssignee(User assignee) {
		this.assignee = assignee;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public User getReporter() {
		return reporter;
	}

	public void setReporter(User reporter) {
		this.reporter = reporter;
	}

	public int getBurndown() {
		return burndown;
	}

	public void setBurndown(int burndown) {
		this.burndown = burndown;
	}

}
