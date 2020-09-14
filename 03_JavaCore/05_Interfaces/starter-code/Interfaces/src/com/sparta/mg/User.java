package com.sparta.mg;

public interface User {

	String SQL_SELECT_ALL = "SELECT * FROM USER";

	void addUser(User user);

	boolean deleteUser();

	User getUser(String id);

	boolean updateUser(User user);

}