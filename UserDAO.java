package JDBCCurdOperations2;


import java.util.List;

public interface UserDAO {
	void addUser(User user);
	User getUserById(int id);
	List<User> getAllUsers();
	void updateUser(User user);
	void deleteUser(int id);
}
