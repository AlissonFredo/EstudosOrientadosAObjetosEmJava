package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		
		/*checkOut.getTime() - checkIn.getTime(); com este codigo voce pega 
		 * a diferen�a entre datas em milisegundos*/
		long diff = checkOut.getTime() - checkIn.getTime();
		
		/*nesta linha a diferen�a de milisegungo que esta armazenada no 
		 * diff � convertida em dias*/
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public String update(Date checkIn, Date checkOut) {
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			return "Error in reservation: reservation dates for update must be future dates";
		}
		if(!checkOut.after(checkIn)) {
			return "Error in reservation: check-out date must be after check-in date";
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null; 
	}
	
	public String toString() {
		return "Room " + roomNumber
				+ ", check-in: " + simpleDateFormat.format(checkIn)
				+ ", check-out: " + simpleDateFormat.format(checkOut)
				+ ", " + duration();
	}
}
