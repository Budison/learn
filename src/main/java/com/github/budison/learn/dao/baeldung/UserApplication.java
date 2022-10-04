package com.github.budison.learn.dao.baeldung;

import java.util.Optional;

/**
 * @author Kevin Nowak
 */
class UserApplication {

    private static DAO<User> userDAO;

    public static void main(String[] args) {
        userDAO = new UserDAO();

        User user1 = getUser(0);
        System.out.println(user1.getName());
        userDAO.update(user1, new String[]{"Jake", "jake@domain.com"});

        User user2 = getUser(1);
        userDAO.delete(user2);
        userDAO.save(new User("Julie", "julie@domain.com"));

        userDAO.getAll().forEach(user -> System.out.println(user.getName()));
    }

    private static User getUser(long id) {
        Optional<User> user = userDAO.get(id);
        return user.orElseGet(() -> new User("non-existing user", "no-email"));
    }
}
