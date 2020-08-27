package lesson7.task24;

public class TimeInterval {

	private int seconds;
	private int minutes;
	private int hours;

	public TimeInterval(int seconds) {
		super();
		this.seconds = seconds % 60;
		this.minutes = (seconds / 60) % 60;
		this.hours = seconds / 60 / 60;
	}

	public TimeInterval(int seconds, int minutes, int hours) {
		super();
		this.seconds = seconds;
		this.minutes = minutes;
		this.hours = hours;
	}

	public int timeInSeconds() {
		return hours * 60 * 60 + minutes * 60 + seconds;
	}

	public int compareTo(TimeInterval another) {
		if (timeInSeconds() > another.timeInSeconds()) {
			return 1;
		} else if (timeInSeconds() == another.timeInSeconds()) {
			return 0;
		} else
			return -1;
	}

	public void printTime() {
		System.out.println("Время: " + hours + " часов " + minutes + " минут " + seconds + " секунд.");
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

}
