package TP03.partie1.ex01;

import TP03.partie1.ex01.User;
import TP03.partie1.ex01.UserRepository;
import TP03.partie1.ex01.UserService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testGetUserById() {
        UserRepository mockRepository = mock(UserRepository.class);
        User user_test = new User(1, "John Doe");
        when(mockRepository.findUserById(1)).thenReturn(user_test);
        UserService userService = new UserService(mockRepository);
        User retrievedUser = userService.getUserById(1);
        verify(mockRepository).findUserById(1);
    }
}