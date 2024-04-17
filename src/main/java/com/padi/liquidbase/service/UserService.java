package com.padi.liquidbase.service;


import com.padi.liquidbase.domain.User;
import com.padi.liquidbase.dto.CreateUserDto;
import com.padi.liquidbase.dto.EditUserDto;

public interface UserService {

  /**
   * finds a user by an ID
   * @param id users id
   * @return user the has the id
   */
  User findById(String id);

  /**
   * creates a new user
   * @param createUserDto user details to create the use
   * @return a User that has been created
   */
  User create(CreateUserDto createUserDto);

  /**
   * Edit or Update a user details
   * @param editUserDto user to be edited details
   * @return a user that has been edited
   */
  User edit(EditUserDto editUserDto);

  /**
   * Deletes a user
   * @param id user id to used to delete the user
   * @return a message of the deletion performed
   */
  String delete(String id);
}
