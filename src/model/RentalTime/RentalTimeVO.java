package model.RentalTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.StoreInformation.StoreInformationVO;

public class RentalTimeVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int storeId;
	private StoreInformationVO storeInformation;
	private Date monStart;
	private Date monEnd;
	private Date tueStart;
	private Date tueEnd;
	private Date wedStart;
	private Date wedEnd;
	private Date thuStart;
	private Date thuEnd;
	private Date friStart;
	private Date friEnd;
	private Date satStart;
	private Date satEnd;
	private Date sunStart;
	private Date sunEnd;

	public RentalTimeVO() {
	}

	public RentalTimeVO(StoreInformationVO storeInformation) {
		this.storeInformation = storeInformation;
	}

	public RentalTimeVO(StoreInformationVO storeInformation, Date monStart,
			Date monEnd, Date tueStart, Date tueEnd, Date wedStart,
			Date wedEnd, Date thuStart, Date thuEnd, Date friStart,
			Date friEnd, Date satStart, Date satEnd, Date sunStart, Date sunEnd) {
		this.storeInformation = storeInformation;
		this.monStart = monStart;
		this.monEnd = monEnd;
		this.tueStart = tueStart;
		this.tueEnd = tueEnd;
		this.wedStart = wedStart;
		this.wedEnd = wedEnd;
		this.thuStart = thuStart;
		this.thuEnd = thuEnd;
		this.friStart = friStart;
		this.friEnd = friEnd;
		this.satStart = satStart;
		this.satEnd = satEnd;
		this.sunStart = sunStart;
		this.sunEnd = sunEnd;
	}

	@Override
	public String toString() {
		String temp = null;
		if (this.monStart != null) {
			temp = sdf.format(this.monStart);
			this.monStart = RentalTimeVO.convertDate(temp);
		}
		if (this.monEnd != null) {
			temp = sdf.format(this.monEnd);
			this.monEnd = RentalTimeVO.convertDate(temp);
		}
		if (this.tueStart != null) {
			temp = sdf.format(this.tueStart);
			this.tueStart = RentalTimeVO.convertDate(temp);
		}
		if (this.tueEnd != null) {
			temp = sdf.format(this.tueEnd);
			this.tueEnd = RentalTimeVO.convertDate(temp);
		}
		if (this.wedStart != null) {
			temp = sdf.format(this.wedStart);
			this.wedStart = RentalTimeVO.convertDate(temp);
		}
		if (this.wedEnd != null) {
			temp = sdf.format(this.wedEnd);
			this.wedEnd = RentalTimeVO.convertDate(temp);
		}
		if (this.thuStart != null) {
			temp = sdf.format(this.thuStart);
			this.thuStart = RentalTimeVO.convertDate(temp);
		}
		if (this.thuEnd != null) {
			temp = sdf.format(this.thuEnd);
			this.thuEnd = RentalTimeVO.convertDate(temp);
		}
		if (this.friStart != null) {
			temp = sdf.format(this.friStart);
			this.friStart = RentalTimeVO.convertDate(temp);
		}
		if (this.friEnd != null) {
			temp = sdf.format(this.friEnd);
			this.friEnd = RentalTimeVO.convertDate(temp);
		}
		if (this.satStart != null) {
			temp = sdf.format(this.satStart);
			this.satStart = RentalTimeVO.convertDate(temp);
		}
		if (this.satEnd != null) {
			temp = sdf.format(this.satEnd);
			this.satEnd = RentalTimeVO.convertDate(temp);
		}
		if (this.sunStart != null) {
			temp = sdf.format(this.sunStart);
			this.sunStart = RentalTimeVO.convertDate(temp);
		}
		if (this.sunEnd != null) {
			temp = sdf.format(this.sunEnd);
			this.sunEnd = RentalTimeVO.convertDate(temp);
		}

		return "[" + storeId + "," + monStart + "," + monEnd + "," + tueStart
				+ "," + tueEnd + "," + wedStart + "," + wedEnd + "," + thuStart
				+ "," + thuEnd + "," + friStart + "," + friEnd + "," + satStart
				+ "," + satEnd + "," + sunStart + "," + sunStart + "]";
	}

	private static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

	public static int convertInt(String data) {
		int result = 0;
		try {
			result = Integer.parseInt(data);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			result = -1000;
		}
		return result;
	}

	public static java.util.Date convertDate(String data) {
		java.util.Date result = null;
		try {
			result = sdf.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
			result = new java.util.Date(0);
		}
		return result;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public StoreInformationVO getStoreInformation() {
		return this.storeInformation;
	}

	public void setStoreInformation(StoreInformationVO storeInformation) {
		this.storeInformation = storeInformation;
	}

	public Date getMonStart() {
		return this.monStart;
	}

	public void setMonStart(Date monStart) {
		this.monStart = monStart;
	}

	public Date getMonEnd() {
		return this.monEnd;
	}

	public void setMonEnd(Date monEnd) {
		this.monEnd = monEnd;
	}

	public Date getTueStart() {
		return this.tueStart;
	}

	public void setTueStart(Date tueStart) {
		this.tueStart = tueStart;
	}

	public Date getTueEnd() {
		return this.tueEnd;
	}

	public void setTueEnd(Date tueEnd) {
		this.tueEnd = tueEnd;
	}

	public Date getWedStart() {
		return this.wedStart;
	}

	public void setWedStart(Date wedStart) {
		this.wedStart = wedStart;
	}

	public Date getWedEnd() {
		return this.wedEnd;
	}

	public void setWedEnd(Date wedEnd) {
		this.wedEnd = wedEnd;
	}

	public Date getThuStart() {
		return this.thuStart;
	}

	public void setThuStart(Date thuStart) {
		this.thuStart = thuStart;
	}

	public Date getThuEnd() {
		return this.thuEnd;
	}

	public void setThuEnd(Date thuEnd) {
		this.thuEnd = thuEnd;
	}

	public Date getFriStart() {
		return this.friStart;
	}

	public void setFriStart(Date friStart) {
		this.friStart = friStart;
	}

	public Date getFriEnd() {
		return this.friEnd;
	}

	public void setFriEnd(Date friEnd) {
		this.friEnd = friEnd;
	}

	public Date getSatStart() {
		return this.satStart;
	}

	public void setSatStart(Date satStart) {
		this.satStart = satStart;
	}

	public Date getSatEnd() {
		return this.satEnd;
	}

	public void setSatEnd(Date satEnd) {
		this.satEnd = satEnd;
	}

	public Date getSunStart() {
		return this.sunStart;
	}

	public void setSunStart(Date sunStart) {
		this.sunStart = sunStart;
	}

	public Date getSunEnd() {
		return this.sunEnd;
	}

	public void setSunEnd(Date sunEnd) {
		this.sunEnd = sunEnd;
	}

}
