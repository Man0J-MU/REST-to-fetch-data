package com.demo.manoj;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien 
{
	private String Name;
	private int Id;
	private int Points;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getPoints() {
		return Points;
	}
	public void setPoints(int points) {
		Points = points;
	}
	@Override
	public String toString() {
		return "Alien [Name=" + Name + ", Id=" + Id + ", Points=" + Points + "]";
	}
	
}
