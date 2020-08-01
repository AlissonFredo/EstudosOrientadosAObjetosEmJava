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
		super();
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
		 * a diferença entre datas em milisegundos*/
		long diff = checkOut.getTime() - checkIn.getTime();
		
		/*nesta linha a diferença de milisegungo que esta armazenada no 
		 * diff é convertida em dias*/
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void update(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public String toString() {
		return "Room " + roomNumber
				+ ", check-in: " + simpleDateFormat.format(checkIn)
				+ ", check-out: " + simpleDateFormat.format(checkOut)
				+ ", " + duration();
	}
}
