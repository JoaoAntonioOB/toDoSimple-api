package com.joaoBarroso.todosimple.repositories;


import com.joaoBarroso.todosimple.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
