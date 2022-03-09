package org.ada.school.user.repository;
import org.ada.school.user.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository <User, Long>
{
// User findById(String id);
    User save (User user);

    User findById(String id);


}

