package io.bootify.base_datos_n_o_s_q_l.users.repos;

import io.bootify.base_datos_n_o_s_q_l.users.domain.Users;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UsersRepository extends MongoRepository<Users, Integer> {
}
