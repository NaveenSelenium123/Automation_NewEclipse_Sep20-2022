package junitgreenstask8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel1 {
	WebDriver driver;
	public SearchHotel1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement numberOfRooms;
	@FindBy(id="adult_room")
	private WebElement adultPerRoom;
	@FindBy(id="child_room")
	private WebElement childrenPerRoom;
	@FindBy(id="Submit")
	private WebElement search;
	
	public void setLocation(String value) {
		Select s =new Select(location);
		s.selectByVisibleText(value);
		//s.selectByIndex(value);	
	}
	public void setHotels(int value) {
		Select s =new Select(hotels);
           s.selectByIndex(value);	
	}
  public void setRoomType(int value) {
		Select s =new Select(roomType);
		s.selectByIndex(value);	
	}
	public void setNumberOfRooms(int value) {
		Select s =new Select(numberOfRooms);
		s.selectByIndex(value);	
	}
public void setAdultPerRoom(int value) {
		Select s =new Select(adultPerRoom);
		s.selectByIndex(value);	
	}
	public void setChildrenPerRoom(int value) {
		Select s =new Select(childrenPerRoom);
		s.selectByIndex(value);	
	}
	public void setSearch() {
		search.click();	
	}
	
	

}
