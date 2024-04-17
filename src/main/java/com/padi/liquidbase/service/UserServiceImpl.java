package com.padi.liquidbase.service;



import com.padi.liquidbase.domain.User;
import com.padi.liquidbase.dto.CreateUserDto;
import com.padi.liquidbase.dto.EditUserDto;
import com.padi.liquidbase.error.OkException;
import com.padi.liquidbase.repo.UserRepo;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

  private final UserRepo userRepo;

  @Override
  public User findById(String id) {
    return userRepo.findById(id).orElseThrow(()->
        new OkException(404, "User not found with" + id));
  }

  @Override
  public User create(CreateUserDto createUserDto) {
    User user = new User();
    user.setName(createUserDto.getName());
    user.setDateOfBirth(LocalDateTime.parse(createUserDto.getDateOfBirth()));
    return userRepo.save(user);
  }

  @Override
  public User edit(EditUserDto editUserDto) {
    User user = findById(editUserDto.getId());

    user.setName(editUserDto.getName());
    user.setDateOfBirth(LocalDateTime.parse(editUserDto.getDateOfBirth()));
    return userRepo.save(user);
  }

  @Override
  public String delete(String id) {

    userRepo.deleteById(id);

    if (userRepo.existsById(id)){
      throw new OkException(501, "Deletion failed for " + id);
    }

    return "Success";
  }
}
