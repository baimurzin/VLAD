package ru.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.learn.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
